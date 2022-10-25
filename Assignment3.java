class Parent{
		public void printParent(){
			System.out.println("This is a parent class.");
	}
}
	
class Child extends Parent{
		public void printChild(){
		    System.out.println("This is a Child class.");
	}
}

public class Assignment3{
	public static void main(String []args){
		Child c = new Child();
		c.printParent();
		c.printChild();
	}
}