/*Create a class named 'PrintNumber' to print various numbers of
 different datatypes by creating different methods with the same 
name 'printn' having a parameter for each datatype. */
package Method;

public class ProMethod1 {
    public static void main(String[] args) {
        ProMethod1 meobj = new ProMethod1();
        meobj.printn(12);  
       boolean s= meobj.printn(false);  
       System.out.println("boolean value is " +s);
       meobj.printn(12, "anil");
       meobj.printn(2.1f);
    }
     int printn(int a)
    {
        System.out.println(" This is integer");
        return(a);
    }
     String printn(String name)
    {
        System.out.println(" This is string ");
        return(" Dhanvin ");
    }
    boolean printn( boolean a)
    {    
        System.out.println(" This is boolean value");
        return(true );
    }
    int printn(int a,String name)
    {   
        System.out.println(" this is string and integer");
        return(12);
    }
    float printn( float f)
    {    
        System.out.println(" This is floating value");
        return(f);
    }
}
