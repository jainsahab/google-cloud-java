package com.google.cloud.datastore.v1.snippets;

import com.google.cloud.datastore.v1.DatastoreClient;
import com.google.datastore.v1.CommitRequest;
import com.google.datastore.v1.CommitRequest.Mode;
import com.google.datastore.v1.CommitResponse;
import com.google.datastore.v1.Entity;
import com.google.datastore.v1.Key;
import com.google.datastore.v1.Key.PathElement;
import com.google.datastore.v1.Mutation;
import com.google.datastore.v1.MutationResult;
import com.google.datastore.v1.PartitionId;
import com.google.datastore.v1.Value;
import java.io.IOException;
import java.util.Arrays;

public class RunWritesInBatch {

  public static void main(String[] args) throws IOException {
    String projectId = "jainsahab-feature-development";

    Key key1 = Key.newBuilder()
        .setPartitionId(PartitionId.newBuilder().setProjectId(projectId).build())
        .addPath(PathElement.newBuilder().setKind("Task").setName("sampleTask1").build())
        .build();
    Key key2 = Key.newBuilder()
        .setPartitionId(PartitionId.newBuilder().setProjectId(projectId).build())
        .addPath(PathElement.newBuilder().setKind("Task").setName("sampleTask2").build())
        .build();

    Entity.Builder entity1 = Entity.newBuilder()
        .setKey(key1)
        .putProperties("category", Value.newBuilder().setStringValue("Personal").build())
        .putProperties("done", Value.newBuilder().setBooleanValue(false).build())
        .putProperties("priority", Value.newBuilder().setIntegerValue(4).build())
        .putProperties("description",
            Value.newBuilder().setStringValue("Learn Cloud Datastore").build())
        .putProperties("from",
            Value.newBuilder().setStringValue("gapic generated client").build());

    Entity.Builder entity2 = Entity.newBuilder()
        .setKey(key2)
        .putProperties("category", Value.newBuilder().setStringValue("Personal").build())
        .putProperties("done", Value.newBuilder().setBooleanValue(false).build())
        .putProperties("priority", Value.newBuilder().setIntegerValue(4).build())
        .putProperties("description",
            Value.newBuilder().setStringValue("Integrate Cloud Datastore").build())
        .putProperties("from",
            Value.newBuilder().setStringValue("gapic generated client").build());

    Mutation upsertMutation1 = Mutation.newBuilder().setUpsert(entity1).build();
    Mutation upsertMutation2 = Mutation.newBuilder().setUpsert(entity2).build();

    CommitRequest commitRequest = CommitRequest.newBuilder()
        .setMode(Mode.NON_TRANSACTIONAL)
        .addAllMutations(Arrays.asList(upsertMutation1, upsertMutation2))
        .setProjectId(projectId)
        .build();

    try (DatastoreClient datastoreClient = DatastoreClient.create()) {
      CommitResponse commitResponse = datastoreClient.commit(commitRequest);
      for (MutationResult mutationResult : commitResponse.getMutationResultsList()) {
        System.out.println("Record inserted with key: " + mutationResult.getKey());
      }
    }

  }

}
