interface Admission{
	void formFillup();
	void registration();
	void batchAllotment();
	void idCardGeneration();
}

class Student implements Admission{
	public void formFillup(){
		System.out.println("\nYour Form Fillup has been completed.");
	}
	public void registration(){
		System.out.println("\nYour Registration has been Completed.");
	}
	public void batchAllotment(){
		System.out.println("\nYour're Alloted to the 1st batch of 10th std.");
	}
	public void idCardGeneration(){
		System.out.println("\nYour Id Card has been ready to use.");
	}
}

class StudentPro implements Admission{
	public void exam(){
		System.out.println("\nYou'hv given your exam.");
	}
	public void selection(){
		System.out.println("\nYou'hv been selected.");
	}
	public void formFillup(){
		System.out.println("\nYour Form-Fillup has been completed.");
	}
	public void registration(){
		System.out.println("\nYour Registration has been completed.");
	}
	public void batchAllotment(){
		System.out.println("\nYour Batch has been alloted.");
	}
	public void idCardGeneration(){
		System.out.println("\nYour Id card has been ready to use.");
	}
}

public class Interface{
	public static void main(String []args){
		Student s1 = new Student();
		StudentPro s2 = new StudentPro();
		System.out.println("\n-------------------------Student Information-------------------------------------\n");
		s1.formFillup();
		s1.registration();
		s1.batchAllotment();
		s1.idCardGeneration();
		System.out.println("\n---------------------------------------------------------------------------------\n\n\n\n");
		
		System.out.println("---------------------------Pro-Student Information-------------------------------------\n");
		s2.exam();
		s2.selection();
		s2.formFillup();
		s2.registration();
		s2.batchAllotment();
		s2.idCardGeneration();
		System.out.println("----------------------------------------------------------------------------------------\n\n");
		
	}
}