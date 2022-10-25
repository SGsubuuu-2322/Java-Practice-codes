class RE{
	public static void main(String args []){
		int num1 = 10, num2 = 20, ans = 0;
		ans = num1 + num2 * num1 / (num1 % num2);
		System.out.println("num1 + num2 * num1 / (num1 % num2) is evaluated to : " + ans);
		ans = num1 + num2 * num1 / num2;
		System.out.printf("%d + %d * %d / %d = %d", num1, num2, num1, num2, ans);
		ans = num1 % num2 + num2 - num1 * num2 / num1 * (num1 / num2);
		System.out.printf("%d %% %d + %d - %d * %d / %d * (%d / %d) is  evaluateed to %d", num1, num2, num2, num1, num2, num1, num1, num2, ans);
		
	}
}