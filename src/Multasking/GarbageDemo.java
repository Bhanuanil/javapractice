package Multasking;

public class GarbageDemo {
    public void finalize()
    {
        System.out.println(" Object is garbage collected ");
    }
    public static void main(String[] args) {
        GarbageDemo g1 = new GarbageDemo();
        GarbageDemo g2= new GarbageDemo();
        GarbageDemo g3 = new GarbageDemo();
        GarbageDemo g4 = new GarbageDemo();
        g3=g4; //By assigning the reference to another 
        g1=null; // By nulling a reference
        g2= null;
        new GarbageDemo();// By anonymous object
       // System.gc();

    }
}
