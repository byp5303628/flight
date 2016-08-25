package net.ethanpark.flight.contract;

/**
 * Created by baiyp on 2016/8/25.
 */
public class TravelerRequestType {
   private TravelerCategoryCodeType travelerCategoryCode;
   private TravelerEligibilityCodeType eligibility;
   private int travelerCount;
   private String nationality;

   public TravelerCategoryCodeType getTravelerCategoryCode() {
      return travelerCategoryCode;
   }

   public void setTravelerCategoryCode(
         TravelerCategoryCodeType travelerCategoryCode) {
      this.travelerCategoryCode = travelerCategoryCode;
   }

   public TravelerEligibilityCodeType getEligibility() {
      return eligibility;
   }

   public void setEligibility(TravelerEligibilityCodeType eligibility) {
      this.eligibility = eligibility;
   }

   public int getTravelerCount() {
      return travelerCount;
   }

   public void setTravelerCount(int travelerCount) {
      this.travelerCount = travelerCount;
   }

   public String getNationality() {
      return nationality;
   }

   public void setNationality(String nationality) {
      this.nationality = nationality;
   }
}
