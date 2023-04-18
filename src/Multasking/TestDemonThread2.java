package Multasking;

public class TestDemonThread2 extends Thread {
    public void run()
    {
        System.out.println(" Name "+Thread.currentThread().getName());
        System.out.println(" Daemon " + Thread.currentThread().isDaemon());
        System.out.println("Id " +Thread.currentThread().getId());
    }
    public static void main(String[] args) {
        TestDemonThread2 t1= new TestDemonThread2();
        TestDemonThread2 t2 = new TestDemonThread2();
        TestDemonThread2 t3 = new TestDemonThread2();
        
        t1.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
    }

    
}
