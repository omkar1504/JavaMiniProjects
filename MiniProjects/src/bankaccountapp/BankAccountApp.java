package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		List<Account> accounts = new LinkedList<Account>();

		// Read a CSV File create new account based on that data
		String file = "E:\\NewBankAccounts.csv";
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		for (String[] accoundHolder : newAccountHolders) {
			String name = accoundHolder[0];
			String sSN = accoundHolder[1];
			String accountType = accoundHolder[2];
			double initDeposit = Double.parseDouble(accoundHolder[3]);
			if (accountType.equals("Savings")) {
				accounts.add(new Savings(name, sSN, initDeposit));
			} else if (accountType.equals("Checking")) {
				accounts.add(new Checking(name, sSN, initDeposit));
			} else {
				System.out.println("Error Reading Account Type");
			}
		}

		for (Account acc : accounts) {
			System.out.println("\n*************");
			acc.showInfo();
		}

	}

}
