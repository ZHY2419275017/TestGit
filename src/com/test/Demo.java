package com.test;

import java.text.SimpleDateFormat;

public class Demo {

	public static void main(String[] args) {
		// System.out.println("��һ�θ���");
		// System.out.println("第二次更改");
		// System.out.println(System.currentTimeMillis());

		java.sql.Date sqlDate = new java.sql.Date(System.currentTimeMillis());
		System.out.println("sqlDate:" + sqlDate);
		System.out.println(System.currentTimeMillis());
		java.util.Date utilDate = new java.util.Date(sqlDate.getTime());
		System.out.println("utilDate:" + utilDate);
		java.sql.Date utilToSqlDate = new java.sql.Date(utilDate.getTime());
		System.out.println("utilToSqlDate:" + utilToSqlDate);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String strUtilDate = sdf.format(sqlDate);
		System.out.println("strUtilDate:" + strUtilDate);

	}

}
