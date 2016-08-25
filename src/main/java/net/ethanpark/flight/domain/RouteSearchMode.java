package net.ethanpark.flight.domain;

/**
 * Created by baiyp on 2016/8/25.
 */
public enum RouteSearchMode {
   /// <summary>
   /// 禁用基于路由的查询
   /// </summary>
   None,
   /// <summary>
   /// 请求下一行程结果（匹配前OrigDestSeqID-1个行程的航班）
   /// </summary>
   NextOrigDest,
   /// <summary>
   /// 请求所有行程结果（匹配前OrigDestSeqID个行程的航班）
   /// </summary>
   AllOrigDests,
   /// <summary>
   /// 请求所有行程结果（严格匹配所有行程的航班+舱位+价格）
   /// </summary>
   AllOrigDestsStrict,

   /// <summary>
   /// 请求所有行程结果（查询全部引擎匹配所有行程的航班）
   /// </summary>
   AllOrigDestsExtended,

   /// <summary>
   /// 请求指定航班的所有行程（严格匹配所有行程的参数，没有输入的参数不匹配）
   /// </summary>
   AllFlightProductStrict
}
