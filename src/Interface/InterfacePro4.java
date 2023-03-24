package Interface;
public interface InterfacePro4 {
    int i =45;
    void intefaceDemo();   
    static void msg(){  
        System.out.println("This is static method");  
    }  
    public static void main(String[] args) {
        InterfacePro4.msg();
    }
}
