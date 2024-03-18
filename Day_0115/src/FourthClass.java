
public class FourthClass {
	
	public static void main(String srgs[]) {
		char ch;  // 변수 선언
		ch = 'a'; //초기화
		
		// Casting (형변환)
		ch = (char)(ch+1); // 2 byte + 4 byte ==> 4 byte + 4 byte = 4 byte (int 타입)
		// 연산 총 3번 :  1. +   2. 형변환   3. 대입(=)
		
		// _을 아용한 1000자리 표현
		int value = 1_234_456_000;
		
		
		System.out.println(ch); // b
		System.out.println(value); 
		System.out.printf("%,d\n",value); 
		System.out.println("끝!\n"); 
		
		
		// 실수형 (float : 단정도, double : 배정도)
		float f1 = 4.1F ; //F 붙여야 함
		double d1 = 4.1;  //doubel형이 기본 타입
		double d2 = 0.0000000123456;
		System.out.println(d2);
		System.out.printf("%.13f\n",d2);
				
		
		//printf를 이용한 출력
		char ch1 = 'a';
		System.out.printf("%d\n",(int)ch1);
		System.out.printf("%c\n",ch1);
		System.out.printf("%s\n","안녕하세요?");
		// %d:정수형, %f:실수형, %s:문자열, %c:char형, %%:%문자, %n(=\n):개행
		String str = "손오공";
		System.out.println("\n====================");
		System.out.println("12345678901234567890");
		System.out.println(str);
		System.out.printf("%s\n",str);
		System.out.printf("%10s\n",str);
		System.out.printf("**%10s**\n",str);  // 오른쪽 정렬
		System.out.printf("**%-10s**\n",str); // 왼쪽 정렬
		
		
		
		
	}
}
