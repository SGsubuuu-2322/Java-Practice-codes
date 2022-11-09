class A extends Thread{
    public void run(){
        for(int i = 0; i <= 10; i++)
           System.out.println("Thread-A" + i);
    }
}

class B extends Thread{
    public void run(){
        for(int i = 0; i <= 10; i++)
           System.out.println("Thread-B" + i);
    }
}

public class Java_Thread2{
    public static void main(String [] args){
        A o1 = new A();
        B o2 = new B();
        o1.start();
        o2.start();
    }
}