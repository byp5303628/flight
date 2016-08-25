package net.ethanpark.flight.domain;

import java.util.Date;

/**
 * Created by baiyp on 2016/8/25.
 */
public class Segment {
   private int segmentNo;
   private String departCity;
   private String arriveCity;
   private Date departDate;

   private int timeLag;

   private OrigDestRequestOptions origDestRequestOptions;

   public int getSegmentNo() {
      return segmentNo;
   }

   public void setSegmentNo(int segmentNo) {
      this.segmentNo = segmentNo;
   }

   public String getDepartCity() {
      return departCity;
   }

   public void setDepartCity(String departCity) {
      this.departCity = departCity;
   }

   public String getArriveCity() {
      return arriveCity;
   }

   public void setArriveCity(String arriveCity) {
      this.arriveCity = arriveCity;
   }

   public Date getDepartDate() {
      return departDate;
   }

   public void setDepartDate(Date departDate) {
      this.departDate = departDate;
   }

   public int getTimeLag() {
      return timeLag;
   }

   public void setTimeLag(int timeLag) {
      this.timeLag = timeLag;
   }

   public OrigDestRequestOptions getOrigDestRequestOptions() {
      return origDestRequestOptions;
   }

   public void setOrigDestRequestOptions(
         OrigDestRequestOptions origDestRequestOptions) {
      this.origDestRequestOptions = origDestRequestOptions;
   }

   public Date todayOfDepartCity() {
      return new Date();
   }
}
