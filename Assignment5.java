import java.util.*;
public class Assignment5{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		int num = 0;
		System.out.println("Enter the length for both of the arrays you want to compare :- ");
		num = ip.nextInt();
		int arr1[] = new int[num];
		int arr2[] = new int[num];
		System.out.println("Now, enter the numbers for array1 :- ");
		for(int i = 0; i < num; i++){
			System.out.println("Enter the element" + (i+1) + " :-");
			arr1[i] = ip.nextInt();
		}
		System.out.println("Now, enter the numbers for array2 :- ");
		for(int i = 0; i < num; i++){
			System.out.println("Enter the element" + (i+1) + " :- ");
			arr2[i] = ip.nextInt();
		}
		int x = 0;
		for(int i = 0; i < num; i++){
			if(arr1[i] == arr2[i]){
				x = 1;
				break;
			}	
		}
		if(x == 1)
			System.out.println("Both the arrays are same.");
		else
			System.out.println("Both the arrays ain't same.");
	}
}