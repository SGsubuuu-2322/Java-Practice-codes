public class Final{
    private final int x = 5;
    public static final int y = 10;


    public static void main(String [] args){
        Final f = new Final();
        f.x = 10;
        System.out.println("The value of X = " + f.x);

        Final.y = 20;
        System.out.println("The value of y = " + Final.y);
    }
}