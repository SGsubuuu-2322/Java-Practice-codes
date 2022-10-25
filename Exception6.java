public class Exception6{
	public static void main(String []args){
		int balance = 5000, withdrawable_amt = 10000;
		try{
			if(balance < withdrawable_amt)
				throw new ArithmeticException("Insufficient Balance");
			balance = balance-withdrawable_amt;
			System.out.println("Transaction Successfully completed.");
		}catch(ArithmeticException ae){
			System.out.println("Exception : " + ae.getMessage());
		}
		System.out.println("It still Running...");
	}
}