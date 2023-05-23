package methodoverloadandoverrideExample;

public abstract  class BankInfo {

	public void saving(double savingMoney) {
		System.out.println("Saving Money in Bank : " +savingMoney);
	}
	public void fixed() {
		System.out.println("Fixed");
	}
	abstract void deposit();

}
