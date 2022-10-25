public class ConstructorBox{
	private int l, b, h;
	public ConstructorBox(){
		l = 4;
		b = 6;
		h = 10;
	}
	public int getL1(){
		return(l);
	}
	public int getB1(){
		return(b);
	}
	public int getH1(){
		return(h);
	}
	
	public ConstructorBox(int L, int B, int H){
		l = L;
		b = B;
		h = H;
	}
	
	public int getL2(){
		return(l);
	}
	public int getB2(){
		return(b);
	}
	public int getH2(){
		return(h);
	}
	
	public static void main(String []args){
		ConstructorBox box1 = new ConstructorBox();
		System.out.println("Length of your Box1 is " + box1.getL1());
		System.out.println("Breadth of your Box1 is " + box1.getB1());
		System.out.println("Height of your Box1 is " + box1.getH1());
		
		ConstructorBox box2 = new ConstructorBox(100, 200, 300);
		System.out.println("Length for the Box2 is " + box2.getL2());
		System.out.println("Breadth for the Box2 is " + box2.getB2());
		System.out.println("Height for the Box2 is " + box2.getH2());
	}
}