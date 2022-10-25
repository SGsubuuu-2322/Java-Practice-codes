class Arithmeticop{
	public static void main(String [] args){
		int num1 = 23, num2 = 22, ans = 0;
		int sum = 0, mult = 0, sub = 0, m_div = 0;
		float i_div = 0.0f;
		sum = num1 + num2;
		sub = num1 - num2;
		mult = num1 * num2;
		i_div = (float)num1 / (float)num2;
		m_div = num1 % num2;
		System.out.println("Implementaion of Arithmetic operators are as follows : ");
		System.out.println("Addition of Num1 + Num2 = "  + sum);
		System.out.println("Substraction of Num1 - Num2 = "  + sub);
		System.out.println("Multiplication of Num1 * Num2 = "  + mult);
		System.out.println("Integral division of Num1 / Num2 = "  + i_div);
		System.out.println("Modulo division of Num1 % Num2 = "  + m_div);
		ans = num1 + num2 * num1 / (num1 % num2);
		System.out.println(num1 + "+" + num2 + "*" + num1 + "/ (" + num1 + "%" + num2 + ")" + " is evaluated to : " + ans);
		
		
	}
}