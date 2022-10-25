public class Person{
    private int age;
    private String name;
    public void setAge(int a){
        age = a;
    }
    public void setName(String n){
        name = n;
    }
    public void showName(){
        System.out.println("Name : " + name);
    }
    public void showAge(){
        System.out.println("Age : " + age);
    }
    
}