package net.ethanpark.flight.domain;

/**
 * Created by baiyp on 2016/8/25.
 */
public class RequestHead {
   private int messagePrority = 3;
   private String culture;
   private String version;
   private String userid;
   private String referenceid;
   private String transno;
   private String sessionid;
   private String requestid;
   private String requesttype;
   private String clientip;
   private String reCallType;
   private boolean asyncrequest;
   private int timeout;

   public int getMessagePrority() {
      return messagePrority;
   }

   public void setMessagePrority(int messagePrority) {
      this.messagePrority = messagePrority;
   }

   public String getCulture() {
      return culture;
   }

   public void setCulture(String culture) {
      this.culture = culture;
   }

   public String getVersion() {
      return version;
   }

   public void setVersion(String version) {
      this.version = version;
   }

   public String getUserid() {
      return userid;
   }

   public void setUserid(String userid) {
      this.userid = userid;
   }

   public String getReferenceid() {
      return referenceid;
   }

   public void setReferenceid(String referenceid) {
      this.referenceid = referenceid;
   }

   public String getTransno() {
      return transno;
   }

   public void setTransno(String transno) {
      this.transno = transno;
   }

   public String getSessionid() {
      return sessionid;
   }

   public void setSessionid(String sessionid) {
      this.sessionid = sessionid;
   }

   public String getRequestid() {
      return requestid;
   }

   public void setRequestid(String requestid) {
      this.requestid = requestid;
   }

   public String getRequesttype() {
      return requesttype;
   }

   public void setRequesttype(String requesttype) {
      this.requesttype = requesttype;
   }

   public String getClientip() {
      return clientip;
   }

   public void setClientip(String clientip) {
      this.clientip = clientip;
   }

   public String getReCallType() {
      return reCallType;
   }

   public void setReCallType(String reCallType) {
      this.reCallType = reCallType;
   }

   public boolean isAsyncrequest() {
      return asyncrequest;
   }

   public void setAsyncrequest(boolean asyncrequest) {
      this.asyncrequest = asyncrequest;
   }

   public int getTimeout() {
      return timeout;
   }

   public void setTimeout(int timeout) {
      this.timeout = timeout;
   }
}
