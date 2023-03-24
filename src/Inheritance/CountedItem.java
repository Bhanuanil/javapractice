package Inheritance;

public class CountedItem extends PurchaseItem{
    private int Quantity=12;
    public double getPrice()
    {
        return Quantity*super.getPrice();
    }
    public int getQuantity() {
        return Quantity;
        }
        
        public void setQuantity(int quantity) {
        this.Quantity = quantity;
        }
        public CountedItem()
        {

        }
        
}
