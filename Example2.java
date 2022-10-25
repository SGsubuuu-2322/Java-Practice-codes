class A{
	public void f1(int x){
		System.out.println("This is class A.");
	}
}
class B extends A{
	public void f1(int x){
		System.out.println("This is class B.");
	}
}

public class Example2{
	public static void main(String []args){
		B obj = new B();
		obj.f1(10);
	}
}