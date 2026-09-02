public class OnlineTicketBookings {
	static private int totalticketSold=0;
	private String CustomerName;
	private int TicketsBooked;
	
	
	public OnlineTicketBookings(String CustomerName,int TicketsBooked) {
		this.CustomerName=CustomerName;
		this.TicketsBooked=TicketsBooked;
		totalticketSold+=TicketsBooked;
		System.out.println("Tickets confirmed:"+this.CustomerName);
		
	}
	public void displayTotalTicketsSold() {
		System.out.println("Toatl solded:"+totalticketSold);
	}
	public static void main(String[]args) {
		OnlineTicketBookings OB=new OnlineTicketBookings("abhi",1);
		new OnlineTicketBookings("sai",2);
		OB.displayTotalTicketsSold();
	}

}
