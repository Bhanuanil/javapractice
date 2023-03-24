/*Assign and print the roll number, phone number and address of two students having names "Sam" and "John"
 respectively by creating two objects of class 'Student'. */
package pack;

public class Student2 {
    
    int roll_no;
    String name;
    int ph_no;
    String address;
    Student2()
    {

    }
    Student2(int i,String n,int p, String a ){
        this.roll_no=i;
       this. name =n;
        this.ph_no=p;
        this.address=a;

    }

    void display()
    {
        System.out.println("Roll No " +roll_no+ " Name "+name+ " Phone number "
        +ph_no+ " Address "+address );
    }

    public static void main(String[] args) {
        Student2 stdobj= new Student2();
        Student2 stdobj1 = new Student2();
        Student2 stdobj3= new Student2(3, " Arvind ", 25367, "gowtham nagar");
        stdobj.roll_no=1;
        stdobj.name= " Dhanvin ";
        stdobj.ph_no= 827657665;
        stdobj.address=" MALKAJGIRI HYDERABAD ";
        System.out.println("print the roll number, phone number and address of two students ");
        System.out.println("Roll No " + stdobj.roll_no+ " Name "+stdobj.name+ " Phone number "
        +stdobj.ph_no+ " Address "+ stdobj.address );
        stdobj1.roll_no=2;
        stdobj1.name= " Sruthi ";
        stdobj1.ph_no= 276576785;
        stdobj1.address=" MALKAJGIRI GOWTHAM NAGAR HYDERABAD ";
        System.out.println("Roll No " + stdobj1.roll_no+ " Name "+stdobj1.name+ " Phone number "
        +stdobj1.ph_no+ " Address "+ stdobj1.address );
        stdobj3.display();

    

        
    }
}
