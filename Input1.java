import java.util.*;
public class Input1{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name :- ");
		String name = sc.nextLine();
		System.out.println("Enter Your Age :- ");
		int age = sc.nextInt();
		
		System.out.println("Hello Sir/Madam");
		System.out.println("Your Name is " + name);
		System.out.println("Your age is about " + age);
	}
}