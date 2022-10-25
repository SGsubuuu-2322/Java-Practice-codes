public class Wrapper{
    public static void main(String [] args){
        int a = 50;
        Integer i = Integer.valueOf(a);
        Integer j = a;
        Integer num = 10;

        System.out.println("A = " + a + " I = " + i + " J = " + j);
        System.out.println("The value of wrapper class variable is " + num);


    }
}