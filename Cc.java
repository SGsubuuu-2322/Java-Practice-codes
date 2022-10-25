class A{
	public A(){
		System.out.println("This is Parent.");
	}
}
class B extends A{
	public B(){
		this(90);
		System.out.println("This is Child.");
	}
	
	public B(int x){
		System.out.println("This is Child2 Class.");
	}
}
public class Cc{
	public static void main(String []args){
		B obj = new B();
	}
}