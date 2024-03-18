package shape.vo;

public abstract class MyPoint { // abstract : 객체 생성 불가
	private int x;
	private int y;
	
	
	public MyPoint() {
		super();
	}


	public MyPoint(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}


	public int getX() {
		return x;
	}


	public int getY() {
		return y;
	}


	public void setX(int x) {
		this.x = x;
	}


	public void setY(int y) {
		this.y = y;
	}
	
	// 면젹 구하는 메소드
	public abstract double calcArea();
	
	// 임시 메소드
	public void temp() {
		System.out.println("포인트 클래스입니다.");
	}

	@Override
	public String toString() {
		return "MyPoint [x=" + x + ", y=" + y + "]";
	}
	
}
