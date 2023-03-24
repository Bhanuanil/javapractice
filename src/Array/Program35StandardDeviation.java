package Array;
//Java Program to Calculate Standard Deviation
public class Program35StandardDeviation {
    public static void main(String[] args) {
    double arr[]={1,2,3,4,5,6,7,8,9};
    double Sd=  calculateSD(arr);
    System.out.format("Standard Deviation = %.6f", Sd);
    }
    public static  double calculateSD(double[] arr) {
        double sum = 0.0, standardDeviation = 0.0;
        int length = arr.length;

        for(double num : arr) {
            sum += num;
        }
        double mean = sum/length;

        for(double num: arr) {
            standardDeviation += Math.pow(num - mean, 2);
        }//we've used the help of Java Math.pow() and Java Math.sqrt() to calculate the power and square root respectively.

        return Math.sqrt(standardDeviation/length);
    }
} 


    
