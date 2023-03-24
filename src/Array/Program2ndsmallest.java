package Array;

public class Program2ndsmallest {
    public static int getSecondSmallest(int[] a,int total){
        int temp;
        
           for(int i=0; i<total;i++)
           {
            for(int j=i+1;j<total;j++)
            {
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }
    
           } 
           return a[1];  //2nd element because index starts from 0 
        }
        public static void main(String[] args) {
            int a[]={11,23,45,34,29,65};  
    int b[]={12,34,65,78,90,20,54};  
    System.out.println("Second Smallest: "+ getSecondSmallest(a,6));  
    System.out.println("second Smallest: "+ getSecondSmallest(b,7)); 
            
        }
        
    }

