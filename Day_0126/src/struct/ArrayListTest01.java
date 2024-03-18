package struct;

import java.util.ArrayList;
import java.util.List;

import shape.vo.MyPoint;

public class ArrayListTest01 {

	public static void main(String[] args) {
		// ArrayList는 클래스(concreate class) : 객체 생성 가능한 클래스
		// abstract 클래스(interface, abstract class) : 객체 생성 불가능한 클래스
		List<String> list = new ArrayList<>(); // heap에 생성되었지만 빈 리스트
		List<String> list2 = null; // stack에만 생성되고 heap에는 생성 안됨. 즉 참조하지 않은 상태
		
		List<MyPoint> points = new ArrayList<>();
		
		list.add("사과");
		list.add("배");
		list.add("바나나");
		list.add("복숭아");
		list.add("딸기");
		
		list.get(1);
		System.out.println(list.get(1));
		
		//중간에 데이터 삽입
		list.add(1, "수박");
		
		System.out.println("데이터의 개수 : "+list.size()); 
		
		// 전체 순회
		for(String i : list) {
			System.out.print(i+" ");
		}
		
		System.out.println("\n========================================");
		System.out.println(list); // [사과, 수박, 배, 바나나, 복숭아, 딸기]
		// ArrayList의 toString()이 오버라이드 되어있기 때문에 주소대신 목록 출력됨 
		
		// 수정
		list.set(2, "오렌지");  // 배->오렌지
		System.out.println(list); // [사과, 수박, 오렌지, 바나나, 복숭아, 딸기]
		
		//삭제
		list.remove(0); //0번 값 사과 삭제
		System.out.println(list); // [수박, 오렌지, 바나나, 복숭아, 딸기]
		System.out.println("데이터의 개수 : "+list.size()); 

		list.clear() ;// 싹 다 지우는 함수
		System.out.println(list); // []
		System.out.println("데이터의 개수 : "+list.size()); 
		
		list.isEmpty();
		System.out.println(list.isEmpty());
		
	}

}

















