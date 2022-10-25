abstract class Person{
    private int age;
    private String name;
    public void getName(String n){
        name = n;
    }
    public void getAge(int a){
        age = a;
    }

    public void showName(){
        System.out.println("Name : " + name);
    }
    public void showAge(){
        System.out.println("Age : " + age);
    }
}

class Faculty extends Person{
    private int employ_id;
    public void getEmployId(int emp){
        employ_id = emp;
    }

    public void showEmployId(){
        System.out.println("Employ-Id : " + employ_id);
    }
}

class Student extends Person{
    private int rollno;
    public void getRollNo(int r){
        rollno = r;
    }
    public void showRollNo(){
        System.out.println("Roll-No : " + rollno);
    }
}

public class Abscl{
    public static void main(String [] args){
        Faculty fac = new Faculty();
        Student st = new Student();

        fac.getName("SGsubuuuu");
        fac.getAge(21);
        fac.getEmployId(232214);
        fac.showName();
        fac.showAge();
        fac.showEmployId();

        System.out.println("\n\n");


        st.getName("SGshreyans");
        st.getAge(6);
        st.getRollNo(2322);
        st.showName();
        st.showAge();
        st.showRollNo();
    }
}