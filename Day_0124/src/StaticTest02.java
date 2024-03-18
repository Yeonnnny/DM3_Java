class Test{
	static final int DATA =12;
	private static double value;
	// 생성자 ==> 인스턴스 변수 생성하고 초기화하는 것이 목적!
	// static 초기화 블럭 ==> static 변수 초기화 용도
	// primitive 타입은 그냥 바로 초기화가 가능하지만 선언과 동시에 할 수 없는 경우가 있어서 static블록 존재
	static {
		value = 55;
	}
	
	private Test() {} // 인스턴스 변수가 없을 때는 생성자가 필요없으므로 굳이 JVM이 public으로 생성자 만들지 않도록 private으로 감춤 
	
	public void output() {
		System.out.println(DATA + ", "+value); // non-static에서는 static 접근 가능
	}
}

public class StaticTest02 {
	private int a =10;
	public static void main(String[] args) {
		System.out.println(Test.DATA);
//		System.out.println(a); // static에서는 non-static 접근 불가 
//		Test.output();
	}

}
