abstract class Vehicle{
	public abstract void engine(); 
	public void sound(){
		System.out.println("BOOM BOOM BOOM BOOM.....");
	}
}
class Car extends Vehicle{
	public void engine(){
		System.out.println("This is a Car Engine.");
	} 
}
class Bike extends Vehicle{
	public void engine(){
		System.out.println("This is a Bike Engine.");
	}
}
public class Abs{
	public static void main(String []args){
		Car car1 = new Car();
	    Bike bike1 = new Bike();
	    car1.engine();
	    car1.sound();
	    bike1.engine();
	    bike1.sound();
	}
}