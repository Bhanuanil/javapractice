public class Varry {
    String str="This is sring datatype";
    int data=300;
   static int mydata='Z';
    public static void main(String[] args) {
        //int data; // declaration
        //data=20; //initialization data is idetifier 20 is litral
        int data=50; //defining (declaration + initialization)
        System.out.println(data);
     Varry a = new Varry();
    a.display();
      //a.data;
    System.out.println(a.data+ " "+ data);
    Varry b= new Varry();
    b.display();
  System.out.println(a.data + " "+b.str+ " " +data);
  System.out.println(Varry.mydata);
    }
    void display()
    { // instanec method for this we need to creat object
    int data=10;
    System.out.println(data);
    System.out.println(str);
    Varry.mydata=250;
    System.out.println("This static value "+Varry.mydata );
    }
}
