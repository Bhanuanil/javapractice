package Abstract;

public class Cat extends Animal{

    @Override
    void cats() {
        System.out.println(" Cats meow");  
    }
    @Override
    void dogs() {
        // TODO Auto-generated method stub   
    }
    public static void main(String[] args) {
        Cat co = new Cat();
        co.cats();
    }
    
}
