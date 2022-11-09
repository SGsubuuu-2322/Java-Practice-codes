class A implements Runnable{
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println("Thread A-" + i);
        }
    }
}

class B implements Runnable{
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println("Thread B-" + i); 
        }
    }
}
public class Java_Thread1{
    public static void main(String [] args){

        Runnable i1 = new A();
        Runnable i2 = new B();
        Thread t1 = new Thread(i1);
        Thread t2 = new Thread(i2);
        t1.start();
        t2.start();
    }
}