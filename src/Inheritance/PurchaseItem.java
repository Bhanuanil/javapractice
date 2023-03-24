package Inheritance;

public class PurchaseItem {
    private String Name;
    private double UnitPrice;
    public PurchaseItem()
    {
        this.Name= "bhanu";
        this.UnitPrice =12;
    }
    public void  setName( String name)
    {
        Name = name;
    }
    public String getName()
    {
        return Name;
    }
    public void setUnitPrice(double k)
    {
           UnitPrice= k;
           
    }
    
    public double getPrice()
        {
            return UnitPrice;
        }
       
}
