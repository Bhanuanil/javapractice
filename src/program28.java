public class program28 {
    public static void main(String[] args) {
        for( int i=1; i<=7; i++)
        {
            for ( int j=1; j<=i; j++)
            {
            System.out.print(" * ");
            }
            System.out.println();
        }
        int row=8;
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
