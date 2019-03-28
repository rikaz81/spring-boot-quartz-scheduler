package com.accelaero.aeroinventory.scheduler.util;

import java.util.Calendar;
import java.util.Date;

public class CalenderUtils {

	public static Date add(Date date, int years, int months, int days, int hours, int minutes, int seconds) {
		Calendar cal = Calendar.getInstance();

		cal.setTime(date);

		if (years != 0) {
			cal.add(Calendar.YEAR, years);
		}

		if (months != 0) {
			cal.add(Calendar.MONTH, months);
		}

		if (days != 0) {
			cal.add(Calendar.DAY_OF_MONTH, days);
		}

		if (hours != 0) {
			cal.add(Calendar.HOUR_OF_DAY, hours);
		}

		if (minutes != 0) {
			cal.add(Calendar.MINUTE, minutes);
		}

		if (seconds != 0) {
			cal.add(Calendar.SECOND, seconds);
		}

		return cal.getTime();

	}
}
