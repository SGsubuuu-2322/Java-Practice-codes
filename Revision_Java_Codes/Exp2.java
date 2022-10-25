public class Exp2{
    public static void main(String [] args){
        try{
            System.out.println("Result : " + 3/0);
        }
        catch(ArithmeticException ae){
            System.out.println("Error Message : "+ ae.getMessage());
        }
        
    }
}