import java.util.*;

public class AdvInp{
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);

        String name;
        Integer age;
        Character ch;


        System.out.println("Hello Sir/Madam! Good Evening...\nPlease enter your personal details :- ");
        System.out.println("Please enter your name : ");
        name = ip.next();
        System.out.println("Please enter your age : ");
        age = ip.nextInt();
        System.out.println("Please enter your blood-group : ");
        ch = ip.next().charAt(0);


        System.out.println("So, sir/madam please check your details before confirmation : ");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Blood-Group : " + ch);
    }
}