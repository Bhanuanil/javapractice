package Multasking;

public class RunableInterface implements Runnable {
    public void run() {
    System.out.println(" Thread is Running");
    }
    public static void main(String[] args) {
        RunableInterface r1= new RunableInterface();
        Thread t1= new Thread(r1);
        t1.start();
    }
    
}
