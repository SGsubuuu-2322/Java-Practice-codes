public class Init{
	private int x;
	{
		System.out.println("Initialization of x = " + x);
		x = 5;
	}
	public Init(){
		System.out.println("Constructor of X = " + x);
	}
	
	public static void main(String []args){
		Init i1 = new Init();
		Init i2 = new Init();
	}
}