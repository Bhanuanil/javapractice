package Abstract;
public class BankB extends Bank{
    @Override
    void getBalance() {
        System.out.println(" $150 is Deposited");    
    }
    public static void main(String[] args) {
        BankB bB = new BankB();
        bB.getBalance();
    }   
}
