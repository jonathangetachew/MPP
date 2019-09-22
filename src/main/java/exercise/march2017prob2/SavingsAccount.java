package exercise.march2017prob2;

/**
 * Created by Jonathan on 9/9/2019.
 */

public class SavingsAccount extends Account {

	private String accId;
	private double interestRate;
	private double balance;

	public SavingsAccount(String accId, double interestRate, double startBalance) {
		this.accId = accId;
		this.interestRate = interestRate;
		this.balance = startBalance;
	}

	@Override
	public String getAccount() {
		return accId;
	}

	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public double computeUpdatedBalance() {
		return balance + (balance * interestRate);
	}
}
