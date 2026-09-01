import java.util.*;
public class OnlineOrderExample {
	private int orderid;
	private String customername;
	private boolean Status;
	String Choice;

    public OnlineOrderExample() {
    }
	public int getOrderid() {
		return orderid;
	}
	public void setOrder_id(int order_id) {
		this.orderid = order_id;
	}
	public String getCustomer_name() {
		return customername;
	}
	public void setCustomer_name(String customer_name) {
		this.customername = customer_name;
	}
	public boolean isStatus() {
		return Status;
	}
	public void setStatus(boolean status) {
		Status = status;
	}
	public String getChoice() {
		return Choice;
	}
	public void setChoice(String choice) {
		this.Choice = choice;
	}
    public static void main(String[]args) {
		System.out.println("====Items List====");
		System.out.println("1)Biryani with cool Drink ,Price:249");
		System.out.println("2)peer peere pizza, Price:199");
		System.out.println("3)Ice Cream,Price:49");
		System.out.println("4)Fried Rice,Price:169");
		System.out.println("5)Burger with French Frice ,Price:220");
		System.out.println("Choose above items");
		Scanner SC=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=SC.nextLine();
        System.out.println("Enter your choice from above list");
		String n=SC.next();
		int id=new Random().nextInt(100000);
        System.out.println("Enter confirming status");
		boolean sta=SC.nextBoolean();
		OnlineOrderExample d1=new OnlineOrderExample();
		d1.setCustomer_name(name);
		d1.setChoice(n);
		d1.setStatus(sta);
		d1.setOrder_id(id);
		System.out.println("Customer Name: "+d1.getCustomer_name());
		System.out.println("Customer Choice: "+d1.getChoice());
		System.out.println("Confirm Status: "+d1.isStatus());
		System.out.println("Customer Order id:"+d1.getOrderid());
        System.out.println("Thank You for chossing Us We will Deliver in few minutes OrderId: "+d1.getOrderid());
		SC.close();
	}

	
}
