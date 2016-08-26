package net.ethanpark.flight.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

/**
 * Created by baiyp on 2016/8/25.
 */
public class SearchCriteria {
   private Map<String, String> tags;
   private Map<DebugLogKey, String> debugLogs;

   private RequestHead header;
   private TripType tripType;
   private List<Segment> segments;
   private List<Passenger> passengers;
   private String airline;
   private SeatGrade seatGrade;
   private SalesType salesType;
   private String agentId;
   private String ctripUserId;
   private String includedCarrier;
   private DebugOptions debugOptions;
   private int subChannelId;
   private RequestSearchType requestSearchType;

   private SearchTokenInfo searchTokenInfo;
   private ProductRoute route;
   private ResultControl resultControl;

   private List<Passenger> originPassengers;

   private List<Long> addtionProductIds;

   public SearchCriteria() {
      tags = new HashMap<>();
      debugLogs = new HashMap<>();
   }

   public RequestHead getHeader() {
      return header;
   }

   public void setHeader(RequestHead header) {
      this.header = header;
   }

   public TripType getTripType() {
      return tripType;
   }

   public void setTripType(TripType tripType) {
      this.tripType = tripType;
   }

   public List<Segment> getSegments() {
      return segments;
   }

   public void setSegments(List<Segment> segments) {
      this.segments = segments;
   }

   public List<Passenger> getPassengers() {
      return passengers;
   }

   public void setPassengers(List<Passenger> passengers) {
      this.passengers = passengers;
   }

   public String getAirline() {
      return airline;
   }

   public void setAirline(String airline) {
      this.airline = airline;
   }

   public SeatGrade getSeatGrade() {
      return seatGrade;
   }

   public void setSeatGrade(SeatGrade seatGrade) {
      this.seatGrade = seatGrade;
   }

   public SalesType getSalesType() {
      return salesType;
   }

   public void setSalesType(SalesType salesType) {
      this.salesType = salesType;
   }

   public String getAgentId() {
      return agentId;
   }

   public void setAgentId(String agentId) {
      this.agentId = agentId;
   }

   public String getCtripUserId() {
      return ctripUserId;
   }

   public void setCtripUserId(String ctripUserId) {
      this.ctripUserId = ctripUserId;
   }

   public String getIncludedCarrier() {
      return includedCarrier;
   }

   public void setIncludedCarrier(String includedCarrier) {
      this.includedCarrier = includedCarrier;
   }

   public DebugOptions getDebugOptions() {
      return debugOptions;
   }

   public void setDebugOptions(DebugOptions debugOptions) {
      this.debugOptions = debugOptions;
   }

   public int getSubChannelId() {
      return subChannelId;
   }

   public void setSubChannelId(int subChannelId) {
      this.subChannelId = subChannelId;
   }

   public RequestSearchType getRequestSearchType() {
      return requestSearchType;
   }

   public void setRequestSearchType(RequestSearchType requestSearchType) {
      this.requestSearchType = requestSearchType;
   }

   public SearchTokenInfo getSearchTokenInfo() {
      return searchTokenInfo;
   }

   public void setSearchTokenInfo(SearchTokenInfo searchTokenInfo) {
      this.searchTokenInfo = searchTokenInfo;
   }

   public ProductRoute getRoute() {
      return route;
   }

   public void setRoute(ProductRoute route) {
      this.route = route;
   }

   public ResultControl getResultControl() {
      return resultControl;
   }

   public void setResultControl(ResultControl resultControl) {
      this.resultControl = resultControl;
   }

   public List<Passenger> getOriginPassengers() {
      return originPassengers;
   }

   public void setOriginPassengers(List<Passenger> originPassengers) {
      this.originPassengers = originPassengers;
   }

   public List<Long> getAddtionProductIds() {
      return addtionProductIds;
   }

   public void setAddtionProductIds(List<Long> addtionProductIds) {
      this.addtionProductIds = addtionProductIds;
   }

   //region Helper Methods

   /**
    * 是否为第一个请求 <br/>
    * 非分批或者分批的第一个请求：true <br/>
    * 分批的第N（N > 1）个请求返回：false
    * 
    * @return
    */
   public boolean isFirstRequest() {
      SearchTokenInfo tokenInfo = getSearchTokenInfo();

      return (tokenInfo == null || !tokenInfo.isNeedPartitionedSearchResults()
            || StringUtils.isNotEmpty(tokenInfo.getPartitionSearchToken())
            || tokenInfo.getPartitionSearchToken().equals("1"));
   }

   /**
    * 是否严格反查
    * 
    * @return
    */
   public boolean isStrictRouteSearch() {
      return searchTokenInfo != null && searchTokenInfo
            .getRouteSearchMode() == RouteSearchMode.AllOrigDestsStrict;
   }

   /**
    * 是否路由查询
    * 
    * @return
    */
   public boolean isRouteSearch() {
      return searchTokenInfo != null
            && searchTokenInfo.getRouteSearchMode() != RouteSearchMode.None;
   }

   /**
    * 几天之内出发（出发日期和今天的间隔天数）。0：今天；1：明天；2：后天；...
    * 
    * @return
    */
   public int departDays() {
      throw new UnsupportedOperationException();
   }

   /**
    * 返回完整的SalesType，带SubChannelID（仅当SubChannelID>0）。分隔符为"_"。
    * 
    * @return
    */
   public String getFullSalesType() {
      String salesType = getSalesType().toString();

      int id = subChannelId;
      if (id > 0) {
         salesType = String.format("%s_%d", salesType, id);
      }

      return salesType;
   }
   //endregion
}
