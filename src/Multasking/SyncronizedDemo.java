package Multasking;
//using syncronized method 
public class SyncronizedDemo {
  public static void main(String[] args) {
    final Table2 Tobj = new Table2();
    Thread t1= new Thread()
    {
        public void run()
        {
            Tobj.printTable(5);
        }
    };
    Thread t2= new Thread()
    {
        public void run()
        {
            Tobj.printTable(30);
        }
    };
    t1.start();
    t2.start();
  }  
}
