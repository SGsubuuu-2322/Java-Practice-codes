public class Exp{
	public static void main(String []args){
		Students s1 = new Students();
		s1.setName("SGshreyans");
		s1.setAge(21);
		s1.setRollno(73);
		s1.setClass(15);
		System.out.println("Name of the student is " + s1.getName());
		System.out.println("Age of the student is " + s1.getAge());
		System.out.println("Class of the student is " + s1.setClass());
		System.out.println("RollNo. of the student is " + s1.getRollno());
	}
}