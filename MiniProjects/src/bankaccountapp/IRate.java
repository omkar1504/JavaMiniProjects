package bankaccountapp;

public interface IRate {

	// Write a method that returns a base rate
	default double getBaseRate() {
		return 2.5;
	}

}
