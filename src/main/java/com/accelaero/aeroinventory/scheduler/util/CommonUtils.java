package com.accelaero.aeroinventory.scheduler.util;

public class CommonUtils {

	public static boolean isNullOrEmpty(String value) {
		if (value == null || value.trim().equals("")) {
			return true;
		}
		return false;
	}

}
