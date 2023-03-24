package Abstract;
public class BankA extends Bank{

    @Override
    void getBalance() {
        System.out.println(" $100 is deposited");    
    }
    public static void main(String[] args) {
        BankA bA = new BankA();
        bA.getBalance();
        
    }
    
}
