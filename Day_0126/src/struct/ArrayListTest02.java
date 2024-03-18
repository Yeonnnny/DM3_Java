package struct;

import java.util.ArrayList;
import java.util.List;

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}

public class ArrayListTest02 {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		
		list.add(new Person("홍길동",20));		
		list.add(new Person("전우치",25));
		list.add(new Person("손오공",30));
		list.add(new Person("사오정",21));
		
		list.add(1, new Person("저팔계",15));
		// 홍-저-전-손-사
		// 5개
		
		Person p = list.remove(4); // 사오정 삭제, return 사오정(4)
		System.out.println(p);
		
		// 손오공(3)->삼장법사 (return 손오공(3))
		// 홍-저-전-사
		p = list.set(3, new Person("삼장법사",65));
		System.out.println(p);
		
		p = list.get(1); // (return 저팔계(1))
		System.out.println(p);
		
	}

}
