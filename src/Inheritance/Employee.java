package Inheritance;

public class Employee extends Member {
    String Specialization= "Civil enginer";
    String Department= " Civil";
    void Employee1()
    {
        System.out.println("Name =" +Name + " Age =" +Age + " Phone number = "+ Ph_number+
        " Address =" +Address+ " Salary =" + Salary );
        System.out.println(" Specialization =" +Specialization+ " Department = "+ Department);
    }
    public static void main(String[] args)
    {
      Employee Empobj = new Employee();
      Member.Name= "Raja";
      Member.Age= 30;
      Empobj.Ph_number=652623344;
      Empobj.Address=" Hyderabad ";
      Empobj.Salary=20000;
      Empobj.Employee1();



    }
    
}
