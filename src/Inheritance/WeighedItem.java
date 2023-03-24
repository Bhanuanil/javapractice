package Inheritance;

public class WeighedItem extends PurchaseItem
 {
private double weight=34;
public double getPrice()
{
    return weight*super.getPrice();
    
}
public double getWeight()
 {
    return weight;
 }
    
 public void setWeight(double weight) 
 {
    this.weight = weight;
}
public WeighedItem()
{

}
}
