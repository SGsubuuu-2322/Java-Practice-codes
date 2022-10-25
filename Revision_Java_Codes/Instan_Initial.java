public class Instan_Initial{

    private int x;
     
    {
        System.out.println("Instance Initializer X = " + x);
        x = 5;
    }

    public Instan_Initial(){
        System.out.println("Constructor : X = " + x);
    }




    public static void main(String [] args){
        Instan_Initial ins1 = new Instan_Initial();
        Instan_Initial ins2 = new Instan_Initial();
        Instan_Initial ins3 = new Instan_Initial();
    }
}