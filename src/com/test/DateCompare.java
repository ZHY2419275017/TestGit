package com.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCompare {
  
	//定义一个日期比较的方法
	public static boolean dateCompareMethod(String beforetime,String aftertime){
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date beforeUtilDate  = null;
		Date afterUtilDate = null;
		try {
			beforeUtilDate =  sdf.parse(beforetime);
			afterUtilDate =  sdf.parse(aftertime);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int flag = beforeUtilDate.compareTo(afterUtilDate);
		if(flag == 0){
			System.out.println("两个日期相等");
			return false;
		}else if(flag < 0){
			System.out.println("前一个日期比后一个日期早！");
			return true;
		}else if( flag>0){
			System.out.println("前一个日期比后一个日期晚！");
			return false;
		}else{
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println(dateCompareMethod("2019-07-21","2019-07-29"));
	}
}
