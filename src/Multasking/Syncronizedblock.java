package Multasking;

public class Syncronizedblock {

    public static void main(String[] args) {
        Sender S = new Sender();
        Sensder2 s2 = new Sensder2(" hello ", S);
        Sensder2 s3 = new Sensder2("Well come to java", S);
      s2.start();
      s3.start();  
      try{
        s2.join();
        s3.join();
      }catch( Exception e)
      {
        System.out.println(" Interrupted ");
      }
}

}

class Sender
{
public void senderMsg(String msg)
{
    System.out.println(" Sending a message " +msg);
    try{
        Thread.sleep(1000);
    }catch ( Exception e)
    {
        System.out.println(" Thread interrupted ");
    }
    System.out.println(" \n " +msg + " sent ");
}
}

class Sensder2 extends Thread
{
    private String msg;
    Sender sd;
    Sensder2(String m , Sender obj)
    {
        msg =m;
        sd= obj;
    }
    public void run()
    {
        synchronized(sd){
            sd.senderMsg(msg);
        }
    }
}

