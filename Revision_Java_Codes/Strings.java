import java.util.*;
public class Strings{
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
         String name;

        System.out.println("Enter your name : ");
        name = ip.next();
        System.out.println("So, your Entered name is : " + name);
        System.out.println("And, the length of your name is : " + name.length());
    }
}