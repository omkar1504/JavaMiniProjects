package bankaccountapp;

public class Savings extends Account {

	// List properties specific to the Savings Account
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;

	// Constructor to initialize settings for the Savings properties
	public Savings(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "1" + accountNumber;
		safetyDepositBox();
	}

	@Override
	public void setRate() {
		rate = getBaseRate() - .25;
	}

	private void safetyDepositBox() {
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
	}

	// List any methods specific to the Savings account
	public void showInfo() {
		System.out.println("Account Type : Savings Account");
		super.showInfo();
		System.out.println("Your Savings Account Features" + "\n Safety Deposit Box ID: " + safetyDepositBoxID
				+ "\n Safety Deposit Box Key: " + safetyDepositBoxKey);
	}

}
