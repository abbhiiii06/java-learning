
public class BankExample {
	private String accNum;
	private String accHolName;
	private long balance;
	public String getAccNum() {
		return accNum;
	}
	public String getAccHolName() {
		return accHolName;
	}
	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}
	public void setAccHolName(String accHolNamw) {
		this.accHolName = accHolNamw;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public long getBalance() {
		return balance;
	}
	public void Deposit(long amount) {
		if(amount>0) {
			this.balance+=amount;
		}else {
			System.out.println("Enter correct amount");
		}
		
	}
	public void Withdraw(long amount) {
		if(amount>0 && amount<=balance) {
			this.balance-=amount;
		}
		else {
			System.out.println("The Transaction is denied");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BankExample b1=new BankExample();
        b1.setAccHolName("abhishek");
        b1.setAccNum("123345GF45");
        b1.setBalance(5000);
        IO.println("Account HolderName:"+b1.getAccHolName());
        IO.println("Account Number:"+b1.getAccNum());
        IO.println("Available balance:"+b1.getBalance());
        b1.Deposit(42000);
        System.out.println("Deposited  succesfull:"+b1.getBalance());
        b1.Withdraw(42000);
        System.out.println("Amount withdrawed succesfully available balance:"+b1.getBalance());
        
	}

}