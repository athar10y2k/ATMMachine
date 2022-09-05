package AtmMachineProject;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl implements AtmOperationInterface {

	ATM atm = new ATM();
	Map<Double,String> ministmt=new HashMap<>();
	
	@Override
	public void viewBalance() {
		System.out.println("Available Balance : "+atm.getBalance()+"$");
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		if(withdrawAmount %500==0) {
			if(atm.getBalance()>=withdrawAmount) {
				ministmt.put(withdrawAmount, "$ Amount Withdrawal");
				System.out.println(withdrawAmount+"$ Withdrawal Successfully!!");
				System.out.println("Dont Forget to Collect Your Cash💰");
				atm.setBalance(atm.getBalance()-withdrawAmount);
				viewBalance();
			}
			else {
				System.out.println("⚠Insufficient Balance!!");
			}
		}
		else {
			System.out.println("Please Enter Amount In Multiple Of 500");
		}
		
	}

	@Override
	public void depositAmount(double depositAmount) {
		ministmt.put(depositAmount, "$ Amount Deposited");
		System.out.println(depositAmount+"$ Deposited Successfully!!");
		atm.setBalance(atm.getBalance()+depositAmount);
		viewBalance();
		
	}

	@Override
	public void viewMiniStatement() {
		for(Map.Entry<Double, String> m:ministmt.entrySet()) {
			System.out.println(m.getKey()+""+m.getValue());
		}
		
	}
	
}
