abstract class A{
    public abstract void showIt();
}

class B extends A{
    public void showIt(){
        System.out.println("This is a Abstract Method from a Abstract Class.");
    }
}

public class Absmt{
    public static void main(String [] args){
        B obj  = new B();
        obj.showIt();
    }
}