package exercise.march2017prob2;

/**
 * Created by Jonathan on 9/9/2019.
 */

public class CheckingAccount extends Account {

	private String accId;
	private double balance;
	private double monthlyFee;

	public CheckingAccount(String accId, double fee, double startBalance) {
		this.accId = accId;
		this.balance = startBalance;
		this.monthlyFee = fee;
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
		return balance - monthlyFee;
	}
}
