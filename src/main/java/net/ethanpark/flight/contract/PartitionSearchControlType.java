package net.ethanpark.flight.contract;

/**
 * Created by baiyp on 2016/8/25.
 */
public class PartitionSearchControlType {
   private boolean needPartitionedSearchResults;
   private String partitionSearchToken;

   public boolean isNeedPartitionedSearchResults() {
      return needPartitionedSearchResults;
   }

   public void setNeedPartitionedSearchResults(
         boolean needPartitionedSearchResults) {
      this.needPartitionedSearchResults = needPartitionedSearchResults;
   }

   public String getPartitionSearchToken() {
      return partitionSearchToken;
   }

   public void setPartitionSearchToken(String partitionSearchToken) {
      this.partitionSearchToken = partitionSearchToken;
   }
}
