package ticket.vo;

public class TIcketMain {
	public static void main(String[] args) {
		
		Ticket t = new Ticket();
		
		
		WalkupTicket w = new WalkupTicket(101,10000);
		AdvanceTicket a = new AdvanceTicket(4);
		System.out.println(w);
		System.out.println(a);
	}
	

}
