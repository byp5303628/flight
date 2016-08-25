package net.ethanpark.flight.contract;

/**
 * Created by baiyp on 2016/8/25.
 */
public class RequestHeaderType {
   private MessageHeaderType messageHeaderType;
   private int loggingLevel;
   private String diagInput;

   public MessageHeaderType getMessageHeaderType() {
      return messageHeaderType;
   }

   public void setMessageHeaderType(MessageHeaderType messageHeaderType) {
      this.messageHeaderType = messageHeaderType;
   }

   public int getLoggingLevel() {
      return loggingLevel;
   }

   public void setLoggingLevel(int loggingLevel) {
      this.loggingLevel = loggingLevel;
   }

   public String getDiagInput() {
      return diagInput;
   }

   public void setDiagInput(String diagInput) {
      this.diagInput = diagInput;
   }
}
