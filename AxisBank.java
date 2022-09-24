package week3.Assignments;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		System.out.println("Deposited amount is:" +300000);
}
	
	public static void main(String[] args) {
		AxisBank AB = new AxisBank();
		AB.deposit();
	}
}
