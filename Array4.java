import java.util.*;
public class Array4{
	public static void main(String []args){
		Scanner ip = new Scanner(System.in);
		int num;
		System.out.println("Enter how many phone numbers you want to store :- ");
		num = ip.nextInt();
		int arr[][] = new int[num][];
		System.out.println("Enter the length for each of your phone numbers :- ");
		for(int i = 0; i < num; i++){
			int x;
			System.out.println("So, enter the length for phone number." + (i+1) + " :- ");
			x = ip.nextInt();
			arr[i] = new int[x];
		}
		System.out.println("Now, Enter the phone numbers :- ");
		for(int i = 0; i < num; i++){
			System.out.println("So, enter the phone No." + (i+1) + " :- ");
			for(int j = 0; j < (arr[i].length); j++){
				arr[i][j] = ip.nextInt();
			}
		}
		System.out.println("So, now the process of storing numbers has been finished .");
		System.out.println("And, the time has come to show you your  entered numbers :- ");
		for(int i = 0; i < num; i++){
			System.out.println("Your phone no." + (i+1) + " is :- ");
			for(int j = 0; j < (arr[i].length); j++){
				System.out.print(arr[i][j]);
			}
			System.out.println(" ");
		}
	}
}