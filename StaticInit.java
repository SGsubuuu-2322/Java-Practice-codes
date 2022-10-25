public class StaticInit{
	public static int k;
	static{
		System.out.println("Static Initiliazer of K is " + k);
		k = 10;
	}
	
	public StaticInit(){
		System.out.println("Constructor of K is " + k);
	}
	
	public static void main(String []args){
		new StaticInit();
	}
}