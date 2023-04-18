package Multasking;

public class MyThread1S {
public static void main(String[] args) {
    Table tobj = new Table();
    MyThread12s M12obj = new MyThread12s(tobj);
    MyThread122s M122Obj = new MyThread122s(tobj);
    M12obj.start();
    M122Obj.start();
}
    
}
class MyThread12s extends Thread
{
    Table t ;
    MyThread12s(Table t)
    {
        this.t=t;  
    }
    public void run()
    {
        t.printTable(5);
    }
}
class MyThread122s extends Thread
{
    Table t;
    MyThread122s(Table t)
    {
        this.t = t;
    }
    public void run()
    {
        t.printTable(23);
    }
}
