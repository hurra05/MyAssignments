package bank;
/*  Class     :BankInfo
Methods :saving(),fixed(),deposit()

 Class     :AxisBank
 Methods :deposit()

Description:
You have to override the method deposit in AxisBank.
*/


public  class AxisBank extends BankInfo {
	public  void deposit() {
		System.out.println("Amount deposit");
	}
	
		// TODO Auto-generated method stub

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank object= new AxisBank() {
			
			@Override
			public void deposit() {
				// TODO Auto-generated method stub
			}
		};

	}

}
