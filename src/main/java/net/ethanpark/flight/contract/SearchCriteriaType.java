package net.ethanpark.flight.contract;

import java.util.List;

/**
 * Created by baiyp on 2016/8/25.
 */
public class SearchCriteriaType {
   private List<OrigDestRequestType> origDestRequestTypeList;
   private List<TravelerRequestType> travelerRequestTypeList;
   private List<String> includedCarrierList;
   private CabinClassType seatGrade;

   public List<OrigDestRequestType> getOrigDestRequestTyWpeList() {
      return origDestRequestTypeList;
   }

   public void setOrigDestRequestTypeList(
         List<OrigDestRequestType> origDestRequestTypeList) {
      this.origDestRequestTypeList = origDestRequestTypeList;
   }

   public List<TravelerRequestType> getTravelerRequestTypeList() {
      return travelerRequestTypeList;
   }

   public void setTravelerRequestTypeList(
         List<TravelerRequestType> travelerRequestTypeList) {
      this.travelerRequestTypeList = travelerRequestTypeList;
   }

   public List<String> getIncludedCarrierList() {
      return includedCarrierList;
   }

   public void setIncludedCarrierList(List<String> includedCarrierList) {
      this.includedCarrierList = includedCarrierList;
   }

   public CabinClassType getSeatGrade() {
      return seatGrade;
   }

   public void setSeatGrade(CabinClassType seatGrade) {
      this.seatGrade = seatGrade;
   }
}
