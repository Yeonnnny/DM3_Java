/*
 * 국어, 수학, 영어 세 과목의 점수를 입력 
 * 평균 구하여 출력
 */

import java.util.Scanner;

public class ScoreTest {

	public static void main(String[] args) {
		
		int math, kor, eng;
		double avg;
		
		Scanner scan = new Scanner(System.in);
		
		// 점수 입력
		System.out.print("국어 점수 : ");
		kor = scan.nextInt();
		
		System.out.print("수학 점수 : ");
		math = scan.nextInt();
		
		System.out.print("영어 점수 : ");
		eng = scan.nextInt();
		
		// 평균 계산
//		avg = (double)(math+kor+eng)/3;  // casting 방식
		avg = (math+kor+eng)/3.0;        // 프로모션 일어남
		
		System.out.printf("평균 : %.2f",avg);
		
		scan.close();
		
	}

}
