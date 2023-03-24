public class program22 {
    public static void main(String[] args) {
        int row=9, rowc=0;
        for(int i=row;i>0;i--)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=rowc;j++)
            {
                System.out.print(" * ");
                
            }
            System.out.println();
            rowc++;
        }
    }
    
}
