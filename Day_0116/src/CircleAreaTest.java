/*
 * 키보드로부터 데이터를 입력받아 
 * 원의 면적을 구하는 프로그램
 */

import java.util.Scanner;


public class CircleAreaTest {

	public static void main(String[] args) {
		// 변수 선언
		double radius, area;
		final double PI = 3.141592;
		
		Scanner keyin = new Scanner(System.in); // primitive type이 아닌 경우는 new로 초기화해야 함 (String 제외)
		
		System.out.print("원의 반지름 입력 : ");
		radius = keyin.nextDouble();  // 데이터가 올바르게 입력될 때까지 Blocking 상태
		
		area = (radius*radius) * PI;
		
		System.out.printf("반지름이 %.1f인 원의 넓이 : %.2f",radius,area);
		
		keyin.close();

		
	}

}
