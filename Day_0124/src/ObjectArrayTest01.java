class Person {
	private String name;
	private int age;

	public Person() {
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void output() {
		System.out.println(name + " : " + age);
	}
}

public class ObjectArrayTest01 {

	public static void main(String[] args) {
//		Person p = new Person("홍길동", 25); // 단일 객체 생성
//		p.output();

		// 방이 5개짜리인 배열 생성 (Person타입의 데이터가 저장)
		Person[] parr = new Person[5]; // 객체 배열
		int size = 0; // 객체가 몇 번방까지 들어가 있는지 기억하는 변수

		// (1) 회원 가입블럭
		parr[size] = new Person("전우치", 30);
		++size;
		parr[size] = new Person("임꺽정", 25);
		++size;
		parr[size] = new Person("홍길동", 26);
		++size;
		parr[size] = new Person("사오정", 29);
		++size;
		parr[size] = new Person("저팔계", 31);
		++size;

		// (2) 전체 출력 블럭
		for (int i = 0; i < size; i++) {
			parr[i].output();
		}

		System.out.println();

		// delete
		// 1) 위치 search
		// 2) 앞으로 땡겨오기 -> 마지막방 size--;
		// 3) for문으로 처리

		// (3) search 블럭
		int searchIdx = -1;
		String searchName = "심사임당";

		for (int i = 0; i < size; i++) {
			if (parr[i].getName().equals(searchName)) {
				searchIdx = i; // 인덱스 저장
				break;
			}
		}
		System.out.printf("%s의 위치 : %d%n%n", searchName, searchIdx);

		// (4) 삭제 블럭
		if (searchIdx != -1) {
			for (int j = searchIdx; j < size - 1; j++) {
				parr[j] = parr[j + 1];
			}
			--size;
		} else {
			System.out.printf("%s 이름의 사람이 존재하지 않습니다.%n", searchName);
		}

		// 출력
		for (int i = 0; i < size; i++) {
			parr[i].output();
		}

		// 회원가입 실패 경우
		if (size >= parr.length) {
			System.out.println("\n다음 기회에~\n");
		}

	} // end main

}
