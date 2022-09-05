package AtmMachineProject;

public class ATM {
	private double balance;      //Data Hiding
	private double depositAmount;
	private double withdrawAmount;
	
	//Default Constructor
	public ATM() {
		
	}

	
	//Getter Setter Method
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}

	public double getWithdrawAmount() {
		return withdrawAmount;
	}

	public void setWithdrawAmount(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}
	
	
	
	
}
