package net.ethanpark.flight.contract;

/**
 * Created by baiyp on 2016/8/25.
 */
public class MessageHeaderType {

   private String sourceAppId;
   private String sessionId;
   private String transactionId;
   private ChannelIdType channelIdType;
   private int subChannelIdType;
   private String customerId;
   private String agentId;
   private String clientIp;

   public String getSourceAppId() {
      return sourceAppId;
   }

   public void setSourceAppId(String sourceAppId) {
      this.sourceAppId = sourceAppId;
   }

   public String getSessionId() {
      return sessionId;
   }

   public void setSessionId(String sessionId) {
      this.sessionId = sessionId;
   }

   public String getTransactionId() {
      return transactionId;
   }

   public void setTransactionId(String transactionId) {
      this.transactionId = transactionId;
   }

   public ChannelIdType getChannelIdType() {
      return channelIdType;
   }

   public void setChannelIdType(ChannelIdType channelIdType) {
      this.channelIdType = channelIdType;
   }

   public int getSubChannelIdType() {
      return subChannelIdType;
   }

   public void setSubChannelIdType(int subChannelIdType) {
      this.subChannelIdType = subChannelIdType;
   }

   public String getCustomerId() {
      return customerId;
   }

   public void setCustomerId(String customerId) {
      this.customerId = customerId;
   }

   public String getAgentId() {
      return agentId;
   }

   public void setAgentId(String agentId) {
      this.agentId = agentId;
   }

   public String getClientIp() {
      return clientIp;
   }

   public void setClientIp(String clientIp) {
      this.clientIp = clientIp;
   }
}
