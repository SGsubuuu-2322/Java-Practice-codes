package pack1;
import pack2.Student;
public class Example {
    public static void main(String [] args){
        int a = 2;
        Student s = new Student();
        s.setRollno(01);
        s.setName("SGshreyans");
        System.out.println("" + s.getRollno());
        System.out.println("" + s.getName());
        System.out.println(" " + a);
    }
}