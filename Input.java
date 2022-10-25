import java.util.*;
public class Input{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name And Age:");
		String name = sc.nextLine();
		int age = sc.nextInt();
		
		System.out.println("Your Name is: " + name + " And Your Age is about: " + age);
	}
}