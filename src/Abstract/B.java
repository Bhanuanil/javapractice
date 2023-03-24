package Abstract;

public class B extends Marks{
    float sub1, sub2,sub3,sub4;
    float percentage;

    @Override
    float getPercentage() {
        percentage= (sub1+sub2+sub3+sub4)/400*100;
        return percentage;
    }

     B(float a, float b, float c, float d)
    {
       sub1=a;
       sub2=b;
       sub3=c;
       sub4=d;
    }
    public static void main(String[] args) {
        B bobj = new B(67, 78, 89, 96);
        System.out.println("Student 2 Percentage is  " +bobj.getPercentage()+"%");
        
    }

    
    
    
}
