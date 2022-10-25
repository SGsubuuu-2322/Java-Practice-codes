public class Static_Ins{

    private static int x;

    static{
        System.out.println("Static Initializer : X = " + x);
    }




    public static void main(String [] args){
        new Static_Ins();
        new Static_Ins();
        new Static_Ins();
        new Static_Ins();
    }
}