public class Student extends Person{

    private int rollno;
    public void setRollno(int r){
        rollno = r;
    }
    public void showRollno(){
        System.out.println("Your Rollno is " + rollno);
    }


    public static void main(String [] args){
        Student s = new Student();
        s.setName("SGshreyanss");
        s.setAge(21);
        s.setRollno(073);
        s.showName();
        s.showAge();
        s.showRollno();
    }
}