import java.io.*;
public class EXP5{
    public static void main(String [] args)throws IOException{
        try{
            throw new IOException("Some Input/Output Exception");
        }
        catch(IOException ioe){
            System.out.println("Error Message : " + ioe.getMessage());
        }
        System.out.println("Program still continues...");
    }
}