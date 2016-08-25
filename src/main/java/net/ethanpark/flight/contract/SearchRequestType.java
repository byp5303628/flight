package net.ethanpark.flight.contract;

/**
 * Created by baiyp on 2016/8/25.
 */
public class SearchRequestType {
   private RequestHeaderType requestHeaderType;
   private SearchCriteriaType searchCriteriaType;
   private ResultControlType resultControlType;
   private SearchContextType searchContextType;

   public RequestHeaderType getRequestHeaderType() {
      return requestHeaderType;
   }

   public void setRequestHeaderType(RequestHeaderType requestHeaderType) {
      this.requestHeaderType = requestHeaderType;
   }

   public SearchCriteriaType getSearchCriteriaType() {
      return searchCriteriaType;
   }

   public void setSearchCriteriaType(SearchCriteriaType searchCriteriaType) {
      this.searchCriteriaType = searchCriteriaType;
   }

   public ResultControlType getResultControlType() {
      return resultControlType;
   }

   public void setResultControlType(ResultControlType resultControlType) {
      this.resultControlType = resultControlType;
   }

   public SearchContextType getSearchContextType() {
      return searchContextType;
   }

   public void setSearchContextType(SearchContextType searchContextType) {
      this.searchContextType = searchContextType;
   }
}
