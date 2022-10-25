class Parent{
	int x = 100;
}
class Child extends Parent{
	int x = 50;
	public void showNum(int x){
		System.out.println("X = " + x);
		System.out.println("X = " + this.x);
		System.out.println("X = " + super.x);
	}
}

public class ThisSuper{
	public static void main(String []args){
		Child c1 = new Child();
		c1.showNum(10);
	} 
}