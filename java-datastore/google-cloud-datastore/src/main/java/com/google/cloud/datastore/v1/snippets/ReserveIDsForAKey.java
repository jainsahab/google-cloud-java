package com.google.cloud.datastore.v1.snippets;

import com.google.cloud.datastore.v1.DatastoreClient;
import com.google.datastore.v1.EntityResult;
import com.google.datastore.v1.Key;
import com.google.datastore.v1.Key.PathElement;
import com.google.datastore.v1.PartitionId;
import com.google.datastore.v1.ReserveIdsRequest;
import com.google.datastore.v1.ReserveIdsResponse;
import com.google.datastore.v1.RunQueryResponse;
import java.io.IOException;
import java.util.List;

public class ReserveIDsForAKey {

  public static void main(String[] args) throws IOException {
    String projectId = "jainsahab-feature-development";
    PartitionId partitionId = PartitionId.newBuilder()
        .setProjectId(projectId)
        .build();

    // reserving a string ID
    Key key = Key.newBuilder()
        .setPartitionId(partitionId)
        .addPath(PathElement.newBuilder().setKind("Task").setName("name").build())
        .build();

    // reserving a numeric ID
    Key key2 = Key.newBuilder()
        .setPartitionId(partitionId)
        .addPath(PathElement.newBuilder().setKind("Task").setId(10).build())
        .build();

    ReserveIdsRequest reserveIdRequest = ReserveIdsRequest.newBuilder()
        .addKeys(key)
        .addKeys(key2)
        .setProjectId(projectId)
        .build();

    try (DatastoreClient datastoreClient = DatastoreClient.create()) {
      datastoreClient.reserveIds(reserveIdRequest);
    }
  }
}
