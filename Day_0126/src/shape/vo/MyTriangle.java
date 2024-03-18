package shape.vo;

public class MyTriangle extends MyPoint {
	private double width ;
	private double height ;

	public MyTriangle() {
		super();
	}


	public MyTriangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}


	public double getWidth() {
		return width;
	}


	public double getHeight() {
		return height;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	public void setHeight(double height) {
		this.height = height;
	}
	
	// 일반 메소드

	@Override
	public double calcArea() {
		return width*height*0.5;
	}

	// 임시 메소드
	@Override
	public void temp() {
		System.out.println("포인트 삼각형 클래스입니다.");
	}

	@Override
	public String toString() {
		return "[MyTriangle] : "+super.toString()+" [width=" + width + ", height=" + height +", area = "+String.format("%.2f",calcArea())+ "]";
	}
	
	

}
