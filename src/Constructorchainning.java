public class Constructorchainning {
    int Emp_id;
    String Name ;
    String Designation;
    int Branch_code;
    //default constructor
    //Constructorchainning()
    //{ }
    // no argument constructor
    Constructorchainning()
    {
        
        this("Rm ",908);
        System.out.println(" In no argument constructor");
    }
    // parameter constructor
    Constructorchainning(int Emp_id , String Name)
    {
        this("ram"," manager");
        //this.Emp_id=Emp_id;
        //this.Name=Name;
        System.out.println(" In parameter constructor");
    }
    Constructorchainning(String Name , String Designation)
    {
        System.out.println(" In parameter 2 constructor");
    }
    Constructorchainning(String Designation , int Branch_code)
    {     
        this(3,"anil");
        this.Designation=Designation;
        this.Branch_code=Branch_code;
          System.out.println(" In parameter 3 constructor ");
    }

    void display()
    {
        System.out.println(Emp_id+ " "+Name+ " "+Designation+ " " +Branch_code);
    }
    public static void main(String[] args) {
       Constructorchainning con1= new Constructorchainning();
        con1.Emp_id=1;
        con1.Name="Rajiv";
        System.out.println(con1.Emp_id+ "   " +con1.Name);
        /*Constructorchainning con2= new Constructorchainning(); */
      //  Accessmodifier acb= new Accessmodifier ();

    }

    
}
