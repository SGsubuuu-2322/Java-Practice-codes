public class Java_Loop_F{
    public static void main(String [] args){
        int n = 11;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(j == 0 || i == 0 || i == (n/2) && j <= (3*n)/4 )
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}