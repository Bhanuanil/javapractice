package Inheritance;

public class Challenge {
    public static void main(String[] args) {
        WeighedItem wobj = new WeighedItem();
        CountedItem cobj = new CountedItem();
        System.out.println(wobj.getPrice());
        System.out.println(cobj.getPrice());
    }
    
}
