import java.util.*;
public class Exp3{
    public static void main(String args[]){
        Scanner ip = new Scanner(System.in);
        int acc_bal = 10000, wd_bal;
        System.out.println("Welcome Sir/Madam to our program for doing transactions from your bank account...");
        System.out.println("So, enter the balance you want to withdraw :- ");
        wd_bal = ip.nextInt();
        if(wd_bal > acc_bal)
          throw new ArithmeticException("InSufficient Balance In Your Account");
        else
          System.out.println("Transaction Successful");
    }
}