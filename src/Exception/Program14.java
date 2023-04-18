package Exception;
//14.	Java Program to Handle Array IndexOutOfBoundException
public class Program14 {
    public static void main(String[] args) {
        try{
            int arr[]= new int[12];
            arr[23]=1;
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(" Arrat index size in more than given " +e);
        }
    }
}
