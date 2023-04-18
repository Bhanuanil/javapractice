package Multasking;
//using the thread class : Thread(Runnable r, Strng Name)
public class MyThread2 implements Runnable {
public void run()
{
    System.out.println(" My thread is Running");
}
    public static void main(String[] args) {
        MyThread2 t2= new MyThread2();
        Thread T3= new Thread(t2," My new Thread ");
        T3.start();
        String str = T3.getName();
        System.out.println(str);

    }
}
