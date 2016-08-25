package net.ethanpark.flight.contract;

/**
 * Created by baiyp on 2016/8/25.
 */
public class SearchContextType {
   private PartitionSearchControlType partitionSearchControl;
   private RouteSearchControlType routeSearchControlType;
   private String couponAdditionProductIds;

   public PartitionSearchControlType getPartitionSearchControl() {
      return partitionSearchControl;
   }

   public void setPartitionSearchControl(
         PartitionSearchControlType partitionSearchControl) {
      this.partitionSearchControl = partitionSearchControl;
   }

   public RouteSearchControlType getRouteSearchControlType() {
      return routeSearchControlType;
   }

   public void setRouteSearchControlType(
         RouteSearchControlType routeSearchControlType) {
      this.routeSearchControlType = routeSearchControlType;
   }

   public String getCouponAdditionProductIds() {
      return couponAdditionProductIds;
   }

   public void setCouponAdditionProductIds(String couponAdditionProductIds) {
      this.couponAdditionProductIds = couponAdditionProductIds;
   }
}
