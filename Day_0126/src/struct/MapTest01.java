package struct;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {

	public static void main(String[] args) {

		Map<Integer,String> map = new HashMap<>();
		
		// 데이터 넣기
		map.put(100, "홍길동");
		map.put(200, "사오정");
		map.put(300, "저팔계");
		System.out.println(map);
		
		
		map.put(100, "삼장법사"); // 100이 존재하는 경우, 데이터 변경
		System.out.println(map);
		
		
		// get(key)
		// 정수 300이 객체 300으로 변경 (Auto Boxing)
		// 키가 있으면 밸류 반환, 아니면 null반환
		System.out.println(map.get(300));  // 저팔계
		System.out.println(map.get(700));  // null
		
		// containsKey(key)
		// 값 존재 여부 확인 (return boolean)
		System.out.println(map.containsKey(700)); // false
		
		
		// containsValue(value)
		// 값 존재 여부 확인 (return boolean)
		System.out.println(map.containsValue("삼장법사")); //true
		
		System.out.println(map);
		map.remove(200); // 키 200인 데이터 삭제
		System.out.println();
		
		
		// 100번 키가 있을 경우 아래 두 메소드의 차이는?
		System.out.println(map);

		map.replace(400, "전우치"); // (only 수정)키가 100인 값의 value 수정
		System.out.println(map);

		map.put(400, "삼장법사"); // 삽입, 수정
		System.out.println(map);
		
		System.out.println(map.keySet()); // 현재 존재하는 key값 리스트로 출력

		
		
	}

}
