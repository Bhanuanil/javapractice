package Method;

public class Undergraduate extends Degree {
    void graduate()
    {
        System.out.println(" I am an Undergraduate");
    }
    public static void main(String[] args) {
        Undergraduate uobj = new Undergraduate();
        uobj.graduate();
    }
    
}
