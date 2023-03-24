
//20.	Inverted half pyramid using *
public class program20 {
    public static void main(String[] args) {
        int row=6;
        for(int i=1; i<=row; i++)
        {
           for(int j=row; j>=i; j--)
           {
            System.out.print( " * ");
           }
           System.out.println();
        }
    }
    
}
