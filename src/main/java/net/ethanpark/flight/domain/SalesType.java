package net.ethanpark.flight.domain;

/**
 * Created by baiyp on 2016/8/25.
 */
public enum SalesType {
   Unknown,
   // region 机票
   /// <summary>
   /// 网上
   /// </summary>
   FlightIntlOnline,

   /// <summary>
   /// 人工
   /// </summary>
   FlightIntlOffline,

   /// <summary>
   /// Online SEO
   /// </summary>
   FlightIntlOnlineSEO,

   // region 无线
   /// <summary>
   /// 无线
   /// </summary>
   Mobile,
   /// <summary>
   /// 无线H5
   /// </summary>
   MobileH5,

   // region 度假
   /// <summary>
   /// 度假
   /// </summary>
   Vacation,
   /// <summary>
   /// 团队游
   /// </summary>
   VacationGroup,
   /// <summary>
   /// 自由行
   /// </summary>
   FitTravel,

   //region 商旅
   /// <summary>
   /// 商旅
   /// </summary>
   Corporation,
   /// <summary>
   /// 商旅 Offline
   /// </summary>
   CorpOffline,
   /// <summary>
   /// 商旅 Mobile
   /// </summary>
   CorpMobile,

   //   region 机+酒
   /// <summary>
   /// 机 + 酒
   /// </summary>
   AirHotelIntl,
   /// <summary>
   /// 新机+酒
   /// </summary>
   AirHotelIntlEx,

   //region SBU
   /// <summary>
   /// 英文
   /// </summary>
   EnglishSite,
   /// <summary>
   /// 高铁
   /// </summary>
   HighRail,
   /// <summary>
   /// 分销联盟
   /// </summary>
   Affiliate,
   /// <summary>
   /// 高端旅游
   /// </summary>
   Luxury,
   /// <summary>
   /// 市场客户
   /// </summary>
   Customer,
   /// <summary>
   /// Mice
   /// </summary>
   Mice,
   /// <summary>
   /// 攻略社区
   /// </summary>
   Community,
   /// <summary>
   /// 易游网
   /// </summary>
   EzTravel,
   /// <summary>
   /// 永安
   /// </summary>
   Wingon,
   /// <summary>
   /// 香港站
   /// </summary>
   HKSite,
   /// <summary>
   /// 韩国站
   /// </summary>
   KRSite,
   /// <summary>
   /// 日本站
   /// </summary>
   JPSite,
   /// <summary>
   /// 新加坡站
   /// </summary>
   SGSite,
   /// <summary>
   /// 台湾站
   /// </summary>
   TWSite,
   /// <summary>
   /// 泰国站
   /// </summary>
   THSite
   //endregion
}
