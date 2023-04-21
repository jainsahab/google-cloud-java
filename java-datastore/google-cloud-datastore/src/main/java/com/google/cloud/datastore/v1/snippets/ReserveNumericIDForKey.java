package com.google.cloud.datastore.v1.snippets;

import com.google.cloud.datastore.v1.DatastoreClient;
import com.google.datastore.v1.AllocateIdsRequest;
import com.google.datastore.v1.AllocateIdsResponse;
import com.google.datastore.v1.Key;
import com.google.datastore.v1.Key.PathElement;
import com.google.datastore.v1.PartitionId;
import java.io.IOException;

public class ReserveNumericIDForKey {

  public static void main(String[] args) throws IOException {
    String projectId = "jainsahab-feature-development";
    PartitionId partitionId = PartitionId.newBuilder()
        .setProjectId(projectId)
        .build();
    PathElement pathElement = PathElement.newBuilder().setKind("Task")
        .setId(4567890)
        .build();
    Key key = Key.newBuilder()
        .setPartitionId(partitionId)
        .addPath(pathElement)
        .build();
    AllocateIdsRequest allocateIdsRequest = AllocateIdsRequest.newBuilder()
        .addKeys(key)
        .setProjectId(projectId)
        .build();

    try (DatastoreClient datastoreClient = DatastoreClient.create()) {
      AllocateIdsResponse allocateIdsResponse = datastoreClient.allocateIds(allocateIdsRequest);
      for (Key aKey : allocateIdsResponse.getKeysList()) {
        System.out.println(aKey);
      }
    }
  }

}
