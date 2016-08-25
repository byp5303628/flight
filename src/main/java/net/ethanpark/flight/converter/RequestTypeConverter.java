package net.ethanpark.flight.converter;

import net.ethanpark.flight.contract.SearchCriteriaType;
import net.ethanpark.flight.contract.SearchRequestType;
import net.ethanpark.flight.domain.SearchCriteria;

/**
 * Created by baiyp on 2016/8/25.
 */
public class RequestTypeConverter {
   public static SearchCriteria ConvertToSearchCriteria(
         SearchRequestType requestType) {
      SearchCriteriaType criteriaType = requestType.getSearchCriteriaType();
      SearchCriteria criteria = new SearchCriteria();

      return criteria;
   }
}
