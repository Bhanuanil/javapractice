package Array;

import java.util.Arrays;
// Java Program to Concatenate Two Arrays
public class Program41Concattwoarray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int aLen = array1.length;
        int bLen = array2.length;
        int[] result = new int[aLen + bLen];

        System.arraycopy(array1, 0, result, 0, aLen);
        System.arraycopy(array2, 0, result, aLen, bLen);

        System.out.println(Arrays.toString(result));
    }
    
}
