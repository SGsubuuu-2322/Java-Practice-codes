public class Example {
    public static void main(String[] args){
        Box smallBox = new Box();
        smallBox.setDimension(12, 10, 05);
        smallBox.showDimensions();
        smallBox = new Box();
        smallBox.showDimensions();
    }
}
