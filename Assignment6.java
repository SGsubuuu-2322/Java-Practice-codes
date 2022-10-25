import java.util.*;
public class Assignment6{
	public static void main(String []args){
		Scanner ip = new Scanner(System.in);
		int num = 0;
		System.out.println("Enter how many numbers you want to print :- ");
		num = ip.nextInt();
		int arr[] = new int[num];
		System.out.println("Now, enter the numbers :- ");
		for(int i = 0; i < num; i++){
			System.out.println("Enter Number." + (i+1) + " :- ");
			arr[i] = ip.nextInt();
		}
		int larger = 0;
		for(int i = 0; i < num; i++){
			for(int j = 0; j < (num-1); j++){
				if(arr[j] < arr[j+1])
					larger = arr[j];
				else if(arr[i] > arr[j+1])
					larger = arr[j+1];
				else
					continue;
			}
		}
		
		System.out.println("Larger number : " + larger);
		
	}
}