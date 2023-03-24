package Interface;

public class InterfacePro41 implements InterfacePro4 {

    @Override
    public void intefaceDemo() {
        System.out.println(" I value is static and final " +i);  
    }
    public static void main(String[] args) {
        InterfacePro41 iobj = new InterfacePro41();
        iobj.intefaceDemo();
    }
    
}
