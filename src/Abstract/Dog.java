package Abstract;

public class Dog extends Animal{

    @Override
    void cats() { }

    @Override
    void dogs() {
        System.out.println("Dogs bark");
         }

    public static void main(String[] args) {
        Dog o = new Dog();
        o.dogs();
        
        
    }
}
