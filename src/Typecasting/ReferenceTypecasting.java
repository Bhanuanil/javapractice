package Typecasting;

import Method.Print;

class Animal
{
    void eat()
    {
        System.out.println(" In the animal");
    }
}
class Cat extends Animal
{
    void meow()
    {
        System.out.println(" This is cat meow");
    }
}
class Dog extends Animal{
    void bhow()
    {
        System.out.println("This is dog bow");
    }
    void eat()
    {
        System.out.println(" this is dog eat method");
    }
}    
public class ReferenceTypecasting {
    public static void main(String[] args) {
        Dog d= new Dog();
        d.eat();
        d.bhow();
        Animal a=d;//upcasting or implicit typecasting (Animal)d
        a.eat();
        ((Dog)a).bhow();
        Cat c= new Cat();
        Animal a1=c;
      // ((Dog)a1).bhow();// classcast exception
       if(a instanceof Dog)
       { 
        System.out.println("in if");
        ((Dog)a).bhow();
       }
       if(a instanceof Dog)
       { 
        display((Dog)a);
       }
       else
       {
        System.out.println(" not an instance of dog");
       } 
    }
    static void display(Dog a)
    {
        System.err.println(" in animal display");
    }
}
