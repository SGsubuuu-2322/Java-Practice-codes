class Boxs{
    public int len, br, ht;
    public Boxs(){
        len = 10;
        br = 10;
        ht = 10;
    }
    public Boxs(int l, int b, int h){
        len = l;
        br = b;
        ht = h;
    }
}

public class Box1{
    public static void main(String [] args){
        Boxs b = new Boxs();
        System.out.println("L = " + b.len + "B = " + b.br + "H = " + b.ht);
        b = new Boxs(15, 20, 30);
        System.out.println("L = " + b.len + "B = " + b.br + "H = " + b.ht);

    }
}