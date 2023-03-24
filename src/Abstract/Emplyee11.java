package Abstract;

import Interface.Emplyee;

public class Emplyee11 implements Emplyee{

    @Override
    public void Name() {
        System.out.println(" Raja ");
        
    }

    @Override
    public void emplyeeCode() {
        System.out.println(" 231232 ");
        
    }

    @Override
    public void department() {
        System.out.println(" Mechanical "); 
    }
    public static void main(String[] args) {
        Emplyee11 obj = new Emplyee11();
        obj.Name();
        obj.emplyeeCode();
        obj.department();
    }
    
}
