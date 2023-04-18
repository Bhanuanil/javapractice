package Multasking;

public class Test implements Runnable {
   
    public static Thread thread1;
    public static Test obj;
    public static void main(String[] args) {
     Test obj = new Test();
     Thread thread1 = new Thread(obj);
     // currently thread 1 is created and it is new state 
     System.out.println(" State of Thread 1 after creating it  "+  thread1.getState());
     thread1.start(); // it move to runnable state
     System.out.println(" After calling start method "+thread1.getState());
    
    }
    public void run() {
        Thread myThread = new Thread1();
        Thread thread2 = new Thread(myThread);
        System.out.println(" state of thread 2 after creating "+thread2.getState());
        thread2.start();
        try{
            Thread.sleep(2000);  
        }catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println(" Thread 2 After calling sleep method "+thread2.getState());
        try
        {
            thread2.join();
        } catch( InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println(" Thread 2 after calling join method " +thread2.getState());
    }
    
}
