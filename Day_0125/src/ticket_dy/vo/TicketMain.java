package ticket_dy.vo;

public class TicketMain {

	public static void main(String[] args) {
		WalkupTicket w = new WalkupTicket();
		System.out.println(w);
		AdvanceTicket a = new AdvanceTicket(15);
		System.out.println(a);
		AdvanceTicket a1 = new AdvanceTicket(8);
		System.out.println(a1);
		WalkupTicket w1 = new WalkupTicket();
		System.out.println(w1);
		

	}

}
