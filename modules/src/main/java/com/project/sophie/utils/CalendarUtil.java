package com.project.sophie.utils;

import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarUtil {
	public static final int MONDAY = GregorianCalendar.MONDAY;
	public static final int TUESDAY = GregorianCalendar.TUESDAY;
	public static final int WEDNESDAY = GregorianCalendar.WEDNESDAY;
	public static final int THURSDAY = GregorianCalendar.THURSDAY;
	public static final int FRIDAY = GregorianCalendar.FRIDAY;
	public static final int SATURDAY = GregorianCalendar.SATURDAY;
	public static final int SUNDAY = GregorianCalendar.SUNDAY;

	/**
	 * set the orignalTime change to the specified day of the week. </br>
	 * @example originalTime "2016-05-04" Wednesday, resultTime "2016-05-02" Monday.</br>
	 * Date resultTime = setDay(originalTime, CalendarUtil.Monday)
	 * 
	 * @param originalTime
	 * @param day
	 * @return Date
	 */
	public static Date setDay(Date originalTime, int day) {
		Date resultTime = null;
		GregorianCalendar cal = new GregorianCalendar();
		cal.setFirstDayOfWeek(GregorianCalendar.MONDAY);
		cal.setTime(originalTime);
		cal.set(GregorianCalendar.DAY_OF_WEEK, day);
		resultTime = cal.getTime();
		
		return resultTime;
	}
	
	/**
	 * minus the numberOfDays on originalTime </br>
	 * @example originalTime "2016-05-05" Thursday, resultTime "2016-05-02" Monday.</br>
	 * Date resultTime = CalendarUtil.minusDay(originalTime, 3); </br>
	 * 
	 * @param originalTime
	 * @param numberOfDays
	 * @return Date
	 */
	public static Date minusDay(Date originalTime, int numberOfDays){
		Date resultTime = null;
		GregorianCalendar cal = new GregorianCalendar();
	
		cal.setTime(originalTime);
		cal.add(GregorianCalendar.DAY_OF_YEAR, -numberOfDays);
		resultTime = cal.getTime();
		
		return resultTime;
	}
	
	/**
	 * add the numberOfDays on originalTime </br>
	 * @example originalTime "2016-05-05" Thursday, resultTime "2016-05-08" Sunday.</br>
	 * Date resultTime = CalendarUtil.addDay(originalTime, 3); </br>
	 * 
	 * @param originalTime
	 * @param numberOfDays
	 * @return Date
	 */
	public static Date addDay(Date originalTime, int numberOfDays){
		Date resultTime = null;
		GregorianCalendar cal = new GregorianCalendar();
	
		cal.setTime(originalTime);
		cal.add(GregorianCalendar.DAY_OF_YEAR, numberOfDays);
		resultTime = cal.getTime();
		
		return resultTime;
	}
}