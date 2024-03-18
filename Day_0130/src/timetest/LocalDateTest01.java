package timetest;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;
import java.time.ZoneId;

public class LocalDateTest01 {

	public static void main(String[] args) {
		LocalDate d1 = LocalDate.now();
		LocalDate d2 = LocalDate.of(2024,1,1);
		
		LocalTime t1 = LocalTime.now();
		LocalTime t2 = LocalTime.of(14,26,10);
		
		System.out.printf("LocalDate now() : %s%n",d1);
		System.out.printf("LocalDate of() : %s%n",d2);
		System.out.printf("LocalTime now() : %s%n",t1);
		System.out.printf("LocalTime of() : %s%n",t2);
		
		
		LocalDateTime ld1 = LocalDateTime.now();
		LocalDateTime ld2 = LocalDate.now().atTime(LocalTime.MIDNIGHT);
		LocalDateTime ld3 = LocalDate.now().atTime(LocalTime.MAX);
		
		System.out.printf("LocalDateTime now() : %s%n",ld1);
		System.out.printf("LocalDateTime MIDNIGHT : %s%n",ld2);
		System.out.printf("LocalDateTime MAX : %s%n",ld3);
		
		// now()
		LocalDateTime time1 = LocalDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.printf("LocalDateTime Seoul : %s%n",time1);
		LocalDateTime time2 = LocalDateTime.now(Clock.systemDefaultZone());
		System.out.printf("LocalDateTime systemDefaultZone : %s%n",time2);
		
		// 0f()
		LocalDateTime time4 = LocalDateTime.of(2024, 1,15,0,0,0);
		System.out.printf("LocalDateTime of : %s%n",time4);		
		LocalDateTime time5 = LocalDateTime.of(LocalDate.now(),LocalTime.now());
		System.out.printf("LocalDateTime of : %s%n",time5);
		
		// parse()
		LocalDateTime independent = LocalDateTime.parse("1945-08-15T15:36:00.000");
		System.out.printf("LocalDateTime independent : %s%n",independent);
		
		LocalDateTime xmas = LocalDateTime.of(2024,12,25,0,0,0);
		System.out.printf("LocalDateTime xmas : %s%n",xmas);
		
		//at()
		LocalDateTime vote = Year.of(2024).atMonth(4).atDay(10).atTime(10,00);
		System.out.printf("LocalDateTime vote : %s%n",vote);
		
		LocalDateTime time6 = LocalDate.now().atTime(10,30);
		LocalDateTime time7 = Year.of(2024).atMonth(1).atDay(15).atTime(10,30);
		System.out.printf("LocalDateTime : %s%n",time6);
		System.out.printf("LocalDateTime : %s%n",time7);
		
		
		
	}

}
