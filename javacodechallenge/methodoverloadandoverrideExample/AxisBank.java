package methodoverloadandoverrideExample;

public class AxisBank extends BankInfo{

	@Override
	void deposit() {
		System.out.println("Deposit");
		
	}
	public static void main(String[] args) {
		AxisBank bank = new AxisBank();
		bank.saving(50.00);
		bank.fixed();
		bank.deposit();
	}

}
