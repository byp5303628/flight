package net.ethanpark.flight.domain;

/**
 * Created by baiyp on 2016/8/25.
 */
public class SearchTokenInfo {
   private String partitionSearchToken;
   private boolean needPartitionedSearchResults;
   private String allClassesToken;
   private String routeSearchToken;
   private int origDestSeqId;
   private RouteSearchMode routeSearchMode;

   public String getPartitionSearchToken() {
      return partitionSearchToken;
   }

   public void setPartitionSearchToken(String partitionSearchToken) {
      this.partitionSearchToken = partitionSearchToken;
   }

   public boolean isNeedPartitionedSearchResults() {
      return needPartitionedSearchResults;
   }

   public void setNeedPartitionedSearchResults(
         boolean needPartitionedSearchResults) {
      this.needPartitionedSearchResults = needPartitionedSearchResults;
   }

   public String getAllClassesToken() {
      return allClassesToken;
   }

   public void setAllClassesToken(String allClassesToken) {
      this.allClassesToken = allClassesToken;
   }

   public String getRouteSearchToken() {
      return routeSearchToken;
   }

   public void setRouteSearchToken(String routeSearchToken) {
      this.routeSearchToken = routeSearchToken;
   }

   public int getOrigDestSeqId() {
      return origDestSeqId;
   }

   public void setOrigDestSeqId(int origDestSeqId) {
      this.origDestSeqId = origDestSeqId;
   }

   public RouteSearchMode getRouteSearchMode() {
      return routeSearchMode;
   }

   public void setRouteSearchMode(RouteSearchMode routeSearchMode) {
      this.routeSearchMode = routeSearchMode;
   }
}
