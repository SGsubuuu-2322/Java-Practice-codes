class Hello{
	private static int x = 10;
	public static void fun2(){
		System.out.println("X = " + x);
	}
    static class Test{
		public static String name = "SGshreyans";
	}
}

public class Example{
	public static void main(String[] args){
		Hello.fun2();
		System.out.println(Hello.Test.name);
	}
}