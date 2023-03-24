package Abstract;
public class BankC extends Bank{
    @Override
    void getBalance() {
        System.err.println(" $200 is deposited");   
    }
    public static void main(String[] args) {
        BankC bC = new BankC();
        bC.getBalance();
    } 
}
