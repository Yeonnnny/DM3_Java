package shape.vo;

public class MyRectangle extends MyPoint {
	private double width ;
	private double height ;

	public MyRectangle() {
		super();
	}

	public MyRectangle(double width, double height) {
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
		return width*height;
	}


	@Override
	public String toString() {
		return "[MyRectangle] : "+super.toString()+" [width=" + width + ", height=" + height +", area = "+String.format("%.2f",calcArea())+ "]";
	}
	

}
