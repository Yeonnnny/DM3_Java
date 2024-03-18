
import java.util.Scanner;

public class TimeTranslate {

	public static void main(String[] args) {
		
		int hour, min, sec, answer;
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("시간을 초 단위로 입력하세요 : ");
		answer = scan.nextInt();
		
		sec = answer;
		
		hour = sec/(60*60);
		sec -= hour*60*60;
		min = sec/60;
		sec -= min*60;
		
		System.out.printf("%d초는 %d시간 %d분 %d초입니다.",answer, hour,min,sec);
		
		
		scan.close();
		
	}

}
