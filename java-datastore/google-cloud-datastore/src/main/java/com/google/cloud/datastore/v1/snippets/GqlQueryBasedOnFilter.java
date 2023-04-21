package com.google.cloud.datastore.v1.snippets;

import com.google.cloud.datastore.v1.DatastoreClient;
import com.google.datastore.v1.EntityResult;
import com.google.datastore.v1.GqlQuery;
import com.google.datastore.v1.Key;
import com.google.datastore.v1.Key.PathElement;
import com.google.datastore.v1.LookupRequest;
import com.google.datastore.v1.LookupResponse;
import com.google.datastore.v1.PartitionId;
import com.google.datastore.v1.RunQueryRequest;
import com.google.datastore.v1.RunQueryResponse;
import java.io.IOException;
import java.util.List;

public class GqlQueryBasedOnFilter {

  public static void main(String[] args) throws IOException {
    String projectId = "jainsahab-feature-development";
    PartitionId partitionId = PartitionId.newBuilder()
        .setProjectId(projectId)
        .build();

    GqlQuery gqlQuery = GqlQuery.newBuilder()
        .setQueryString("SELECT * FROM Task where priority = 4")
        .setAllowLiterals(true)
        .build();
    RunQueryRequest runQueryRequest = RunQueryRequest.newBuilder()
        .setProjectId(projectId)
        .setPartitionId(partitionId)
        .setGqlQuery(gqlQuery)
        .build();

    try (DatastoreClient datastoreClient = DatastoreClient.create()) {
      RunQueryResponse runQueryResponse = datastoreClient.runQuery(runQueryRequest);
      List<EntityResult> results = runQueryResponse.getBatch().getEntityResultsList();
      for (EntityResult result : results) {
        System.out.println(result.getEntity());
      }
    }

  }
}
