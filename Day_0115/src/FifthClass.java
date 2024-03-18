
public class FifthClass {

	public static void main(String[] args) {

		// = + - * / %
		// 반지름이 5로 주어진 원의 면적을 구하는 프로그램을 작성
		// PI * r^2
		
		int radius = 5;
		final double PI = 3.141592; // final : 상수 변수로 만드는 지정자
		double area;
		
		// 계산
		area = (radius*radius)*PI;   
		
		// 소수 이하 2자리까지 출력
		System.out.printf("반지름 %d인 원의 면적은 %.2f이다", radius, area); // 78.54
		
		
	}

}
