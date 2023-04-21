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
import java.util.Collections;

public class WriteDataToDatabase {

  public static void main(String[] args) throws IOException {
    String projectId = "jainsahab-feature-development";

    Key.Builder keyBuilder = Key.newBuilder();
    keyBuilder.setPartitionId(PartitionId.newBuilder().setProjectId(projectId).build());
    keyBuilder.addPath(PathElement.newBuilder().setKind("Task").setName("sampleTask").build());

    Entity.Builder entityBuilder = Entity.newBuilder();
    entityBuilder.setKey(keyBuilder);
    entityBuilder.putProperties("category", Value.newBuilder().setStringValue("Personal").build());
    entityBuilder.putProperties("done", Value.newBuilder().setBooleanValue(false).build());
    entityBuilder.putProperties("priority", Value.newBuilder().setIntegerValue(4).build());
    entityBuilder.putProperties("description",
        Value.newBuilder().setStringValue("Learn Cloud Datastore").build());
    entityBuilder.putProperties("from",
        Value.newBuilder().setStringValue("gapic generated client").build());

    Mutation insertMutation = Mutation.newBuilder().setUpsert(entityBuilder).build();

    CommitRequest commitRequest = CommitRequest.newBuilder()
        .setMode(Mode.NON_TRANSACTIONAL)
        .addAllMutations(Collections.singletonList(insertMutation))
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
