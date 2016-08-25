package net.ethanpark.flight.contract;

/**
 * Created by baiyp on 2016/8/25.
 */
public class ErrorDataType {
   private String message;
   private String errorCode;
   private String stackTrace;

   public String getMessage() {
      return message;
   }

   public void setMessage(String message) {
      this.message = message;
   }

   public String getErrorCode() {
      return errorCode;
   }

   public void setErrorCode(String errorCode) {
      this.errorCode = errorCode;
   }

   public String getStackTrace() {
      return stackTrace;
   }

   public void setStackTrace(String stackTrace) {
      this.stackTrace = stackTrace;
   }
}
