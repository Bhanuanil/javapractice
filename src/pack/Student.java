/* Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'.
 Assign the value of roll_no as '2' and
 that of name as "John" by creating an object of the class Student */
package pack;

public class Student {
    int roll_no;
    String name;
    public static void main(String[] args) {
        Student stobj= new Student();
        stobj.name=" Dhanvin ";
        stobj.roll_no= 21;
        System.out.println(" Roll number is " + stobj.roll_no );
        System.out.println(" Name of student is " +stobj.name);
    }
    
}
