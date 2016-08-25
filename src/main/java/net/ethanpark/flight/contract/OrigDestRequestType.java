package net.ethanpark.flight.contract;

import java.util.Date;

/**
 * Created by baiyp on 2016/8/25.
 */
public class OrigDestRequestType {
   private Date date;
   private String orig;
   private String dest;

   private OrigDestRequestOptionsType origDestRequestOptionsType;

   public Date getDate() {
      return date;
   }

   public void setDate(Date date) {
      this.date = date;
   }

   public String getOrig() {
      return orig;
   }

   public void setOrig(String orig) {
      this.orig = orig;
   }

   public String getDest() {
      return dest;
   }

   public void setDest(String dest) {
      this.dest = dest;
   }

   public OrigDestRequestOptionsType getOrigDestRequestOptionsType() {
      return origDestRequestOptionsType;
   }

   public void setOrigDestRequestOptionsType(
         OrigDestRequestOptionsType origDestRequestOptionsType) {
      this.origDestRequestOptionsType = origDestRequestOptionsType;
   }
}
