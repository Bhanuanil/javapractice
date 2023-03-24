package Abstract;

public class A extends Marks {
    float sub1, sub2,sub3;
    float percentage;

    @Override
    float getPercentage() {
        percentage = (sub1 + sub2 + sub3 )/300* 100; 
        return percentage;
    }
    A(float a , float b, float c)
    {
      sub1 = a;
      sub2 = b;
      sub3 = c;    
     }
     public static void main(String[] args) {
        A aobj = new A(89f,97f, 70f);
        System.out.println("Student 1 Percentage is  " +aobj.getPercentage()+"%");
     }
    
}
