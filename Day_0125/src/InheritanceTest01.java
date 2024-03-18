class Parent{
	private int money = 2000;
	
	public Parent() {
		super(); // 최상위 클래스 Object를 상속받음
	}
	
	public Parent(int money) {
		super();
		this.money = money;
	}
	
	public int earning() {
		return this.money*2;
	}
	public void output() {
		System.out.println("부모 현재 자산 : "+ money+", 투자 수익 : "+this.earning());
	}
}

class Child extends Parent{
	private int property =1000 ;

	public Child() {
		super(); // 부모의 기본생성자 먼저 호출, 이 코드가 생략되어도 jvm이 만들어줌. 근데 parent에 생성자가 없ㅇ으면 오류남. 기본생성자가 없으려면 둘 다 없어야 함
				 // 부모에게 상속받은 것은 super,this 줄 다 붙일 수 있음
	}
	
	public Child(int property) {
		super();
		this.property = property;
	}
	
	public int gather() {
		return property*=3;
	}
	
	@Override
	public void output() { //Overriding
		super.output(); // 부모의 output 한꺼번에 같이 
		System.out.println("자식 현재 자산 : "+ property+", 증식 자산 : "+this.gather());		
	}
	
	@Override
	public String toString() {
		return "Child [property=" + property + "]";
	}
	

	
}


public class InheritanceTest01 {

	public static void main(String[] args) {
//		Parent p = new Parent();
//		p.output();
		
		Child c = new Child();
		c.output();
		c.gather();
		c.earning();
		System.out.println(c.toString()); //Child@66d1af89 Child가 참조하고 있는 hash 주소
		// println() 메소드는 전달인자로 객체를 받으면 
		// 자동으로 그 클래스의 toString()을 호출하도록 설계되어 있음
		// 사실 주소는 메모리에 올라ㅇ가있다는 사실 외에는 쓸만한 게 없어서 보통 기본적으로 toString()을 오버라이딩 해서 사용함
		System.out.println(c);            //Child@66d1af89 동일함
		
		
	}

}
