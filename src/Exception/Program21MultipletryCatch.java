package Exception;
//21.	Java Program to Handle the Exception Using Try and Multiple Catch Block
public class Program21MultipletryCatch {
    public static void main(String[] args) 
{ 
try
{ 
 int arr[] = new int[6]; 
 arr[2] = 20/0; // Exception occurred. 
 System.out.println("I am in try block"); 
} 
catch(ArithmeticException ae)
{ 
 System.out.println("A number cannot be divided by zero, Illegal operation in java"); 
} 
catch(ArrayIndexOutOfBoundsException e)
{ 
 System.out.println("Accessing array element outside of specified limit"); 
} 
catch(Exception e)
{ 
 System.out.println(e.getMessage()); 
} 
System.out.println("I am out of try-catch block"); 
 } 
}
