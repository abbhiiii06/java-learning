import java.util.*;
public class BankAccount
{
	private String accHolName;
	private double balance;
	static String bankname="SBI";
	static double IntrestRate=4.5;
	public BankAccount(String accHolName,double balance) {
		this.accHolName=accHolName;
		this.balance=balance;
	}
	static void UpdateIntrestRate(double newRate) {
		IntrestRate=newRate;
	}
	public void DisplayAccountInfo() {
		System.out.println("Account Holder name:"+accHolName);
		System.out.println("Account Balance:"+balance);
		System.out.println("current Intrest rate:"+IntrestRate);
	}
	public static void main(String[]args) {
		System.out.println("Old Intrest");
		BankAccount BA=new BankAccount("Abhi",5000.0);
		BA.DisplayAccountInfo();
		BankAccount BA1=new BankAccount("Sai",6000);
		BA1.DisplayAccountInfo();
		System.out.println("New Intrest rate ");
		BankAccount BA2=new BankAccount("Anu",4500.0);
		BankAccount.UpdateIntrestRate(5.0);
		BA2.DisplayAccountInfo();
	}
}
