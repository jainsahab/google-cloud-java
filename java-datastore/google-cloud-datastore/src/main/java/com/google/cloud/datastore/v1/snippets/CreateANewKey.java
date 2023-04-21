package com.google.cloud.datastore.v1.snippets;

import com.google.cloud.datastore.v1.DatastoreClient;
import com.google.datastore.v1.AllocateIdsRequest;
import com.google.datastore.v1.AllocateIdsResponse;
import com.google.datastore.v1.Key;
import com.google.datastore.v1.Key.PathElement;
import com.google.datastore.v1.PartitionId;
import java.io.IOException;
import java.util.List;

public class CreateANewKey {

  public static void main(String[] args) throws IOException {
    String projectId = "jainsahab-feature-development";
    PartitionId partitionId = PartitionId.newBuilder()
        .setProjectId(projectId)
        .build();

    Key keyWithNumericId = Key.newBuilder()
        .setPartitionId(partitionId)
        .addPath(PathElement.newBuilder().setKind("Task").setId(389239043).build())
        .build();

    Key keyWithStringId = Key.newBuilder()
        .setPartitionId(partitionId)
        .addPath(PathElement.newBuilder().setKind("Task").setName("sampleTask").build())
        .build();

    Key incompleteKey = Key.newBuilder()
        .setPartitionId(partitionId)
        .addPath(PathElement.newBuilder().setKind("Task").build())
        .build();

    AllocateIdsRequest allocateIdsRequest = AllocateIdsRequest.newBuilder()
        .addKeys(incompleteKey)
        .setProjectId(projectId)
        .build();

    try (DatastoreClient datastoreClient = DatastoreClient.create()) {
      AllocateIdsResponse allocateIdsResponse = datastoreClient.allocateIds(allocateIdsRequest);
      List<Key> autoAssignedIntegerNumericIds = allocateIdsResponse.getKeysList();
    }
  }

}
