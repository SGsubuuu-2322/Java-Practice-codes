import pack.Package;
public class Exmp extends Package{

    private int rollno;
    public void setRollno(int r){
        rollno = r;
    }
    public int getRollno(){
        return(rollno);
    }


    public static void main(String [] args){
        Exmp e = new Exmp();
        e.setName("SGshreyans");
        e.setAge(21);
        e.setRollno(73);

        System.out.println("Name : " + e.getName());
        System.out.println("Age : " + e.getAge());
        System.out.println("Rollno : " + e.getRollno());
    }
}