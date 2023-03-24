package Array;
//28) Java Program to find the frequency of odd & even numbers in the given matrix
public class Program28evenoddfrequency {
    public static void main(String[] args) {
        int rows,cols;
        int a[][]={{2,3,4},{6,7,8},{9,6,5}};
        int countOdd=0, countEven=0;
        rows=a.length;
        cols=a[0].length;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            { if(a[i][j]%2==0)
                countEven++;
                else
                countOdd++;
            }
        }
        System.out.println(" frequency of odd is  " + countOdd);
        System.out.println(" frequency of even is  " + countEven);
    }
    
}
