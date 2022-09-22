package bank;

public class BankInfo {
public void savings() {
	System.out.println("savings");
}
public void fixed() {
	System.out.println("fixed");
}
public void deposit() {
	System.out.println("deposit");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankInfo obj1=new BankInfo();
		obj1.deposit();
		obj1.fixed();
		obj1.savings();
		
	}

}
