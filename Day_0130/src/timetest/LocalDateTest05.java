package timetest;

import java.time.LocalDate;

public class LocalDateTest05 {

	public static void main(String[] args) {
		
		LocalDate koreanWar = LocalDate.of(1950,6,25);
		LocalDate independence = LocalDate.of(1945,8,15);
		LocalDate surrender = LocalDate.of(1945,8,15);
		
		if (independence.isBefore(koreanWar))
			System.out.println("광복 이후에 전쟁 발발"); 
		
		if(koreanWar.isAfter(independence))
			System.out.println("한국전쟁은 광복 이후에 발발함");
		
		if(independence.isEqual(surrender))
			System.out.println("일왕의 항복선언은 대한독립과 같은 날임");

		if(independence.compareTo(surrender) == 0)
			System.out.println("일왕의 항복선언은 대한독립과 같은 날임");

		

	}	
	
}