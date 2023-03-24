public class ParentClass extends GrandParent 
{
    String Name=" Dhanvin ";
    int Id =23;
    private int j=45;
    void parentDisplay()
    {
        System.out.println(" In parent class ");
    }
    
     ParentClass( )
    {
        System.out.println(" parent constructor");
    }
    ParentClass(int i)
    {
        System.out.println(" parent for supr class we decalr");
    }
    
    public static void main(String[] args) {
        ParentClass paObj = new ParentClass();
        paObj.GrandDisplay();
        System.out.println(paObj.j);
        
    } 
    
}
