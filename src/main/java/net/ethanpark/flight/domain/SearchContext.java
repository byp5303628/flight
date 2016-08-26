package net.ethanpark.flight.domain;

import net.ethanpark.flight.common.Log;

/**
 * Created by baiyp on 2016/8/26.
 */
public class SearchContext {
   private SearchCriteria criteria;
   private EngineInfo engineInfo;
   private Log log;

   public SearchContext(SearchCriteria criteria, EngineInfo engineInfo,
         Log log) {
      this.criteria = criteria;
      this.engineInfo = engineInfo;
      this.log = log;
   }

   //region Log

   public void addPerformanceLog(PerformLogCategory name, long value) {
      log.addPerformanceLog(name.toString(), String.valueOf(value));
   }

   public void startRecordTime(PerformLogCategory name) {
      log.startRecordTime(name);
   }

   public void stopRecordTime(PerformLogCategory name) {
      log.stopRecordTime(name);
   }

   public void addProcessLog(String name, String value) {
      log.addProcessLog(name, value);
   }
   //endregion
}
