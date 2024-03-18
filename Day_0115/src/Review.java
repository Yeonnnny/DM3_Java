import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
		
		// 출력

		System.out.println("Hello, world");
		System.out.print("Hello");
		System.out.println("World");
		
		
		System.out.println();
		
		System.out.println("Hello, world");
		System.out.print("3+5=");
		System.out.println(3+5);

		
		// 덧셈 뺄셈
		
		System.out.println();
		System.out.println(5+3);
		System.out.println(5-3);
		System.out.println(5*3);
		System.out.println(5/3); //1.6666666666666667이 아닌 1임 : int/int => int
		
		
		// 변수 선언과 저장
		// 변수 ? 하나의 값을 저장하기 위한 공간
		
		System.out.println();
		int x = 5;
		System.out.println(x);
		x = 10;
		System.out.println(x);
		
		System.out.println();
		int a = 10;
		int b = 5;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
		
		// 변수의 타입
		// int, long, float, double, char, String
		System.out.println();
		
		int c = 100;
		double pi = 3.14;
		char ch = 'a';
		String str = "abc";
		
		System.out.println(c);
		System.out.println(pi);
		System.out.println(ch);
		System.out.println(str);
		
		
		
		// 상수와 리터럴
		// 상수 ? 값을 한 번 저장하면 변경할 수 없는 저장 공간
		System.out.println();
		final int MAX_VALUE;
		MAX_VALUE = 100;
//		MAX_VALUE = 200; // final지정자가 잇는 변수는 상수 변수이기 때문에 초기화 값을 변경할 수 없음 

		// 리터럴 : 그 자체 값을 의미하는 것
		long l = 1004l;
		int octNum = 010; // 8진수 10, 10진수로 8 : 8진수의 경우 수 앞에 0을 붙임
		int hexNum= 0x10; // 16진수 10, 10진수로 16 : 16진수는 0x나 0X 붙임
				
		// 정수형 리터럴의 중간에 구분자'_' 사용가능 => 큰 숫자 편하게 읽을 수 있음 
		long big = 1_000_000_000l;
		int bigg = 1_000_000;
		System.out.printf("%d\n",big);
		System.out.printf("%,d",big);
		System.out.println();
		System.out.printf("%d\n",bigg);
		System.out.printf("%,d",bigg);
				
		float f = 3.14f; //무조건 f나 F붙여야 함
		double d = 3.14; // d나 D 안붙여도 됨

		
		
		// 문자 리터럴과 문자열
		
		char ch1 = 'J'; // 문자 리터럴에서만 작은 따옴표 사용 가능!!
		String name = "Java"; //String은 클래스이기 때문에 = new String("Java")로 객체를 생성해야 하지만 그냥 문자열만 써도 허용

		
		// 문자열 결합 : 연산 순서대로
		System.out.println("\n\n");

		System.out.println(7+" ");
		System.out.println(" "+7);
		System.out.println(""+7);
		System.out.println("7"+7);
		System.out.println(7+"7");
		System.out.println(7+7+"7");
		System.out.println("7"+7+7);
		System.out.println("7"+7*7);
		System.out.println(7+"7"+7);
		System.out.println(""+7+7);
		
		
		// 두 변수의 값 바꾸기
		System.out.println();
		int h=10;
		int g=20;
		
		int tmp ;
		tmp = h;
		h = g;
		g = tmp;
		
		int xx = 10, yy=5;
		System.out.printf("xx=%d\n",xx);
		System.out.printf("yy=%d\n",yy);
		
		tmp = xx;
		xx =yy;
		yy=tmp;
		
		System.out.printf("xx=%d\n",xx);
		System.out.printf("yy=%d\n",yy);
		
		
		// 기본형과 참조형
		System.out.println();
		/* 기본형 (primitive type) : 논리형(boolean), 문자형(char,String), 정수형(byte,short,int,long), 실수형(float,double) 계산을 위한 실제 값을 저장. 모두 8개 
		   참조형 (reference type) : 객체의 주소를 저장. 8개 기본형을 제외한 나머지 타입 */
		
		/* 
		 * 자료형(data type)과 타입(type)의 차이?
		 * 기본형은 저장할 값의 종류에 따라 구분되므로 기본형의 종류를 얘기할 때는 '자료형'이라는 용어 사용함.
		 * 참조형은 항상 '객체의 주소(4 byte 정수)'를 저장하므로 값이 아닌, 객체의 종류에 의해 구분되므로 참조형 변수의 종류를 구분할 때는 '타입'이라는 용어 사용
		 * 타입이 자료형보다 넓은 의미이므로 굳이 용어 구분하지 않음
		 */
		
		
		// printf를 이용한 예제
		
		// %전체자리.소수점아래자리f
		double dd = 1.23456789;
		System.out.printf("dd =%14f\n",dd); // 기본적으로 f는 소수점 아래 6자리까지만 출력
		System.out.printf("dd =%14.8f\n",dd);
		System.out.printf("dd =%14.10f\n",dd);
		System.out.printf("dd =%-14.10f\n",dd);
		System.out.printf("dd =%014.10f\n",dd);
		System.out.println();
		
		
		String url = "www.codechobo.com";
		System.out.printf("[%s]\n",url);
		System.out.printf("[%20s]\n",url);
		System.out.printf("[%-20s]\n",url);
		System.out.printf("[%.8s]\n",url); // 소수점 뒤에 나오는 숫자 만큼의 길이만 출력
		
		
		// 화면으로부터 입력받기
		
		System.out.println();
		
		Scanner scan = new Scanner(System.in); // Scanner 클래스 객체 생성
		
//		String input = scan.nextLine();
//		//int input_num = (int)(input); // String -> int : Cast 지원하지 않음
//		int input_num = Integer.parseInt(input); // input을 int타입으로 변환
		
		
		System.out.print("두 자리 정수 한 개 입력 > ");
		String input = scan.nextLine();
		int number = Integer.parseInt(input);
		
		System.out.println("입력 내용 : "+input);
		System.out.printf("num = %d\n",number);
		
		
		
	}
}
