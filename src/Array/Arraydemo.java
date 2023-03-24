package Array;

public class Arraydemo {
    public static void main(String[] args) {
        int arr[];//DECLARE
        arr = new int[8];//instatiation
        arr[0]=9;
        arr[1]=7;
        arr[2]=8;

        String strarr[]= new String[9];
        strarr[0]="A";
        strarr[1]="B";//INITIALZATION
        strarr[2]="C";
        strarr[3]="D";
        strarr[4]="E";
        // declaration , instation, initalization
        char chArr[]={'a','b'};
        System.out.println("My ARRAY VALUES");
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);// ineax value
        }
       /*  for(int j=arr.length-1; j>=0; j--)
        {
            System.out.println(arr[j]);// ineax value
        }*/
        // for each loop
        for(String i:strarr)
        {
            System.out.println(i);//deals with elements
        }
        
        int arrr[]={1,2,3,4,5,6,6,};
        printArray(arrr);
        printAnnArray(new int[]{1,3,5,6});// we dont decalres the name
        String[] s= myvalue1(strarr);
        
        for(String s1:s)
        {
            System.out.println(s1);
        }
        System.out.println(myvalue1(strarr));
    }
    
        static void printArray(int a[])
        {
            System.out.println("Printing from method");
            for(int s:a)
            {
                System.out.println(s);
            }
        }
        static void printAnnArray(int b[])
        {
            System.out.println("Printing from annonimous method");
            for(int k:b)
            {
                System.out.println(k);
            }
        }
        int main(){
        return 10;
        }
        String myvalue(String[] strarr){
            return "abc";// here we return the value 
        }
        static String[] myvalue1(String[] strarr){
            //return strarr;// here we return the array of string
            strarr[2]="Eagles";
            return new String[] {" x","z","y"};
        }
}
