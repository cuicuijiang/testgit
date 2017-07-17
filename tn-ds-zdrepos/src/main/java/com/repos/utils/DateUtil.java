package com.repos.utils;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author zhangqingli
 *
 */
public class DateUtil {

	/**
	 * 当天的开始时间
	 * 
	 */
	public static Date startOfTodDay() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}

	/**
	 * 当天的结束时间
	 * 
	 */
	public static Date endOfTodDay() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY, 23);
		calendar.set(Calendar.MINUTE, 59);
		calendar.set(Calendar.SECOND, 59);
		calendar.set(Calendar.MILLISECOND, 999);
		return calendar.getTime();
	}

	/**
	 * 昨天的开始时间
	 * 
	 */
	public static Date startOfYesterday() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.add(Calendar.DATE, -1);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}

	/**
	 * 昨天的结束时间
	 * 
	 */
	public static Date endOfYesterday() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY, 23);
		calendar.set(Calendar.MINUTE, 59);
		calendar.set(Calendar.SECOND, 59);
		calendar.set(Calendar.MILLISECOND, 999);
		calendar.add(Calendar.DATE, -1);
		return calendar.getTime();
	}

	/**
	 * 获取某天的开始时间
	 */
	public static Date startOfSomeday(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}
	
	/**
	 * 获取某天的结束时间
	 */
	public static Date endOfSomeday(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.HOUR_OF_DAY, 23);
		calendar.set(Calendar.MINUTE, 59);
		calendar.set(Calendar.SECOND, 59);
		calendar.set(Calendar.MILLISECOND, 999);
		return calendar.getTime();
	}

	/**
	 * 功能：获取上周的开始时间
	 */
	public static Date startOfLastWeek() {// 当周开始时间
		return new Date(startOfThisWeek().getTime() - 7 * 24 * 60 * 60 * 1000);
	}

	/**
	 * 功能：获取上周的结束时间
	 */
	public static Date endOfLastWeek() {// 当周开始时间
		return new Date(endOfThisWeek().getTime() - 7 * 24 * 60 * 60 * 1000);
	}

	/**
	 * 功能：获取本周的开始时间 示例：2013-05-13 00:00:00
	 */
	public static Date startOfThisWeek() {// 当周开始时间
		Calendar currentDate = Calendar.getInstance();
		currentDate.setFirstDayOfWeek(Calendar.MONDAY);
		currentDate.set(Calendar.HOUR_OF_DAY, 0);
		currentDate.set(Calendar.MINUTE, 0);
		currentDate.set(Calendar.SECOND, 0);
		currentDate.set(Calendar.MILLISECOND, 0);
		currentDate.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		return currentDate.getTime();
	}

	/**
	 * 功能：获取本周的结束时间 示例：2013-05-19 23:59:59
	 */
	public static Date endOfThisWeek() {// 当周结束时间
		Calendar currentDate = Calendar.getInstance();
		currentDate.setFirstDayOfWeek(Calendar.MONDAY);
		currentDate.set(Calendar.HOUR_OF_DAY, 23);
		currentDate.set(Calendar.MINUTE, 59);
		currentDate.set(Calendar.SECOND, 59);
		currentDate.set(Calendar.MILLISECOND, 999);
		currentDate.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		return currentDate.getTime();
	}

	/**
	 * 功能：获取本月的开始时间
	 */
	public static Date startOfThisMonth() {// 当周开始时间
		Calendar currentDate = Calendar.getInstance();
		currentDate.set(Calendar.HOUR_OF_DAY, 0);
		currentDate.set(Calendar.MINUTE, 0);
		currentDate.set(Calendar.SECOND, 0);
		currentDate.set(Calendar.MILLISECOND, 0);
		currentDate.set(Calendar.DAY_OF_MONTH, 1);
		return currentDate.getTime();
	}

	public static Date endOfThisMonth() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, 1);
		cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.SECOND, 59);
		cal.set(Calendar.MILLISECOND, 999);
		cal.add(Calendar.MONTH, 1);
		cal.add(Calendar.DATE, -1);
		return cal.getTime();
	}

	/**
	 * 功能：获取上月的开始时间
	 */
	public static Date startOfLastMonth() {// 当周开始时间
		Calendar currentDate = Calendar.getInstance();
		currentDate.set(Calendar.HOUR_OF_DAY, 0);
		currentDate.set(Calendar.MINUTE, 0);
		currentDate.set(Calendar.SECOND, 0);
		currentDate.set(Calendar.MILLISECOND, 0);
		currentDate.set(Calendar.DAY_OF_MONTH, 1);
		currentDate.add(Calendar.MONTH, -1);
		return currentDate.getTime();
	}

	/**
	 * 功能：获取上月的结束时间
	 */
	public static Date endOfLastMonth() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, 1);
		cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.SECOND, 59);
		cal.set(Calendar.MILLISECOND, 999);
		cal.add(Calendar.DATE, -1);
		return cal.getTime();
	}

	/**
	 * 根据long返回year
	 * 
	 * @param milliseconds
	 * @return
	 */
	@SuppressWarnings("deprecation")
	public static Object[] theYearOfTime(long milliseconds) {
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		int thisYear = date.getYear() + 1900;
		cal.setTimeInMillis(milliseconds);
		date = cal.getTime();
		int regirsterYear = date.getYear() + 1900;
		if (regirsterYear < thisYear) {
			List<Integer> yearL = new ArrayList<Integer>();
			for (int i = regirsterYear; i <= thisYear; i++) {
				yearL.add(i);
			}
			return yearL.toArray();
		} else {
			return new Object[] { thisYear };
		}

	}

	/**
	 * 功能：获取本年的开始时间
	 */
	public static Date startOfTheYear(int year) {// 当周开始时间
		Calendar currentDate = Calendar.getInstance();
		currentDate.set(Calendar.YEAR, year);
		currentDate.set(Calendar.MONTH, 0);
		currentDate.set(Calendar.HOUR_OF_DAY, 0);
		currentDate.set(Calendar.MINUTE, 0);
		currentDate.set(Calendar.SECOND, 0);
		currentDate.set(Calendar.MILLISECOND, 0);
		currentDate.set(Calendar.DAY_OF_MONTH, 1);
		return currentDate.getTime();
	}

	/**
	 * 功能：获取本年的开始时间
	 */
	public static Date endOfTheYear(int year) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, 11);
		cal.set(Calendar.DAY_OF_MONTH, 31);
		cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.SECOND, 59);
		cal.set(Calendar.MILLISECOND, 999);
		return cal.getTime();
	}
}
