package Multasking;

public class demoMulti  extends Thread {
    public void run()
    {
        System.out.println(" Thread is Running");
    }
    public static void main(String[] args) {
        demoMulti m1= new demoMulti();
        m1.start();
    }
    
}
