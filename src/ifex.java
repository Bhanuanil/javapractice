public class ifex {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int age=20;
        // if statement
        if(age>=18);
        {
            System.out.println(" age is more than 18");
        }
        // if - else statement 
        int a=19;
        if(a>=18)
        {
            System.out.println(" He is elligible to vote " +a);
        }
        else 
        {
            System.out.println(" He is not eligible to vote " +a);
        }
        // if - else statement
        int year=2024;
        if ((year%4==0&&year%100!=0)||year%400==0)
        {
            System.out.println(" LEAP YEAR" +year);
        }
        else 
        {
            System.out.println(" COMON YEAR " +year);
        }
          int num=16;
          String output=(num%2==0)? " Even number ": " odd Number ";
          System.out.println(output); 
          //if - else - if ladder statement
          int marks =98;
          if (marks<50)
          {
            System.out.println(" FAIL ");
          }
          else if (marks>=50 && marks<60)
          {
            System.out.println(" D gread ");
          }
          
          else if (marks>=60 && marks<70)
          {
            System.out.println(" C gread ");
          }
          else if (marks>=70 && marks<80)
          {
            System.out.println(" B gread ");
          }
          else if (marks>=80 && marks<90)
          {
            System.out.println(" A gread ");
          }
          else if (marks>=90 && marks<100)
          {
            System.out.println(" A+ gread ");
          }
          else 
          {
            System.out.println(" INVALID ");
          }
          // nested if 
          int ages=21;
          int weight=40;
          if(ages>=18)
        {
          if(weight>50)
          {
          System.out.println("   eligible to donate boold ");
          }
          else 
          {
            System.out.println( " not eligible to donate boold ");
          }
        }
          else 
          {
          System.out.println( " invalid age it should mor than 18");
          }
        



    }
    
}
