package Multasking;
//free memory // total memory
public class Runtime2 {
    public static void main(String[] args) {
        Runtime r=Runtime.getRuntime();
        System.out.println("Total memory " +r.totalMemory());
        System.out.println(" Free Memory " + r.freeMemory());
        for(int i=0; i<10000;i++)
        {
            new Runtime2();  
        }
        System.out.println(" After creating 10000 instance free Memory "+r.freeMemory());
        System.gc();
        System.out.println(" After gc() free memory "+r.freeMemory());
    }
    
}
