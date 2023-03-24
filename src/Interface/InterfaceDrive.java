package Interface;

public class InterfaceDrive implements interface3{

    @Override
    public void mainOne() {
        System.out.println(" This is interface one ");
        
    }

    @Override
    public void mainThree() {
        System.out.println(" This is Third interface ");   
    }

    @Override
    public void mainTwo() {
        System.out.println(" This is Second intherface");  
    }
    public static void main(String[] args) {
        InterfaceDrive iobj = new InterfaceDrive();
        iobj.mainOne();
        iobj.mainTwo();
        iobj.mainThree();
    }
}
