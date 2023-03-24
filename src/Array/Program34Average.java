package Array;
//Java Program to Calculate Average Using Arrays
public class Program34Average {
    public static void main(String[] args) {
        double a[]={23.4,67.5, -45.6, 20.34, 33.0, 45.6};
        double sum=0.0;
        for(double num : a)
        {
            sum+=num;
        }
        double average = sum/a.length;
        System.out.format("The average is:%.2f", average);
    }/*we print the average using format()
     function so that we limit the decimal
     points to only 2 using "%.2f" */
}
