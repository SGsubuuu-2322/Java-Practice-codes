class A{
    public void f1(int x){
        System.out.println("This is a Class A's Object.");
    }
}

class B extends A{
    public void f1(int x, int y){
        System.out.println("This is a Class B's Object.");
    }
}

public class Ov{
    public static void main(String [] args){
        B c = new B();
        c.f1(5);
        c.f1(5, 7);
    }
}