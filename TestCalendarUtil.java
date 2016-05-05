package com.cyberlink.cosmetic.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;


public class TestCalendarUtil {

	private static String sinceTimePicker = "2016-04-01";
	private static String untileTimePicker = "2016-05-05";
	
	
	@Test
	public void testGetBefore5weeksMonday() throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date sinceTime = (Date) sdf.parse(sinceTimePicker);
		Date sinceTimeToMonday = CalendarUtil.setDay(sinceTime, CalendarUtil.MONDAY);
		Date sinceTimeBefore5weeksMonday = CalendarUtil.minusDay(sinceTimeToMonday, 7*4);
		
		Assert.assertEquals("2016-02-29", sdf.format(sinceTimeBefore5weeksMonday));	
	}
	
	@Test
	public void testSetDay() throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date sinceTime = (Date) sdf.parse(sinceTimePicker);
		Date sinceTimeToMonday = CalendarUtil.setDay(sinceTime, CalendarUtil.MONDAY);
		
		Assert.assertEquals("2016-03-28", sdf.format(sinceTimeToMonday));	
	}

}
