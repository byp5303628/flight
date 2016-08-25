package net.ethanpark.flight.contract;

/**
 * Created by baiyp on 2016/8/25.
 */
public class OrigDestRequestOptionsType {
   private String transferCity;
   private String transferTimePeriod;
   private String departTimePeriod;

   public String getTransferCity() {
      return transferCity;
   }

   public void setTransferCity(String transferCity) {
      this.transferCity = transferCity;
   }

   public String getTransferTimePeriod() {
      return transferTimePeriod;
   }

   public void setTransferTimePeriod(String transferTimePeriod) {
      this.transferTimePeriod = transferTimePeriod;
   }

   public String getDepartTimePeriod() {
      return departTimePeriod;
   }

   public void setDepartTimePeriod(String departTimePeriod) {
      this.departTimePeriod = departTimePeriod;
   }
}
