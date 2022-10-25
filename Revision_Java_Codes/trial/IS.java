import pack_age.*;
// import pack_age.P2;

public class IS{

    private int a;
    private static int b;


    {
        System.out.println("Instance Initializer Block : A = " + a);
        a = 5;
    }


    
    static
    {
        System.out.println("Static Initializer Block : B = " + b);
        b = 10;
    }

    public IS(){
        System.out.println("B from Static Initializer Block B = " + b);
        System.out.println("A from Instance Initializer Block A = " + a);
    }



    public static void main(String [] args){
        IS is1 = new IS();
        IS is2 = new IS();
        // Box b1 = new Box();
        // b1.setDimensions(10, 15, 20);
        // b1.showDimensions();

        P1 p_1 = new P1();
        P2 p_2 = new P2();
        p_1.showIt1();
        p_2.showIt2();


    }
}