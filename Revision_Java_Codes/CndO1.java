class Cls{

    int num;
    void func(){
        System.out.println("The number is " + num);
    }

}

public class CndO1{
    public static void main(String [] args){
        Cls c = new Cls();
        c.num = 2322;
        c.func();
    }
}