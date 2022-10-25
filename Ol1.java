class Student{
	public void uId(int x){
		System.out.println("Student RollNo. is 073");
	}
}
class Employee extends Student{
	public void uId(int x, int y){
		System.out.println("Employee Id is SG@232214");
	}
	
}
public class Ol1{
	public static void main(String[] args){
		Employee emp = new Employee();
		emp.uId(1);
		emp.uId(1, 2);
	}
}