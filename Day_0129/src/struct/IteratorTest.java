package struct;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class IteratorTest {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("사과");
		list.add("배");
		list.add("딸기");
		list.add("바나나");
		list.add("복숭아");
		
		Iterator<String> iter = list.iterator();
		// pointer를 계속 움직이면서 작동 . 포인트가 가리키는 곳에 값이 있는지 확인
		while (iter.hasNext()) System.out.println(iter.next());
		
		// Iterator를 이용하여 Map 전체 데이터 순회
		// 1) key를 목록으로 받아옴
		// 2) iterator()를 적용
		// 3) key를 이용해여 데이터 전체 순회
		Map<Integer, String> map = new HashMap<>();
		map.put(1,"홍길동");
		map.put(2,"임꺽정");
		map.put(3,"전우치");
		map.put(4,"손오공");
		map.put(5,"사오정");
		
		Iterator<Integer> iter2 = map.keySet().iterator();
		
		while(iter2.hasNext()){
			Integer key = iter2.next();
			String value = map.get(key);
			System.out.println(key+" : "+value);
		}
		
	}

}
