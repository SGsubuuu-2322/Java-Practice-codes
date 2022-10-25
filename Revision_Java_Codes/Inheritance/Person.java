public class Person{
    private int age;
    private String name;
    public void setName(String n){
        name = n;
    }
    public void setAge(int a){
        age = a;
    }

    public void showName(){
        System.out.println("Hello! Sir/Madam, your name is " + name);
    }
    public void showAge(){
        System.out.println("Hello! Sir/Madam, your age is " + age);
    }
}