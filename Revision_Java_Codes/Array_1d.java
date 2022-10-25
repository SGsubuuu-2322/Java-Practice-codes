import java.util.*;

public class Array_1d{
    public static void main(String [] args){

        Scanner ip = new Scanner(System.in);

        int x;
        System.out.println("Enter the length of your Phone Number : ");
        x = ip.nextInt();


        int [] arr = new int[x];
        System.out.println("Now, enter Your Phone Number : \n");
        for(int i = 0; i < arr.length ; i++){
            System.out.println("Enter the digit no." + (i+1) + ": ");
            arr[i] = ip.nextInt();
        }
        System.out.println("Sir/Madam, please check whether your entered phone number is correct or incorrect!!!");
        System.out.println("So, Your Entered phone number is : ");

        for(int i = 0; i < arr.length; i++)
           System.out.print(arr[i]);
    }
}