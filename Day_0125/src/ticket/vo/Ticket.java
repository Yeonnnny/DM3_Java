package ticket.vo;

public class Ticket {
	private int number;
	private int price;

	
	public Ticket() {
		super();
	}
	
	public Ticket(int number, int price) {
		super();
		this.number = number;
		this.price = price;
	}
	
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
		return String.format("번호 : %d, 가격 : %,d", number,price);
	}
	
}
