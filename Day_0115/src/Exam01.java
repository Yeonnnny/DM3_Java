/**
[문제-1] 적정체중 구하기
출력문과  -,* 연산자만을 이용하여 적정 체중을 구하여 출력하는 프로그램을 작성하시오
적정체중 = (키-100) *0.9
키가 180이라면 적정체중은 72.0


[문제-2] 산술연산자를 이용한 계산식
개당 4300원의 사과가 있음. 사과의 개수는 2335개라면, 사과 도매상 13명이 한 명 당 얼마를 내야하는가?


[문제-3] 자바에서 다음의 명령문을 실행했을 때 결과를 유추하고 그 결과가 의미하는 것은?
0.1+0.3
10/0
0.1/0
byte b1 = (byte)(127+1); 일 때 b1의 값?
byte b2 = 1;
b2 = b2+2;의 결과는?

**/

public class Exam01 {

	public static void main(String[] args) {
		
		System.out.println("[문제-1]");
		
		double height ;
		double weight ;
		
		height = 180;
		weight = (height-100) * 0.9;
		System.out.printf("키가 %.1f cm라면 적정체중은 %.1f kg입니다.", height, weight);

		
		
		System.out.println("\n-------------------------------------------------------------");
		System.out.println("[문제-2]");
		
		int apple_price = 4300;
		int apples = 2335;
		int num = 13;
				
		int price ;
		
		price = (apple_price*apples)/num;
		
		System.out.printf("사과 도매상 한 명 당 지불해야 하는 가격 : %,d원",price);
				
		
		
		
		System.out.println("\n-------------------------------------------------------------");
		System.out.println("[문제-3]");
		
		// 1. 
		// 실수는 무조건 오차가 발생할 것이라고 가정!!!!
		// 2진수로 바꿀 때 오차가 발생함
		// 0.1+0.3=?
		double d1=0.1;
		double d2=0.2;
		double result=d1+d2;
		System.out.println(result); //0.30000000000000004 : 0.3이 아닌 이유 (오차)
		//if (result == 0.3) // 이진으로 변환하는 과정에서 오차가 발생할 수 있기 때문에 '==' 사용할 수 없음
		//if (result >= 0.3) // 범위 연산으로 사용해야 함
		
		
		System.out.println(0.1+0.3);
		
		// 2.
		//System.out.println(10/0); //error : 0으로 나눌 수 없음
		System.out.println((double)(10)/0); // Infinity
		
		// 3.
		System.out.println(0.1/0); // double/int => double/double (:promotion) (0.1/0.0: 굉장히 작은 수) => Infinity
		
		// 4.
		                          // 127=> 0111 1111 1111 1111
		byte b1 = (byte)(127+1); // -128=> 1000 0000 0000 0000  : 뫼비우스의 띠 
		System.out.println(b1);
		
		// 5.
	
		byte b2 = 1 ;
		//b2 = b2+2;  // b2는 byte타입이므로 에러 발생
		b2 = (byte)(b2+2); 
		System.out.println(b2);
		
		
		// 오버플로우
		
		System.out.println();
		
		short sMin = -32768, sMax = 32767;
		char cMin =0, cMax = 65535;
		
		System.out.println("sMin = "+sMin);
		System.out.println("sMin-1 = "+ (short)(sMin-1));
		System.out.println("sMax = "+sMax);
		System.out.println("sMax+1 = "+(short)(sMax+1));
		System.out.println("cMin = "+(int)cMin);
		System.out.println("cMin-1 = "+(int)--cMin);
		System.out.println("cMin-1 = "+(int)(cMin-1));
		System.out.println("cMax = "+(int)cMax);
		System.out.println("cMax+1 = "+(int)++cMax);
		
		// 타입간의 변환 방법
		System.out.println();
		String strr = "3";
		
		System.out.println(strr.charAt(0)-'0');
		System.out.println('3'-'0'+1);
		System.out.println(Integer.parseInt("3")+1);
		System.out.println(Double.parseDouble("3.14")+1);
		System.out.println("3"+1); //31
		System.out.println((char)(3+'0'));
		
		// 연습문제
		System.out.println('A'+'B');
		System.out.println(true+"");
//		System.out.println(true+null);
		System.out.println(true+"null");
		System.out.println('1'+2);
		System.out.println('1'+'2');
		System.out.println('J'+"ava");
		System.out.println();
		
		int xxx = 1;
		int yyy = 2;
		int zzz = 3;
		
		int temp1, temp2;
		temp1 = xxx;
		xxx = yyy;
		yyy = temp1;
		
		temp2 = yyy;
		yyy= zzz;		
		zzz = temp2;
		
		System.out.println("x = "+xxx); // 2
		System.out.println("y = "+yyy); // 3
		System.out.println("z = "+zzz); // 1
		
		
		
		
		
		
		
		
		
	}

}
