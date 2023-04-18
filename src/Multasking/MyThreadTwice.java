package Multasking;

public class MyThreadTwice extends Thread {
    public void run()
    {
        System.out.println("Running ...");
    }
    public static void main(String[] args) {
        MyThreadTwice tw = new MyThreadTwice();
        tw.start();
        tw.start();
    }
    
}
