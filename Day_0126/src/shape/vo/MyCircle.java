package shape.vo;

public class MyCircle extends MyPoint {
	private double radius;
	
	
	public MyCircle() {
		super();
	}

	public MyCircle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	// 일반 메소드
	
	@Override
	public double calcArea() {
		return radius*radius*Math.PI;
	}
	
	// 임시 메소드
	@Override
	public void temp() {
		System.out.println("포인트 원클래스입니다.");
	}
	// 부모에는 없는 함수
	public void test() {
		System.out.println("포인트에는 없고 원에만 있음");
	}

	@Override
	public String toString() {
		return "[MyCircle] : "+super.toString()+" [radius=" + radius +", area = "+String.format("%.2f",calcArea())+ "]"; 
	}
}
