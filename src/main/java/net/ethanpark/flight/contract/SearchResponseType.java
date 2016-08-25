package net.ethanpark.flight.contract;

/**
 * Created by baiyp on 2016/8/25.
 */
public class SearchResponseType {
   private ResponseStatusType responseStatus;
   private ResponseHeaderType responseHeader;
   private SearchResultType searchResult;
   private ErrorResultType errorResult;

   public ResponseStatusType getResponseStatus() {
      return responseStatus;
   }

   public void setResponseStatus(ResponseStatusType responseStatus) {
      this.responseStatus = responseStatus;
   }

   public ResponseHeaderType getResponseHeader() {
      return responseHeader;
   }

   public void setResponseHeader(ResponseHeaderType responseHeader) {
      this.responseHeader = responseHeader;
   }

   public SearchResultType getSearchResult() {
      return searchResult;
   }

   public void setSearchResult(SearchResultType searchResult) {
      this.searchResult = searchResult;
   }

   public ErrorResultType getErrorResult() {
      return errorResult;
   }

   public void setErrorResult(ErrorResultType errorResult) {
      this.errorResult = errorResult;
   }
}
