import java.util.*;
public class Array{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter 5 numbers :- ");
		for(int i = 0; i < 5; i++)
			arr[i] = sc.nextInt();
		
		System.out.println("So, your entered numbers are :- ");
		for(int i = 0; i < 5; i++)	
			System.out.println("Your array[" + i + "] :- " + arr[i]);
		System.out.println("Your array length is about " + arr.length);
	}
}