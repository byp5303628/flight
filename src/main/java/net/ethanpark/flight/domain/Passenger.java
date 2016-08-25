package net.ethanpark.flight.domain;

/**
 * Created by baiyp on 2016/8/25.
 */
public class Passenger {
   private PassengerType passengerType;
   private int passengerCount;
   private Eligibility eligibility;

   public String nationality;

   public PassengerType getPassengerType() {
      return passengerType;
   }

   public void setPassengerType(PassengerType passengerType) {
      this.passengerType = passengerType;
   }

   public Eligibility getEligibility() {
      return eligibility;
   }

   public void setEligibility(Eligibility eligibility) {
      this.eligibility = eligibility;
   }

   public String getNationality() {
      return nationality;
   }

   public void setNationality(String nationality) {
      this.nationality = nationality;
   }

   public int getPassengerCount() {
      return passengerCount;
   }

   public void setPassengerCount(int passengerCount) {
      this.passengerCount = passengerCount;
   }
}
