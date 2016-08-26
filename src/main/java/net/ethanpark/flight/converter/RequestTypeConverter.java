package net.ethanpark.flight.converter;

import java.util.ArrayList;
import java.util.List;

import net.ethanpark.flight.contract.*;
import net.ethanpark.flight.domain.*;

/**
 * Created by baiyp on 2016/8/25.
 */
public class RequestTypeConverter {
   public static SearchCriteria ConvertToSearchCriteria(
         SearchRequestType requestType) {
      SearchCriteriaType criteriaType = requestType.getSearchCriteriaType();
      SearchCriteria criteria = new SearchCriteria();

      List<Segment> segments =
            toSegments(criteriaType.getOrigDestRequestTyWpeList());
      List<Passenger> passengers =
            toPassengers(criteriaType.getTravelerRequestTypeList());

      String includedCarrier =
            getCarrierString(criteriaType.getIncludedCarrierList());


      return criteria;
   }

   private static String getCarrierString(List<String> includedCarrierList) {
      if (includedCarrierList == null)
         return null;

      StringBuilder sb = new StringBuilder();

      for (String carrier : includedCarrierList) {
         sb.append(carrier.toUpperCase()).append("/");
      }

      return sb.toString();
   }

   private static List<Passenger> toPassengers(
         List<TravelerRequestType> travelerRequestTypeList) {

      if (travelerRequestTypeList == null)
         return null;

      List<Passenger> passengers =
            new ArrayList<>(travelerRequestTypeList.size());

      for (TravelerRequestType type : travelerRequestTypeList) {
         Passenger passenger = new Passenger();
         passenger.setPassengerCount(type.getTravelerCount());
         passenger.setNationality(type.getNationality());
         passenger.setPassengerType(
               toPassengerType(type.getTravelerCategoryCode()));
         passenger.setEligibility(toEligibility(type.getEligibility()));

         passengers.add(passenger);
      }

      return passengers;
   }

   private static Eligibility toEligibility(
         TravelerEligibilityCodeType eligibility) {
      switch (eligibility) {
      case EMI:
         return Eligibility.EMI;
      case LAB:
         return Eligibility.LAB;
      case NEW:
         return Eligibility.NEW;
      case CHD:
         return Eligibility.CHD;
      case SEA:
         return Eligibility.SEA;
      case VFR:
         return Eligibility.VFR;
      case WOM:
         return Eligibility.WOM;
      case STU:
         return Eligibility.STU;
      case TAI:
         return Eligibility.TAI;
      case ADT:
         return Eligibility.NOR;
      case SRC:
         return Eligibility.SNR;
      case YTH:
         return Eligibility.YOU;
      default:
         return Eligibility.NOR;
      }
   }

   private static PassengerType toPassengerType(TravelerCategoryCodeType code) {

      switch (code) {
      case Adult:
         return PassengerType.ADT;
      case Child:
         return PassengerType.CHD;
      case InfantInLap:
         return PassengerType.INF;
      default:
         throw new RuntimeException(code + " is not supported!");
      }
   }

   private static List<Segment> toSegments(
         List<OrigDestRequestType> origDestRequestTyWpeList) {
      if (origDestRequestTyWpeList == null)
         return null;

      List<Segment> result = new ArrayList<>(origDestRequestTyWpeList.size());
      for (OrigDestRequestType type : origDestRequestTyWpeList) {
         Segment segment = new Segment();
         segment.setDepartDate(type.getDate());
         segment.setDepartCity(type.getOrig());
         segment.setArriveCity(type.getDest());
         segment.setOrigDestRequestOptions(
               toOptions(type.getOrigDestRequestOptionsType()));

         result.add(segment);
      }

      return result;
   }

   private static OrigDestRequestOptions toOptions(
         OrigDestRequestOptionsType origDestRequestOptionsType) {
      return null;
   }
}
