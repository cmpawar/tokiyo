import java.util.Scanner;

public class AtmTransaction {

	
	public static void main(String args[]) {
		
		int balance=100000,withdraw,deposite;
		//scanner class object to get choice of user
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		while (true)
		{
			System.out.println("Automated Teller Machine");
			System.out.println("Choose 1 for withdraw");
			System.out.println("Choose 2 for Deposite");
			System.out.println("Choose 3 for Check Balance");
			System.out.println("Choose 4 for Exit");
			System.out.println("Choose the operation You Want to Perform");
			//get choice from user
			
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter Money to be withdrawn");
				
				withdraw = sc.nextInt();
				
				if(balance>=withdraw) {
					
					balance = balance - withdraw;
					System.out.println("Please Collect your Money");
				}
				else 
				{
					System.out.println("Insufficient fund");
				}
				System.out.println("");
				break;
				
			case 2:
				System.out.println("Enter Amount to be deposited");
				
				deposite = sc.nextInt();
				
				balance = balance + deposite;
				
				System.out.println("Balance = "+ balance);
				System.out.println("Your deposite Amount Credited to Your Account");
				System.out.println("");
				break;
			case 3 :
				System.out.println("Your Balance is = "+balance); 
				System.out.println("");
				break;
			case 4 :
				System.out.println("You have Ended the Transaction Thank you");
				
				System.exit(0);
				break;
				
				
			}
		}
		
	}
}

