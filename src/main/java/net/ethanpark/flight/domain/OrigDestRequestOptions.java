package net.ethanpark.flight.domain;

/**
 * Created by baiyp on 2016/8/25.
 */
public class OrigDestRequestOptions {
   private String transferCity;
   private String transferTimePeriodStr;
   private String departTimePeriodStr;

   public String getTransferCity() {
      return transferCity;
   }

   public void setTransferCity(String transferCity) {
      this.transferCity = transferCity;
   }

   public String getTransferTimePeriodStr() {
      return transferTimePeriodStr;
   }

   public void setTransferTimePeriodStr(String transferTimePeriodStr) {
      this.transferTimePeriodStr = transferTimePeriodStr;
   }

   public String getDepartTimePeriodStr() {
      return departTimePeriodStr;
   }

   public void setDepartTimePeriodStr(String departTimePeriodStr) {
      this.departTimePeriodStr = departTimePeriodStr;
   }
}
