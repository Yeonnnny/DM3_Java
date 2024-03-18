/*
 * [문제-8] BMI지수 구하기

몸무게(kg)와
키(cm)를 입력 받아 BMI 지수를 구하여 출력하시오

1) Hint
BMI = 몸무게(kg) / 키(m)의 제곱
 */

import java.util.Scanner;


public class Bmi {

	public static void main(String[] args) {
		
		double height, weight, bmi ;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("체중(kg)을 입력하세요 : ");
		weight = scan.nextDouble();
		
		System.out.print("키(cm)를 입력하세요 : ");
		height = scan.nextDouble();
		height/=100; // 미터로 변환
		
		bmi = weight/(height*height);
		
		System.out.printf("bmi 지수 : %.2f",bmi);
		
		
		
		scan.close();
	}

}
                                   