package Multasking;
// both theard is waiting for each other to relase the lock
public class DeadLockDemo {
    public static void main(String[] args) {
        final String resource1 = " Ratan tata";
        final String resource2 = " Anil tata" ;
        Thread t1 = new Thread()
        {
            public void run()
            {
                synchronized(resource1)
                {
                    System.out.println(" Thread 1 is locked resource 1");
                }try {
                    Thread.sleep(1000);
                }catch(Exception e)
                {
                  
                }
                synchronized(resource2)
                {
                    System.out.println(" Thread 1 is locked resource 2");
                }
            }
        };
        Thread t2 = new Thread()
        {
            public void run()
            {
                synchronized(resource2)
                {
                    System.out.println(" Thread 2 is locked resource 2");
                }try {
                    Thread.sleep(100);
                }catch(Exception e)
                {
                   
                }
                synchronized(resource1)
                {
                    System.out.println(" Thread 2 is locked resource 1");
                }
            }
        };
        t1.start();
        t2.start();
    }
    
}
