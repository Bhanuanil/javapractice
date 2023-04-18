package Multasking;

public class ThreadState
{
    public static void main(String[] args) 
    {
        Thread1 t1 = new Thread1();  
        Thread2 t2 = new Thread2(); 
        t1.start();
        t2.yield();;
        try{
            t1.sleep(1000);
        } catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        t2.start();;
        System.out.println(" Main Thread end");
    }
}
class Thread1 extends Thread 

{
   public void run()
   {
    System.out.println(" Thread1 ");
    System.out.println(" i in the Thread 1");
   for(int i=1; i<=5; i++)
   {
    System.out.println("i = " +i);
    try
    {
        Thread.sleep(10000);
    }
    catch(InterruptedException e)
    {
         e.printStackTrace();
    }
   }
   System.out.println(" Thread 1 Completed ");
} 

}
class Thread2 extends Thread 
{
    public void run()
    {
        System.out.println(" Thread 2");
        System.out.println(" i in Thread 2 ");
        for (int i = 1; i <= 5; i++)  
        {  
            System.out.println("i = " + i);  
        }  
        System.out.println("Thread 2 Completed."); 
    }
}
   