public class forloopexample {
    public static void main(String[] args) {
       // simple for loop
        for(int i=1; i<=10; i++)
        {
            System.out.println(i);
        }
        //nested for loop
        for(int i=1; i<=5;i++)
        {
        for(int j=1; j<=i; j++ )
        {
            System.out.print(i);
        }
    
        System.out.println();
        }
        //break
        for(int i=1; i<=5;i++)
        {
        for(int j=1; j<=i; j++ )
        
        {
            System.out.print(+i+" "+j);
            break;
        }
          System.out.println();
        }  
        // to break outer loop we have to give name for that loop ex
        loop1:
        for(int i=1; i<=5;i++)
        {
        loop2: 
        for(int j=1; j<=i; j++ )
        
        {
            System.out.print(+i+" ");
            if (i == 2)
            break loop1;
          
        }
          System.out.println();
        }  

         for (int i=1; i<=6 ; i++) 
         {
         if( i==5)
           continue;
          System.out.println(i);
         }
         // while loop
         int i=1;
         while(i<=10)
         {
            System.out.println(i);
            i++;
         }
          
         int j=1;
         do{
            System.out.println(" do while loop " +j);
           }while(j<1);
    }
    
}
