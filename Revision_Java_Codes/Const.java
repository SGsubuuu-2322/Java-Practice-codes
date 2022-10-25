class A{
    public A(){
        System.out.println("A-1");
    }
}

class B extends A{
    public B(){
        System.out.println("B-1");
    }
}

public class Const{
    public static void main(String [] args){
        B o1 = new B();
    }
}