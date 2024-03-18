package myexception;

import java.util.Scanner;

public class Exam_30 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = 0, total = 0;

		for (int i = 0; i < 5; i++) {

			System.out.print((i + 1) + ") 값 입력 : ");

			try {
				a = scanner.nextInt(); // Exception 발생 가능성 있는 코드
				scanner.nextLine(); 
				
				total += a;
			} catch (Exception e) {
				--i;
				scanner.nextLine();
				System.out.println(); // 중간 공백을 위한 개행
				continue;
			}

			System.out.println("## 현재까지의 합계 : " + total + "\n");

		} // end for

		System.out.println("> 총합계 : " + total);
		System.out.println("> 프로그램을 종료합니다.");
		
		scanner.close();
	}// end main

}
