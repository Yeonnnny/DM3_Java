package ticket_dy.vo;

public abstract class Ticket { // abstract: 객체를 생성할 필요 없는 클래스 앞에 붙여줌
	private int number;
	private int price;
	public static int NUM =100;
	
	
	public Ticket() {
		super();
		this.number = ++NUM;
		this.price = 100_000;
	}
	
	
//	public Ticket(int number, int price) {
//		super();
//		this.number = number;
//		this.price = price;
//	}
	
	public abstract void myMethod(); // 추상메소드

	public int getNumber() {
		return number;
	}
	public int getPrice() {
		return price;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	


	
	@Override
	public String toString() {
		return String.format("번호 : %d, 가격 : %,7d", number,price);
	}

}


