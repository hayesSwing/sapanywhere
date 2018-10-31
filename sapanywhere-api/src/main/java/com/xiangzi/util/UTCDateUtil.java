package com.xiangzi.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * UTC时间
 * <p>
 * 整个地球分为二十四时区，每个时区都有自己的本地时间。在国际无线电通信场合，为了统一起见，使用一个统一的时间，称为通用协调时(UTC, Universal
 * Time Coordinated)。UTC与格林尼治平均时(GMT, Greenwich Mean Time)一样，都与英国伦敦的本地时相同。
 * </p>
 */
public class UTCDateUtil {

	public static String utcTimePatten = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
	public static String localTimePatten = "yyyy-MM-dd HH:mm:ss.SSS";

	public static String utc2Local(String utcTime) {
		return utc2Local(utcTime, utcTimePatten, localTimePatten);
	}

	public static String utc2Local(String utcTime, String utcTimePatten, String localTimePatten) {
		SimpleDateFormat utcFormater = new SimpleDateFormat(utcTimePatten);
		utcFormater.setTimeZone(TimeZone.getTimeZone("UTC"));// 时区定义并进行时间获取
		Date gpsUTCDate = null;
		try {
			gpsUTCDate = utcFormater.parse(utcTime);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		SimpleDateFormat localFormater = new SimpleDateFormat(localTimePatten);
		localFormater.setTimeZone(TimeZone.getDefault());
		String localTime = localFormater.format(gpsUTCDate.getTime());
		return localTime;
	}

	public static String utcCurrentTime() {
		SimpleDateFormat utcFormater = new SimpleDateFormat(utcTimePatten);
		utcFormater.setTimeZone(TimeZone.getTimeZone("UTC"));// 时区定义并进行时间获取
		return utcFormater.format(new Date());
	}

	public static String local2Utc(String localTime, String localTimePatten, String utcTimePatten) {
		DateFormat localFormater = new SimpleDateFormat(localTimePatten);
		localFormater.setTimeZone(TimeZone.getDefault());
		Date localDate = null;
		try {
			localDate = localFormater.parse(localTime);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		SimpleDateFormat utcFormater = new SimpleDateFormat(utcTimePatten);
		utcFormater.setTimeZone(TimeZone.getTimeZone("UTC"));// 时区定义并进行时间获取
		return utcFormater.format(localDate);
	}

	public static String local2Utc(String localTime) {
		return local2Utc(localTime, localTimePatten, utcTimePatten);
	}

}
