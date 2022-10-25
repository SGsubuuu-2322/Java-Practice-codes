class Box{
    private int length, breadth, height;
    public void setDimensions(int l, int b, int h){
        length = l;
        breadth = b;
        height = h;
    }
    public void showDimensions(){
        System.out.println("Length = " + length);
        System.out.println("Breadth = " + breadth);
        System.out.println("Height = " + height);
    }
}

public class CndO{
    public static void main(String []args){
        Box newbox = new Box();
        newbox.setDimensions(10, 23, 34);
        newbox.showDimensions();
        newbox = new Box();
        newbox.showDimensions();
    }
}