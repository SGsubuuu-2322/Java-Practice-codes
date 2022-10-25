class A{
	int y;
	public A(int x){
		System.out.println("The value of X is " + x);
		System.out.println("This is Parent Class.");
		
	}
}
class B extends A{
	public B(){
		super(10);
		System.out.println("This is Child Class.");
	}
}

public class Con1{
	public static void main(String []args){
		B obj = new B();
	}
}