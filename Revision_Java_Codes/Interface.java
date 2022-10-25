interface I1{
    void setName(String nm);
    String getName();
}
interface I2{
    void setAge(int a);
    int getAge();
}
interface I3 extends I1, I2{
    void setRollNo(int r);
    int getRollNo();
}
interface I4{
    void setBloodGrp(char bg);
    char getBloodGrp();
}

class Std{
    private int std;
    public void setStd(int cls){
        std = cls;
    }
    public int getStd(){
        return(std);
    }
}

public class Interface extends Std implements I3, I4{
    private int regdno, rollno, age ;
    private char bldgrp;
    private String name;


    public void setRegdNo(int rn){
        regdno = rn;
    }
    public int getRegdNo(){
        return(regdno);
    }


    public void setName(String nm){
        name = nm;
    }
    public String getName(){
        return(name);
    }


    public void setAge(int a){
        age = a;
    }
    public int getAge(){
        return(age);
    }


    public void setRollNo(int r){
        rollno = r;
    }
    public int getRollNo(){
        return(rollno);
    }


    public void setBloodGrp(char bg){
        bldgrp = bg;
    }
    public char getBloodGrp(){
        return(bldgrp);
    }





    public static void main(String [] args){
        Interface it = new Interface();
        it.setName("SGshreyans");
        it.setStd(4);
        it.setRollNo(23);
        it.setRegdNo(232214);
        it.setAge(12);
        it.setBloodGrp('O');

        System.out.println("Name : " + it.getName());
        System.out.println("Standard : " + it.getStd());
        System.out.println("RollNo. : "+ it.getRollNo());
        System.out.println("Registration No. : " + it.getRegdNo());
        System.out.println("Age : " + it.getAge());
        System.out.println("Blood Group : " + it.getBloodGrp());
    }
}

