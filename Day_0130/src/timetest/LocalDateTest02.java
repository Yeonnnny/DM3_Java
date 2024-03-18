package timetest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTest02 {

	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.of(2024,1,30,15,13,00);
		
		System.out.println("그냥 출력 : "+now);
		String format1 = now.format(DateTimeFormatter.ofPattern("yyyyMMddhhmmssSSS"));
		System.out.println("포맷1: "+format1);
		String format2 = now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh시 mm분 ss.SSS초"));
		System.out.println("포맷2: "+format2);
		String format3 = now.format(DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println("포맷3: "+format3);
		
		
	}

}
