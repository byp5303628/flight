package net.ethanpark.flight.task;

import net.ethanpark.flight.common.Log;
import net.ethanpark.flight.domain.EngineInfo;
import net.ethanpark.flight.domain.PerformLogCategory;
import net.ethanpark.flight.domain.SearchContext;
import net.ethanpark.flight.domain.SearchCriteria;

/**
 * Created by baiyp on 2016/8/26.
 */
public abstract class EngineSearchTask implements ISearchTask {

   protected final SearchCriteria searchCriteria;
   protected final EngineInfo engineInfo;
   private final Log log;
   private final boolean finishWholeSearch = false;

   protected EngineSearchTask(SearchCriteria sc, EngineInfo ei, Log l) {
      searchCriteria = sc;
      engineInfo = ei;
      log = l;
   }


   @Override
   public void searchFlights() {
      SearchContext context =
            createSearchContext(searchCriteria, engineInfo, log);

      context.startRecordTime(PerformLogCategory.TaskExecute);
      context.addProcessLog("Engine", engineInfo.getEngineType().toString());

      context.startRecordTime(PerformLogCategory.CacheQuery);

   }

   protected SearchContext createSearchContext(SearchCriteria sc, EngineInfo ei,
         Log log) {
      return new SearchContext(sc, ei, log);
   }
}
