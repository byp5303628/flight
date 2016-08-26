package net.ethanpark.flight.cache;

import net.ethanpark.flight.cache.annotation.Cache;

/**
 * Created by baiyp on 2016/8/26.
 */
@Cache
public class SearchCacheManager {
   private static SearchResultRedisCache _searchCache;
}
