package struct;

import java.util.Objects;

class Friend {
	String name;
	int age;

	public Friend(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

//	@Override
//	public String toString() {
//		return "Friend [name=" + name + ", age=" + age + "]";
//	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name); // 데이터를 넣어서 주소를 계산 
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Friend other = (Friend) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

//	@Override
//	public boolean equals(Object obj) {
//
//		if (!(obj instanceof Friend))
//			return false;
//
//		Friend tmp = (Friend) obj; // 다운캐스팅
//
//		if ((this.name.equals(tmp.name)) & (this.age == tmp.age))
//			return true;
//
//		return false;
//	}

}

public class BasicSyntax {

	public static void main(String[] args) {
		Friend f1 = new Friend("hong", 10); // 주소 : struct.Friend@76a3e297
		Friend f2 = new Friend("hong", 10); // 주소 : struct.Friend@4d3167f4
		// f1과 f2는 다름

		// Object로부터 상속받은 메소드
		// 만약 f1 f2의 값이 모두 같으면 true 반환되도록 하려면? equals()오버라이딩
		System.out.println(f1.equals(f2)); // false->override -> true
		System.out.println(f1.hashCode()); 
		System.out.println(f2.hashCode()); 
		System.out.println(f1);
		System.out.println(f2);    
		System.out.println(f2==f1); // false
	}

}
