package net.ethanpark.flight.contract;

/**
 * Created by baiyp on 2016/8/25.
 */
public class ExtensionType {
   private String id;

   private String version;
   private String contentType;
   private String value;

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getVersion() {
      return version;
   }

   public void setVersion(String version) {
      this.version = version;
   }

   public String getContentType() {
      return contentType;
   }

   public void setContentType(String contentType) {
      this.contentType = contentType;
   }

   public String getValue() {
      return value;
   }

   public void setValue(String value) {
      this.value = value;
   }
}
