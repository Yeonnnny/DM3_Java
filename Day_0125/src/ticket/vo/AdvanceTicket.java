package ticket.vo;

public class AdvanceTicket extends Ticket {
	private int beforedate;

	public AdvanceTicket() {
		super();
	}

	public AdvanceTicket(int beforedate) {
		super();
		this.beforedate = beforedate;
		if (beforedate >= 10) setPrice(50_000); 
		else if (beforedate < 10) setPrice(80_000); 
		
	}
	public AdvanceTicket(int beforedate, int number, int price) {
		super(number, price);
		this.beforedate = beforedate;
		if (beforedate >= 10) setPrice(50_000); 
		else if (beforedate < 10) setPrice(80_000); 
	}
	

}
