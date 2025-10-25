package com.makemytrip.GeneriUtils;

import java.util.Date;
import java.util.Random;

public class JavaUtility {


	/**
	 * @author Jyoti S J
	 * Get Current Date
	 * @return 
	 */

	public static String getCurrentDate() {
		Date dt=new Date();
		String currentdate = dt.toString().replace(":", "_").replace(" ", "_");
		return currentdate;
	}
	
	/**
	 * 
	 * @author Jyoti S J
	 * Get Random Numbers
	 */
	public static String getRandomNum() {
		Random random=new Random();
		int num=random.nextInt(1000);
		return ""+num;
	}
}
