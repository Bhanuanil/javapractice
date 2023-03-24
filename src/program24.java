public class program24 {
    public static void main(String[] args) {
        int row=9 , rowc=row;
        for(int i=0 ;i<row;i++)
        {
            for(int j=1; j<i*2; j++)
            {
                System.out.print("  ");
            }
            for(int j=0; j<i-1;++j)
            {
                System.out.print(" * ");
            }
            for(int j=rowc-1; j>=1; j--)
            {
                System.out.print(" ");
            }
            System.out.println();
             rowc--;
        }
    }
    
}
