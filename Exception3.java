public class Exception3{
	public static void main(String []args){
		try{
			System.out.println("Result :- " + 3/0);
			System.out.println("In Try...");
		}catch(ArithmeticException ae){
			System.out.println("Exception : " + ae.getMessage());
		}
		System.out.println("It's Still Running...");
	}
}