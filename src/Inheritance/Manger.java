package Inheritance;

public class Manger extends Member {
    String Specialization= "CA";
    String Department = " Finance ";
    void manager1()
    {
        System.out.println("Name =" +Name + " Age =" +Age + " Phone number = "+ 
        Ph_number+" Address =" +Address+ " Salary =" + Salary );
        System.out.println(" Specialization =" +Specialization+ " Department = "+ Department);
    }
    public static void main(String[] args)
    {
        Manger Maobj=new Manger();
        Member.Name="Rajat";
        Member.Age=25;
        Maobj.Ph_number=675654543;
        Maobj.Address=" Hyderabad";
        Maobj.Salary=300000;
        Maobj.manager1();

    }
    
}
