import java.util.*;
public class Exception9{
	public static void main(String []args){
		Scanner ip = new Scanner(System.in);
		Transaction tr = new Transaction();
		Enquiry enq = new Enquiry();
		RemainedAmt ra = new RemainedAmt();
		
		int limit = 100000, balance = 50000, withdrawable_amt = 0; 
		System.out.println("press 1 to 'Start' and 'Continue'  and '9' stop the process : ");
		tr.temp = ip.nextInt();
		while(tr.temp != 9){
			int num;
			System.out.println("Press '2' for money transaction \n '3' for enquiring your sanctioned credit limit \n '4' for enquiring the remained credit amount :- ");
			num = ip.nextInt();
			if(num == 2){
				System.out.println("Enter the amount you want to withdraw :- ");
				withdrawable_amt = ip.nextInt();
				balance = tr.transact(balance, withdrawable_amt);
			}
			else if(num == 3){
				enq.enquiry(limit);
			}
			else if(num == 4){
				ra.showRemainedAmount(balance);
			}
			
		}
		
	}
}

class Transaction{
	Scanner ip = new Scanner(System.in);
	public static int temp = 0;
	
	public int transact(int balance, int withdrawable_amt){
		try{
			if(withdrawable_amt > balance)
				throw new ArithmeticException("Insufficient balance as compared to sanctioned credit limit...");
			else
				System.out.println("Your transaction has been completed successfully.");
		}catch(ArithmeticException ae){
			System.out.println("An Exception has Occurrred : " + ae.getMessage() + "\nTry Again...");
		}
		finally{
			System.out.println("Do you want to continue the process.If 'YES' then press 1, If 'NO' then press 9 : ");
			temp = ip.nextInt();
		}
		balance = balance - withdrawable_amt;
		return(balance);
	}
}

class Enquiry{
	Scanner ip = new Scanner(System.in);
	Transaction tr = new Transaction();
	public void enquiry(int balance){
		System.out.println("Your sanctioned credit limit is :- " + balance);
		System.out.println("Now, do you want to continue the process.If 'YES' then press 1, If 'NO' then press 9 : ");
		tr.temp = ip.nextInt();
	}
}

class RemainedAmt{
	Scanner ip = new Scanner(System.in);
	Transaction tr = new Transaction();
	public void showRemainedAmount(int balance){
		System.out.println("Your remained amount in your credit account is :- " + balance);
		System.out.println("So, now  do you want to continue the process.If 'YES' then press 1, If 'NO' then press 9 :");
		tr.temp = ip.nextInt();
	}
}