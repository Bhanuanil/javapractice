package Multasking;

public class DeadLockSolution  {
    public static void main(String[] args) {
        DeadLockSolution ds = new DeadLockSolution();
        final resource12 A = new resource12();
        final resource22 B = new resource22();
        Runnable R1 = new Runnable()
        {public void run() {
            synchronized(B)
            {
                try {
                    Thread.sleep(100);
                }catch( InterruptedException e)
                {
                          e.printStackTrace();
                }
                synchronized(A)
                {
                    System.out.println(" In block 1");
                }
            }
        } 
    };
     Runnable R2= new Runnable() {
        public void run()
        {
            synchronized(B)
            {
                synchronized(A)
                {
                    System.out.println(" In block 2");
                }
            }
        }
     };
     new Thread(R1).start();
     new Thread(R2).start();
} 
    
}
 class resource12 
{
private int i=10;
public int get()
{
    return i;
}
public void seti(int i)
{
    this.i=i;
}
}
  class resource22 
{
private int i=10;
public int get()
{
    return i;
}
public void seti(int i)
{
    this.i=i;
}
}