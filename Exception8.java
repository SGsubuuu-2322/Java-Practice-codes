import java.io.*;
public class Exception8{
	public static void main(String []args){
		try{
			throw new IOException();
		}catch(IOException io){
			System.out.println("Exception : " + io.getMessage());
		}
		System.out.println("It Still Continues...");
	}
}