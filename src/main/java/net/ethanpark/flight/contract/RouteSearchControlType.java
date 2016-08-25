package net.ethanpark.flight.contract;

/**
 * Created by baiyp on 2016/8/25.
 */
public class RouteSearchControlType {
   private RouteSearchModeType routeSearchMode;
   private String routeSearchToken;
   private int origDestSeqId;

   public RouteSearchModeType getRouteSearchMode() {
      return routeSearchMode;
   }

   public void setRouteSearchMode(RouteSearchModeType routeSearchMode) {
      this.routeSearchMode = routeSearchMode;
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
}
