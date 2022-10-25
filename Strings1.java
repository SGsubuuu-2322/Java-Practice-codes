import java.lang.String;
public class Strings1{
	public static void main(String []args){
		String s1 = new String("SGshreyans");
		String s3 = new String("sgshreyanssss");
		System.out.println(s1);
		String s2 = s1.toUpperCase();
		System.out.println(s2);
		s2 = s1.toLowerCase();
		System.out.println(s2);
		int ss = s1.indexOf('s',3);
		System.out.println("Index is  :- " +ss);
		
		if(s1.equalsIgnoreCase(s3))
			System.out.println("Strings are same.");
		else
			System.out.println("Strings ain't same at all.");
		int i = s1.compareTo(s3);
		if(i == 0)
			System.out.println("Strings are same.");
		else if(i > 0)
			System.out.println("Opposite to dictionary order.");
		else
			System.out.println("In accordance to dictionary order.");
	}
	
}