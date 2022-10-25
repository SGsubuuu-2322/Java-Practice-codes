class Box{
	private int l, b, h;
	public void setDimension(int l, int b, int h){
		this.l = l; this.b = b; this.h = h;
	}
	public void getDimension(){
		System.out.println("Length = " + l + "Breadth = " + b + "Height = " + h);
	}
}

public class This{
	public static void main(String []args){
	Box b1 = new Box();
	b1.setDimension(10, 20, 30);
	b1.getDimension();
	}
}