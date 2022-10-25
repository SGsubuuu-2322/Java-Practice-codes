import java.util.*;
public class Array1{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		int x;
		System.out.println("Enter a length of your array :- ");
		x = input.nextInt();
		int array[];
		array = new int[x];
		System.out.println("So, enter elements according to your  array[" + array.length + "] :- ");
		for(int i = 0; i < x; i++){
			System.out.println("Enter the element for for array[" + i + "] :- ");
			array[i] = input.nextInt();
		}
		System.out.println("So, according to your entered elements");
		for(int i = 0; i < x; i++)
			System.out.println("your array[" + i + "] element is :" + array[i]);
	}
}