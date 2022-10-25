import java.util.*;
public class Assignment1{
	public static void main(String []args){
		Scanner ip = new Scanner(System.in);
	int num = 0, j = 0;
	System.out.println("Enter the length of the array you want to create :- ");
	num = ip.nextInt();
	int arr1[] = new int[num];
	System.out.println("Now, enter the numbers :- ");
	for(int i = 0; i < num; i++){
		System.out.println("Enter the element" + (i+1) + " :- ");
		arr1[i] = ip.nextInt();
	}
	int arr2[] = new int[num];
	arr2[0] = arr1[0];
	for(int i = 0, temp = 0, x = 0; i < num; i++){
		for( j = 0; j < (i+1); j++){
			if(arr2[j] == arr1[i]){
				x = 1;
				break;
			}
			else
				continue;
		}
		
		if(x == 0)
			arr2[j+1] = arr1[i];
		else
			continue;
	}
	for(int i = 0; i < num; i++){
		System.out.println(arr2[i]);
	}
	}
}