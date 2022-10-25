import java.util.*;
public class Array2{
	public static void main(String []args){
		Scanner ip = new Scanner(System.in);
		int arr[][] = new int[5][5];
		System.out.println("Enter 5 phone numbers of length 5 :- ");
		for(int i = 0; i < 5; i++){
			System.out.println("Enter the phone number for arr[" + i + "] :- ");
			for(int j = 0; j < 5; j++)
				arr[i][j] = ip.nextInt();
		}
		
		for(int i = 0; i < 5; i++){
			System.out.println("So, your entered phoneno." + i + " is ");
			for(int j = 0; j < 5; j++)
				System.out.println(arr[i][j]);
			
		}
	}
}