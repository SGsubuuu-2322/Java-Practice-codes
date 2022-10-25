import java.lang.String;
import java.util.*;
public class Assignment2{
	public static void main(String []args){
		Scanner ip = new Scanner(System.in);
		String str = new String();
		System.out.println("Enter a String :- ");
		str = ip.nextLine();
		for(int i = 0, j = 1; i < str.length(); i++, j++){
			System.out.println(str.charAt(str.length()-j));
		}
		
		
	}
}