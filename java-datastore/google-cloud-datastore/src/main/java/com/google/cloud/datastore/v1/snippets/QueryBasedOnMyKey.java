package com.google.cloud.datastore.v1.snippets;

import com.google.cloud.datastore.v1.DatastoreClient;
import com.google.datastore.v1.EntityResult;
import com.google.datastore.v1.Key;
import com.google.datastore.v1.Key.PathElement;
import com.google.datastore.v1.LookupRequest;
import com.google.datastore.v1.LookupResponse;
import com.google.datastore.v1.PartitionId;
import java.io.IOException;

public class QueryBasedOnMyKey {

  public static void main(String[] args) throws IOException {
    String projectId = "jainsahab-feature-development";
    PartitionId partitionId = PartitionId.newBuilder()
        .setProjectId(projectId)
        .build();
    Key key = Key.newBuilder()
        .setPartitionId(partitionId)
        .addPath(PathElement.newBuilder().setKind("Task").setName("sampleTask").build())
        .build();

    LookupRequest lookupRequest = LookupRequest.newBuilder()
        .setProjectId(projectId)
        .addKeys(key)
        .build();
    try (DatastoreClient datastoreClient = DatastoreClient.create()) {
      LookupResponse lookupResponse = datastoreClient.lookup(lookupRequest);
      for (EntityResult entityResult : lookupResponse.getFoundList()) {
        System.out.println(entityResult.getEntity());
      }

    }

  }
}
