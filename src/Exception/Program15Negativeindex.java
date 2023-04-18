package Exception;
//15.	Java Program to Handle NegativeArraySizeException
public class Program15Negativeindex {
    public static void main(String[] args) {
        try{
            int arr[]= new int[-5];
        }catch(NegativeArraySizeException Ne)
        {
            Ne.printStackTrace();
        }
    }
    
}
