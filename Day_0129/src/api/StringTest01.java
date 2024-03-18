package api;

public class StringTest01 {

	public static void main(String[] args) {
		
		String str1 = "무궁화 꽃이 피었습니다.";
		String str2 = "무궁화 꽃이 피었습니다.";
		String str3 = new String("무궁화 꽃이 피었습니다."); // 메모리에 별도로 만들어줌
		
		//jvm의 성능 저하에 가장 악영향 미치는 코드 : 객체 생성 & 제거 -> 같은 내용이면 하나만 만들고 참조

		// String pool 메모리 공간의 특징 
		// (Pool 공간에 동일한 데이터가 존재하면 새롭게 생성하지 않음)
		
		System.out.println(str1==str2); // 주소 비교 : true
		System.out.println(str1.equals(str2)); // 내용 비교 : true
		
		System.out.println(str1==str3); // 주소 비교 : false
		System.out.println(str1.equals(str3)); // 내용 비교 : true
		
		//====== String은 Immutable 데이터임!!!!!!!!!!!! 
		// + 연산을 하면 여러 번에 거쳐 객체를 생성하고 반환하는 작업을 하게 됨 => 성능 저하
		
		String str4 = null;
		str4 = "무궁화"; // 내용 변경 x, 객체 생성
		str4 = str4+" 꽃이";  // 내용 변경 x, 객체 생성
		str4 = str4+" 피었습니다.";  // 내용 변경 x, 객체 생성 // 성능 매우 떨어지게 됨
		System.out.println(str4);
		

		

		
	}

}
