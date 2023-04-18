package Multasking;

public class SyncronizedStatic {
   
    public static void main(String[] args) {
        SStatic1 s1 = new SStatic1();
        SStatic2 s2 = new SStatic2();
        SStatic3 s3 = new SStatic3();
        SStatic4 s4 = new SStatic4();
        s1.start();
        s2.start();
        s3.start();
        s4.start();
    }
}
class SStatic1 extends Thread
{
    public void run()
    {
        Table3.printTable(5);
    }
}
class SStatic2 extends Thread
{
    public void run()
    {
        Table3.printTable(5);
    }
}
class SStatic3 extends Thread
{
    public void run()
    {
        Table3.printTable(5);
    }
}
class SStatic4 extends Thread
{
    public void run()
    {
        Table3.printTable(5);
    }
}
