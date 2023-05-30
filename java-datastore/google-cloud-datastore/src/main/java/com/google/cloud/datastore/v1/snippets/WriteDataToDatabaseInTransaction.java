package com.google.cloud.datastore.v1.snippets;

import com.google.cloud.datastore.v1.DatastoreClient;
import com.google.datastore.v1.BeginTransactionRequest;
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
import com.google.protobuf.ByteString;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Collections;

public class WriteDataToDatabaseInTransaction {

  public static void main(String[] args) throws IOException {
    LocalDateTime now = LocalDateTime.now();
    String projectId = "jainsahab-feature-development";
    try (DatastoreClient datastoreClient = DatastoreClient.create()) {

      // starting a new transaction
      BeginTransactionRequest beginTransactionRequest = BeginTransactionRequest.newBuilder()
          .setProjectId(projectId)
          .build();
      ByteString transactionId = datastoreClient.beginTransaction(beginTransactionRequest)
          .getTransaction();

      //creating entity
      Key.Builder keyBuilder = Key.newBuilder()
          .setPartitionId(PartitionId.newBuilder().setProjectId(projectId).build())
          .addPath(PathElement.newBuilder().setKind("Task").setName("sampleTask").build());

      Entity.Builder entityBuilder = Entity.newBuilder()
          .setKey(keyBuilder)
          .putProperties("category",
              Value.newBuilder().setStringValue("Personal").build())
          .putProperties("done", Value.newBuilder().setBooleanValue(false).build())
          .putProperties("priority", Value.newBuilder().setIntegerValue(4).build())
          .putProperties("description",
              Value.newBuilder().setStringValue("Learn Cloud Datastore").build())
          .putProperties("mode",
              Value.newBuilder().setStringValue("inside transaction @ " + now).build())
          .putProperties("from",
              Value.newBuilder().setStringValue("gapic generated client").build());

      Mutation insertMutation = Mutation.newBuilder().setUpsert(entityBuilder).build();

      // commiting transaction
      CommitRequest commitRequest = CommitRequest.newBuilder()
          .setMode(Mode.TRANSACTIONAL)
          .addAllMutations(Collections.singletonList(insertMutation))
          .setProjectId(projectId)
          .setTransaction(transactionId)
          .build();

      CommitResponse commitResponse = datastoreClient.commit(commitRequest);
      for (MutationResult mutationResult : commitResponse.getMutationResultsList()) {
        System.out.println("Record inserted with key: " + mutationResult.getKey());
      }
    }
  }

}
