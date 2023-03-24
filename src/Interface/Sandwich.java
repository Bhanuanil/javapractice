package Interface;

public class Sandwich implements FastFood  {

    @Override
    public void Bread() {
        System.err.println(" Bread ");
        
    }

    @Override
    public void Cheese() {
        System.out.println(" Cheese ");
        
    }

    @Override
    public void vegitables() {
        System.out.println(" Vegitable "); 
    }

    @Override
    public void sauce() {
        System.out.println(" Tomato Sauce");
    }
    public static void main(String[] args) {
        Sandwich sobj = new Sandwich();
        sobj.Bread();
        sobj.Cheese();
        sobj.vegitables();
        sobj.sauce();
    }
}
