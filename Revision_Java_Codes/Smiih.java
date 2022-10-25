class A{
    public static void f1(){
        System.out.println("This is SGsubu from static method from Class A.");
    }
}

class B extends A{
    
}

public class Smiih{
    public static void main(String [] args){
        B.f1();
    }
}