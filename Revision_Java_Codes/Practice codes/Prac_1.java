import java.util.*;
class Input__1{
    Scanner ip = new Scanner(System.in);
    public void input_1(){
         System.out.println("Welcome! Sir/Madam to our program : ");
         System.out.println("\"Here we store your phone numbers acoording to your desired length and show it to you whenever you want\"");
         int num;
         System.out.println("So, enter how many numbers you want to store : ");
         num = ip.nextInt();
         int arr[][] = new int [num][];
         System.out.println("Now, you've to enter the length for each of your phone numbers : ");
         for(int i = 0; i < num; i++){
             System.out.println("Enter the length for the phone number-" + (i+1) + " : ");
             arr[i] = new int[ip.nextInt()];
         }
    }

}

class Input__2 extends Input__1{
    
}

