package pack;

public class Encapsulationdemo {
    private int i=20;
    private String name=" bhanu";
    //accessor
    public int getI()
    {
       return i;
    }
    // Mutatotor 
    public void setI(int k)
    {
        i=k;
    }
    public static void main(String[] args) {
        Encapsulationdemo encobj = new Encapsulationdemo();
        System.out.println(encobj.i+ " "+ encobj.name);
    Defaultdemo defobj=new Defaultdemo();
    defobj.name=" bhanu ";
    }
    
}
