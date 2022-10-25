public class Exception5{
	public static void main(String []args){
		int balance = 5000;
		int withdrawable_amt = 6000;
		if(balance < withdrawable_amt)
			throw new ArithmeticException("Insufficient Balance.");
		balance = balance-withdrawable_amt;
		System.out.println("Transaction Successfully completed.");
		System.out.println("Program continue...");
		
	}
}