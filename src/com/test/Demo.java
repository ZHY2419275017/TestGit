package com.test;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;

public class Demo {

	public static void main(String[] args) {
		// System.out.println("��һ�θ���");
		// System.out.println("第二次更改");
		// System.out.println(System.currentTimeMillis());

		/*java.sql.Date sqlDate = new java.sql.Date(System.currentTimeMillis());
		System.out.println("sqlDate:" + sqlDate);
		System.out.println(System.currentTimeMillis());
		java.util.Date utilDate = new java.util.Date(sqlDate.getTime());
		System.out.println("utilDate:" + utilDate);
		java.sql.Date utilToSqlDate = new java.sql.Date(utilDate.getTime());
		System.out.println("utilToSqlDate:" + utilToSqlDate);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String strUtilDate = sdf.format(sqlDate);
		System.out.println("strUtilDate:" + strUtilDate);*/
		
		//BigDecimal数据类型测试
		double d1= 0.02;
		double d2= 0.03;
		System.out.println(d2+d1);
		
		BigDecimal money1 = new BigDecimal("0.03");
		BigDecimal money2 = new BigDecimal("0.04");
		System.out.println(money1.add(money2));
		System.out.println(money1.subtract(money2));
		System.out.println(money1.divide(money2));
		System.out.println(money1.multiply(money2));
		System.out.println(BigDecimal.ONE);
		System.out.println(money1.compareTo(BigDecimal.ONE)==0);
		System.out.println(money1.setScale(2, BigDecimal.ROUND_HALF_UP));
		
		
		
		
		
		

	}

}
