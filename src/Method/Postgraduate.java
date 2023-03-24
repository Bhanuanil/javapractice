package Method;

public class Postgraduate extends Degree{
    void graduate()
    {
        System.out.println("I am a Postgraduate");
    }
    public static void main(String[] args) {
        Postgraduate pobj= new Postgraduate();
        pobj.graduate();
    }
    
}
