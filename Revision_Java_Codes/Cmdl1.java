public class Cmdl1{
    public static void main(String [] args){

        Integer s = 0;
        for(int i = 0; i < args.length; i++)
            s += Integer.parseInt(args[i]);
        System.out.println("The SumTotal value of our entered number is " + s);
    }
}