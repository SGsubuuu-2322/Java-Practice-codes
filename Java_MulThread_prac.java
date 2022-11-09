import java.util.*;
class Account{
    private Integer bal;
    public Account(Integer bal){
        this.bal = bal;
    }


    public boolean isSufficientBalance(Integer wd_amt){
        if(wd_amt < bal)
           return(true);
        else
           return(false);
    }


    public void withdrawAmt(Integer wd_amt, String name){
        bal -= wd_amt;
        System.out.println("Transaction Successfull!!!-Mr/Ms. " + name);
        System.out.println("And, Now you'hv left with " + bal + " amount in your savings account...");
    }
}

class Customer implements Runnable{
    private String name;
    private Account acc;
    public Customer(Account acc, String n){
        this.acc = acc;
        this.name = n;
    }

    public void run(){
       synchronized(acc){
         System.out.println("Hello and Welcome " + name + " Sir/Madam to our program !!!");
        System.out.println("So, now " + name + " Sir/Madam enter the amount to be withdrawn :- ");
        Scanner ip = new Scanner(System.in);
        Integer wd_amt = ip.nextInt();
        if(acc.isSufficientBalance(wd_amt))
           acc.withdrawAmt(wd_amt, name);
        else
           System.out.println("InSufficient Balance, Please! try again...");    
       }  
    }
}




public class Java_MulThread_prac{
    public static void main(String [] args){
        Account acc = new Account(10000);
        Customer c1 = new Customer(acc, "Gelhii"), c2 = new Customer(acc, "Gelhuu");
        Thread t1 = new Thread(c1), t2 = new Thread(c2);
        t1.start();
        t2.start();
    }
}