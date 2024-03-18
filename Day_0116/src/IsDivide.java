import java.util.Scanner;

public class IsDivide {

	public static void main(String[] args) {
		
		// 변수 선언
		int num; // 입력받을 숫자
		boolean dividedall;
		boolean dividedone;
		
		// 데이터 입력받기
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		num = scan.nextInt();
		
		// 4 와 5로 나누어지는 경우
		dividedall = (num%4==0) && (num%5==0);
		String resultall = (dividedall)? "나누어 집니다.":"나누어지지 않습니다.";
		System.out.println("4 와 5로 "+resultall);
		
		// 4 또는 5로 나누어지는 경우
		dividedone = (num%4==0) || (num%5==0);
		String resultone = (dividedone)? "나누어 집니다." : "나누어지지 않습니다.";
		System.out.println("4 또는 5로 "+resultone);
		
		// 4 또는 5로 나누어질 때 어떤 숫자로 나누어지는지 
		String dividednum = (!dividedall && dividedone && (num%4==0))? "4로 나누어 집니다.":(!dividedall && dividedone && (num%5==0))? "5로 나누어 집니다.":" ";
		System.out.println(dividednum);
		
		
		scan.close();
		
	}

}
