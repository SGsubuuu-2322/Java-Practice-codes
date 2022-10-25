import java.util.*;
public class Array_2d{
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int x;


        System.out.println("Hello and Welcome Sir/Madam! to our program :-) ");
        System.out.println("So, This program is about saving as many numbers as a user(YOU) want !!! \n");

        System.out.println("So, Enter how many numbers you want to save : ");
        x = ip.nextInt();

        int arr[][] = new int[x][];

        System.out.println("Now, enter the length for each of your number : ");

        for(int i = 0; i < arr.length; i++){
            int num;
            System.out.println("Enter the length for your phone no." + (i+1) + ": ");
            num = ip.nextInt();
            arr[i] = new int[num];
        }

        System.out.println("So now, the time has came to enter the phone numbers :-)");


        for(int i = 0; i < arr.length; i++){

            System.out.println("Enter the phone number." + (i+1) + ":- ");
            for(int j = 0; j < arr[i].length ; j++){
                System.out.println("Enter digit no." + (j+1) + ": ");
                arr[i][j] = ip.nextInt();
            }
        }

        System.out.println("So, sir/Madam! Please have a look on your entered phone numbers : ");
        for(int i = 0; i < arr.length; i++){
            System.out.println("\nPhone Number." + (i+1) + ": ");
            for(int j = 0; j < arr[i].length; j++)
               System.out.print(arr[i][j]);
        }

    }
}