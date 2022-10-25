class A{
    public void f1(int x){
        System.out.println("This is Class A.");
    }
}

class B extends A{
    public void f1(int x){
        System.out.println("This is Class B.");
    }
}

public class Or{
    public static void main(String [] args){
        B c = new B();
        c.f1(6);
    }
}