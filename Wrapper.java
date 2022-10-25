public class Wrapper{
	public static void main(String[] args){
		Integer i1 = Integer.valueof("123");
		Double d1 = Double.valueof("3.14");
		int a = Integer.parseInt("123");
		double b = Double.parseDouble("3.14");
		
		int c = i1.intvalue("123");
	}
}