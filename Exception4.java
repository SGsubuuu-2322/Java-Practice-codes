public class Exception4{
	public static void main(String []args){
		String sg = null;
		try{
			System.out.println("Length :- " + sg.length());
		}catch(NullPointerException npe){
			System.out.println("Exception :- " + npe.getMessage());
		}
		finally{
			System.out.println("You're in finally...");
		}
		System.out.println("Your program is still running...");
	}
}