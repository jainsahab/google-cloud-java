package com.google.cloud.datastore.v1.snippets;

import com.google.api.core.ApiFuture;
import com.google.cloud.datastore.v1.DatastoreClient;
import com.google.datastore.v1.AggregationQuery;
import com.google.datastore.v1.AggregationQuery.Aggregation;
import com.google.datastore.v1.AggregationQuery.Aggregation.Count;
import com.google.datastore.v1.AggregationResult;
import com.google.datastore.v1.Filter;
import com.google.datastore.v1.PartitionId;
import com.google.datastore.v1.PropertyFilter;
import com.google.datastore.v1.PropertyFilter.Operator;
import com.google.datastore.v1.PropertyReference;
import com.google.datastore.v1.Query;
import com.google.datastore.v1.ReadOptions;
import com.google.datastore.v1.RunAggregationQueryRequest;
import com.google.datastore.v1.RunAggregationQueryResponse;
import com.google.datastore.v1.Value;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CountEntitiesWhichMatchesFilterAsync {

  public static void main(String[] args) throws IOException, InterruptedException {
    try (DatastoreClient datastoreClient = DatastoreClient.create()) {
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

      RunAggregationQueryRequest request =
          RunAggregationQueryRequest.newBuilder()
              .setProjectId("jainsahab-feature-development")
              .setPartitionId(PartitionId.newBuilder().build())
              .setReadOptions(ReadOptions.newBuilder().build())
              .setAggregationQuery(aggregationQuery)
              .build();


      ApiFuture<RunAggregationQueryResponse> future = datastoreClient.runAggregationQueryCallable().futureCall(request);
      System.out.println("call triggered");
      ExecutorService executor = Executors.newFixedThreadPool(2);
      future.addListener(() -> {
        RunAggregationQueryResponse response = null;
        try {
          response = future.get();
        } catch (InterruptedException | ExecutionException e) {
          throw new RuntimeException(e);
        }
        AggregationResult aggregationResult = response.getBatch().getAggregationResultsList().get(0);

        long numberOfPeople = aggregationResult.getAggregatePropertiesMap().get("number_of_people")
            .getIntegerValue();
        System.out.printf("Total %d people are invited to pizza party.", numberOfPeople);
      }, executor);

      System.out.println("reached EOF");
      // TimeUnit.SECONDS.sleep(10);

    }

  }
}
