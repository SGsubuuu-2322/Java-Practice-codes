import java.util.*;
class Account{
    private  int bal;
    public Account(int bal){
        this.bal = bal;
    }

    public boolean isSufficientBalance(int wd_amt){
        if(bal > wd_amt)
            return(true);
        else
            return(false);
    }

    public void wdraw(int wd_amt){
        bal = bal - wd_amt;
        System.out.println("Withdraw Money is-" + wd_amt);
        System.out.println("Your current balance is- " + bal);
    }
}

class Customer implements Runnable{
    private String name;
    private Account account;
    public Customer(Account account, String n){
        this.account = account;
        name = n;
    }
    public void run(){
        Scanner ip = new Scanner(System.in);

        synchronized(account){
            System.out.println(name + "-Enter Amount to Withdraw :- ");
            int amt = ip.nextInt();
            if(account.isSufficientBalance(amt)){
                System.out.println(name);
                account.wdraw(amt);
            }
            else{
                System.out.println("Insufficient Balance...");
            }
        }
    }
}

public class Java_Multithreading{
    public static void main(String [] args){
        Account a1 = new Account(1000);
        Customer c1 = new Customer(a1, "Gelhi"), c2 = new Customer(a1, "Gelhu");
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();
    }
}