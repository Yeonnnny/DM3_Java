package timetest;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalenderTest01 {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
		Calendar g = new GregorianCalendar(); // GregorianCalendar는 Calendar를 상속받음
		System.out.println(g);
		
		Date d = new Date();
		System.out.println(d);
		
		int year = g.get(Calendar.YEAR);
		int month = g.get(Calendar.MONTH);
		int day = g.get(Calendar.DATE);
		int hour = g.get(Calendar.HOUR);
		int minute = g.get(Calendar.MINUTE);
		int second = g.get(Calendar.SECOND);
		int yoil = g.get(Calendar.DAY_OF_WEEK);
	
		
	
		System.out.printf("%d년 %d월 %d일 %d요일, %d:%d:%d%n",year,month+1, day, yoil, hour, minute,second);
	
	
	}

}
