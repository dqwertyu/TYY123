package com.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class util {
   public static void main(String[] args) throws ParseException {
	Date date1=new Date();
	Date date2=new Date(System.currentTimeMillis()+1000);
	System.out.println(date1);	
	System.out.println(date2);
	SimpleDateFormat sdf=new SimpleDateFormat("Gyyyy年MM月dd日HH分mm分55秒E");
	System.out.println(sdf.format(date1));
	Calendar rili=Calendar.getInstance();
	
	int nian=rili.get(Calendar.YEAR);
	int yue=rili.get(Calendar.MARCH)+1;
	int ri=rili.get(Calendar.DATE);
	System.out.println("今天是"+nian+"年"+yue+"月"+ri+"日");
	
	rili.set(nian, yue,ri);
	rili.add(Calendar.DATE ,100);
	nian=rili.get(Calendar.YEAR);
	yue=rili.get(Calendar.MARCH);
	ri=rili.get(Calendar.DATE);
	System.out.println("100天后的今天是"+nian+"年"+yue+"月"+ri+"日");
	
	LocalDate dqrq=LocalDate.now();
	System.out.println("100天后的今天是"+dqrq.plusDays(100));
	
	SimpleDateFormat sdf3=new SimpleDateFormat("yyyy/mm/ddd");
	String rqzfc="2018/01/27";
	Date date3=sdf3.parse(rqzfc);
	System.out.println(date3);
	SimpleDateFormat sdf4=new SimpleDateFormat("yyyy年MM月dd日");
	System.out.println(sdf4.format(sdf3.parse(rqzfc)));
}
}
