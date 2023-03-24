//import pack.Defaultdemo;

public class Accessmodifier {
    int i=20;
    int k=1;
    String str;
    Accessmodifier()
    {
        System.out.println(" in constructor");
    }
    private void Display()
    {
        System.out.println(" in display method ");
    }
    public static void main(String[] args) {
        Accessmodifier pobj=new Accessmodifier();
        System.out.println(pobj.i+ " "+ pobj.k);
        pobj.Display();
       // Defaultdemo  defobj=new Defaultdemo();
    //defobj.name=" bhanu ";
    }
    
}
