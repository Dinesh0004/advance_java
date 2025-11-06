package advance_java1;
class bank1{
	private String accountnumber;
	private String accountholdrname;
	private double balance;
	public String getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getAccountholdrname() {
		return accountholdrname;
	}
	public void setAccountholdrname(String accountholdrname) {
		this.accountholdrname = accountholdrname;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int deposit(int amt) {
		if (amt<1) {
			return -1;
		}else {
			this.balance=this.balance+amt;
			return 1;
		}
	}
	public double withdraw(double amt) {
		if(amt>this.balance) {
			return -1;
		}else {
			this.balance=this.balance-amt;
			return 1;
		}
			
	}
	
}
public class bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank1 ac=new bank1();
		ac.setAccountholdrname("Dinesh");
		ac.setAccountnumber("ID123445");
		ac.setBalance(10000);
		System.out.println("Account no: "+ac.getAccountnumber());
		System.out.println("Account hoder namee: "+ac.getAccountholdrname());
		System.out.println("Account Balance:"+ac.getBalance());
		double withdraw=ac.withdraw(10000);
		if(withdraw==-1) {
			System.out.println("insufficent balance");
		}else {
			System.out.println("withdraw complete after withdraw balance is: "+ac.getBalance());
		}
		double deposit=ac.deposit(2000);
		if(deposit==-1) {
			System.out.println("invalid amount");
		}else {
			System.out.println("deposit complete after deposit balance is: "+ac.getBalance());
		}
	}

}
