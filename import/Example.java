package pack2;
import pack1.Student;
public class Example{
	public static void main(String[] args){
		Student s1 = new Student();
		s1.setRollno(123);
		s1.setName("SGshreyans");
		System.out.println("Student name is :- " + s1.getName());
		System.out.println("Student rollno. is :- " + s1.getRollno());
	}
}