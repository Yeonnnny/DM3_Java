package ticket_dy.vo;

public class AdvanceTicket extends Ticket {
	private int beforedate;

	public AdvanceTicket() {
		super();
	} 

	public AdvanceTicket(int beforedate) { 
		super();
		this.beforedate = beforedate;
		if (beforedate > 10) {
			setPrice(50_000); 
		} else if (beforedate <= 10) {
			setPrice(80_000); 
		}

	}


	@Override
	public String toString() {
		
		return super.toString()+"  AdvanceTicket [beforedate=" + beforedate + "]";
	}

	@Override
	public void myMethod() {

		
	}


}
