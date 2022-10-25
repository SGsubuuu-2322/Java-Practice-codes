class unary{
	public static void main(String [] args){
		int num1 = 10, num2 = 20, ans = 0;
		System.out.println("Here two numbers are Number1 = " + num1 + " and Number2 =" + num2);
		System.out.println("So, the operations of Increment operator are as follows:");
		ans = ++num1;
		System.out.printf("Answer of pre-Increment of num1(%d) is : %d", num1, ans);
		ans = num1++;
		System.out.printf("Answer of post-Increment of num1(%d) is : %d", num1, ans);
	}
}