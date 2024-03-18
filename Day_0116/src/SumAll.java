import java.util.Scanner;

public class SumAll {

	public static void main(String[] args) {
		int num, result ;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("0~999까지의 정수 입력 : ");
		num = scan.nextInt();
		
		int num1 = num/100;
		num-=num1*100;
		int num2 = num/10;
		num-=num2*10;
		
		result = num1+num2+num;
		
		System.out.println("합계 : "+result);
		
		scan.close();
	}

}
