package net.ethanpark.flight.contract;

import java.util.Date;
import java.util.List;

/**
 * Created by baiyp on 2016/8/25.
 */
public class ResponseStatusType {
   private Date timestamp;
   private AckCodeType ack;
   private List<ErrorDataType> errors;
   private String build;
   private String version;
   private List<ExtensionType> extension;

   public Date getTimestamp() {
      return timestamp;
   }

   public void setTimestamp(Date timestamp) {
      this.timestamp = timestamp;
   }

   public AckCodeType getAck() {
      return ack;
   }

   public void setAck(AckCodeType ack) {
      this.ack = ack;
   }

   public List<ErrorDataType> getErrors() {
      return errors;
   }

   public void setErrors(List<ErrorDataType> errors) {
      this.errors = errors;
   }

   public String getBuild() {
      return build;
   }

   public void setBuild(String build) {
      this.build = build;
   }

   public String getVersion() {
      return version;
   }

   public void setVersion(String version) {
      this.version = version;
   }

   public List<ExtensionType> getExtension() {
      return extension;
   }

   public void setExtension(List<ExtensionType> extension) {
      this.extension = extension;
   }
}
