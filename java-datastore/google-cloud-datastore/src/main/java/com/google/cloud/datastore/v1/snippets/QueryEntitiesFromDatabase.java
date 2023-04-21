package com.google.cloud.datastore.v1.snippets;

import com.google.cloud.datastore.v1.DatastoreClient;
import com.google.datastore.v1.Entity;
import com.google.datastore.v1.EntityResult;
import com.google.datastore.v1.Filter;
import com.google.datastore.v1.PartitionId;
import com.google.datastore.v1.PropertyFilter;
import com.google.datastore.v1.PropertyFilter.Operator;
import com.google.datastore.v1.PropertyReference;
import com.google.datastore.v1.Query;
import com.google.datastore.v1.ReadOptions;
import com.google.datastore.v1.RunQueryRequest;
import com.google.datastore.v1.RunQueryResponse;
import com.google.datastore.v1.Value;
import java.io.IOException;
import java.util.List;

public class QueryEntitiesFromDatabase {

  public static void main(String[] args) throws IOException {
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
      RunQueryRequest request =
          RunQueryRequest.newBuilder()
              .setProjectId("jainsahab-feature-development")
              .setPartitionId(PartitionId.newBuilder().build())
              .setReadOptions(ReadOptions.newBuilder().build())
              .setQuery(queryBuilder)
              .build();
      RunQueryResponse response = datastoreClient.runQuery(request);

      List<EntityResult> entityResults = response.getBatch().getEntityResultsList();
      for (EntityResult entityResult : entityResults) {
        Entity entity = entityResult.getEntity();
        String name = entity.getPropertiesOrThrow("name").getStringValue();
        System.out.println(name + ", you're invited to a pizza party!");
      }
    }
  }
}
