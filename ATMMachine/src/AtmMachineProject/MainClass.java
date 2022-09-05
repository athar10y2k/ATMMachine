package AtmMachineProject;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		AtmOperationInterface op =new AtmOperationImpl();
		
		int atmNumber = 78692;
		int atmPin = 786;
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("Enter Atm Number : ");
		int userAtmNumber = sc.nextInt();
		
		System.out.print("Enter Atm Pin : ");
		int userAtmPin = sc.nextInt();
		
		System.out.println();
		System.out.println("Welcome To ATM Machine :)");
		
		if((atmNumber==userAtmNumber) && (atmPin==userAtmPin)) {
			while(true) {
				System.out.println("\n1. View Available Balance\n2. Withdraw Amount\n3. Deposit Amount\n4. View Mini Statement\n5. Exit");
				
				System.out.println("Enter Choice");
				int choice = sc.nextInt();
				
				if(choice==1) {
					op.viewBalance();
				}
				else if(choice==2) {
					System.out.println("Enter Amount To Withdraw: ");
					double withdrawAmount = sc.nextDouble();
					op.withdrawAmount(withdrawAmount);
				}
				else if(choice==3) {
					System.out.println("Enter Amount To Deposit: ");
					double depositAmount = sc.nextDouble();
					op.depositAmount(depositAmount);
				}
				else if(choice==4) {
					op.viewMiniStatement();
				}
				else if (choice==5) {
					System.out.println("Collect Your ATM Card💳\nThank You For Using ATM Machine🙏");
					System.exit(0);
				}
				else {
					System.out.println("Please Enter Correct Choice Between 1 to 5");
				}
				
				
				
			}
		}
		else {
			System.out.println("sorry! Enter Correct Atm Number or Atm Pin :(");
			System.exit(0);
		}

	}

}
