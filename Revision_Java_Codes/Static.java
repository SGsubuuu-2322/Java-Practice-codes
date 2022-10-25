class S{
    public static int x;
    public int num;
    public static void num1(){
        System.out.println("Hello! from static member function.");
    }
    public void num2(){
        System.out.println("Hello! from instance member variable.");
    }

    static class Details{
        public static String name = "SGshreyans";
        public static void about(){
            System.out.println("Hello! from the inner static class's static member function.");
        }
    }
}

public class Static{
    public static void main(String []args){
        S.x = 10;
        // S.num = 5;
        System.out.println("The value of static member variable is " + S.x);
        // System.out.println("The value of instance member variable is " + S.num);
        S.num1();
        // S.num2();
        System.out.println("The value of static  member variable from the static inner class is " + S.Details.name);
        S.Details.about();
    }
}