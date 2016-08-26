package net.ethanpark.flight.common;

import net.ethanpark.flight.domain.PerformLogCategory;

/**
 * Created by baiyp on 2016/8/26.
 */
public interface Log {
   void addPerformanceLog(String name, String value);

   void startRecordTime(PerformLogCategory category);

   void stopRecordTime(PerformLogCategory category);

   void addProcessLog(String name, String value);

   String getProcessLog(String searchStep);
}
