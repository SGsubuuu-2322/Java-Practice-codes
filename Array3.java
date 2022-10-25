import java.util.*;
public class Array3{
	public static void main(String []args){
		Scanner ip = new Scanner(System.in);
		int num1;
		System.out.println("Enter how many phone numbers you want to store :-");
		num1 = ip.nextInt();
		int arr[][] = new int[num1][];
		System.out.println("Enter the length for each of your number:");
		for(int i = 0, j = 0; i < num1; i++){
			System.out.println("Enter the length for your phone no." + (i+1) + " :- " );
			j = ip.nextInt();
			arr[i] = new int[j];
		}
		System.out.println("So, now time has came to enter the numbers :- ");
		for(int i = 0; i < num1; i++){
			System.out.println("So, enter the number for phone no." + (i+1) + " :- ");
			for(int j = 0; j < (arr[i].length); j++)
				arr[i][j] = ip.nextInt();
		}
		System.out.println("So, your entered phone numbers are :- ");
		for(int i = 0; i < num1; i++){
			System.out.println("So, your entered phone number" + (i+1) + " :- ");
			for(int j = 0; j < (arr[i].length); j++)
				System.out.println(arr[i][j]);
		}
			
		
	}
}