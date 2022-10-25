class Car{
	public void sound(){
		System.out.println("It sounds like mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
	}
}
class Sportscar{
	public void sound(){
		System.out.println("It sounds like BoommBoommmBoommmmBoommmmmmmBoommmmmmmmmmmmmmmmmmmmmmmmmm");
	}
}
public class Or1{
	public static void main(String[] args){
		Sportscar urus = new Sportscar();
		urus.sound();
		Car indica = new Car();
		indica.sound();
	}
}