package struct;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("아이스아메리카노");
		set.add("아이스초코");
		set.add("카페모카");
		set.add("돌체라떼");
		set.add("자바프라프치노");
		
		set.contains("자몽허니블랙티");
		set.add("카페모카");
		
		System.out.println(set.contains("자몽허니블랙티")); //false : 
		System.out.println(set.add("카페모카")); //false : 이미 존재하는 값이기 때문에
		
		System.out.println(set.size()); // 5
		System.out.println(set.isEmpty()); //false
		System.out.println(set.remove("아메리카노")); //false
		
		String[] str = new String[set.size()];
		set.toArray(str);
		for(String s : set.toArray(str)) 
			System.out.println(s);
		
	}
}