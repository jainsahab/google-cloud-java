package com.google.cloud.datastore.v1.snippets;

import com.google.cloud.datastore.v1.DatastoreClient;
import com.google.datastore.v1.AggregationQuery;
import com.google.datastore.v1.AggregationQuery.Aggregation;
import com.google.datastore.v1.AggregationQuery.Aggregation.Count;
import com.google.datastore.v1.AggregationResult;
import com.google.datastore.v1.BeginTransactionRequest;
import com.google.datastore.v1.BeginTransactionResponse;
import com.google.datastore.v1.CommitRequest;
import com.google.datastore.v1.CommitRequest.Mode;
import com.google.datastore.v1.CommitResponse;
import com.google.datastore.v1.Entity;
import com.google.datastore.v1.EntityResult;
import com.google.datastore.v1.Filter;
import com.google.datastore.v1.PartitionId;
import com.google.datastore.v1.PropertyFilter;
import com.google.datastore.v1.PropertyFilter.Operator;
import com.google.datastore.v1.PropertyReference;
import com.google.datastore.v1.Query;
import com.google.datastore.v1.ReadOptions;
import com.google.datastore.v1.RunAggregationQueryRequest;
import com.google.datastore.v1.RunAggregationQueryResponse;
import com.google.datastore.v1.RunQueryRequest;
import com.google.datastore.v1.RunQueryResponse;
import com.google.datastore.v1.TransactionOptions;
import com.google.datastore.v1.TransactionOptions.ReadOnly;
import com.google.datastore.v1.Value;
import com.google.protobuf.ByteString;
import java.io.IOException;
import java.util.List;

public class CountAndQueryEntitiesInTransaction {

  public static void main(String[] args) throws IOException {
    try (DatastoreClient datastoreClient = DatastoreClient.create()) {
      String projectId = "jainsahab-feature-development";
      BeginTransactionResponse transactionResponse = datastoreClient.beginTransaction(
          BeginTransactionRequest.newBuilder()
              .setProjectId(projectId)
              .setTransactionOptions(
                  TransactionOptions.newBuilder()
                      .setReadOnly(ReadOnly.newBuilder().build()).build())
              .build());
      ByteString transactionId = transactionResponse.getTransaction();

      Query.Builder queryBuilder = Query.newBuilder();
      queryBuilder.addKindBuilder().setName("Person");
      queryBuilder.setFilter(
          Filter.newBuilder()
              .setPropertyFilter(
                  PropertyFilter.newBuilder()
                      .setProperty(PropertyReference.newBuilder().setName("favorite_food").build())
                      .setOp(Operator.EQUAL)
                      .setValue(Value.newBuilder().setStringValue("pizza").build())
                      .build()
              ).build());

      AggregationQuery aggregationQuery = AggregationQuery.newBuilder()
          .addAggregations(
              Aggregation.newBuilder()
                  .setCount(Count.newBuilder().build())
                  .setAlias("number_of_people")
                  .build()
          )
          .setNestedQuery(queryBuilder)
          .build();

      RunQueryRequest runQueryRequest =
          RunQueryRequest.newBuilder()
              .setProjectId(projectId)
              .setPartitionId(PartitionId.newBuilder().build())
              .setReadOptions(ReadOptions.newBuilder().setTransaction(transactionId).build())
              .setQuery(queryBuilder)
              .build();


      RunAggregationQueryRequest aggregationQueryRequest =
          RunAggregationQueryRequest.newBuilder()
              .setProjectId(projectId)
              .setPartitionId(PartitionId.newBuilder().build())
              .setReadOptions(ReadOptions.newBuilder().setTransaction(transactionId).build())
              .setAggregationQuery(aggregationQuery)
              .build();

      RunQueryResponse runQueryResponse = datastoreClient.runQuery(runQueryRequest);
      List<EntityResult> entityResults = runQueryResponse.getBatch().getEntityResultsList();
      for (EntityResult entityResult : entityResults) {
        Entity entity = entityResult.getEntity();
        String name = entity.getPropertiesOrThrow("name").getStringValue();
        System.out.println(name + ", you're invited to a pizza party!");
      }

      RunAggregationQueryResponse aggregationQueryResponse = datastoreClient.runAggregationQuery(aggregationQueryRequest);
      AggregationResult aggregationResult = aggregationQueryResponse.getBatch().getAggregationResultsList().get(0);
      long numberOfPeople = aggregationResult.getAggregatePropertiesMap().get("number_of_people")
          .getIntegerValue();
      System.out.printf("Total %d people are invited to pizza party.\n", numberOfPeople);

      CommitRequest commitRequest = CommitRequest.newBuilder()
          .setProjectId(projectId)
          .setTransaction(transactionId)
          .setMode(Mode.TRANSACTIONAL)
          .build();
      CommitResponse commit = datastoreClient.commit(commitRequest);

      System.out.printf("Transaction committed at %s", commit.getCommitTime());
    }

  }
}
