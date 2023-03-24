package String;
//•	Java Program to find maximum and minimum occurring character in a string
public class Program35 {
    public static void main(String[] args) {
    String str = "grass is greener on the other side";  
    int[] freq= new int[str.length()];
    char minChar=str.charAt(0),maxChar=str.charAt(0);
    int i,j,min,max;
     //Converts given string into character array  
    char string[]=str.toCharArray();
    //Count each word in given string and store in array freq  
    for(i=0;i<string.length;i++)
    {
        freq[i]=1;
        for(j=i+1; j<string.length;j++)
    {
        if(string[i]==string[j]&& string[i]!= ' ' && string[i] != '0')
        {
            freq[i]++;
            string[j]='0';

        }
    }
   }
   min = max = freq[0];    
      for(i = 0; i <freq.length; i++) {    
    //Determine minimum and maximum occurring characters
    if(min<freq[i]&&freq[i]!='0')
    {
        min=freq[i];
        minChar=string[i];
    }
     //If max is less than frequency of a character     
          //then, store frequency in max and corresponding character in maxChar    
          if(max < freq[i]) {    
            max = freq[i];    
            maxChar = string[i];    
        }    
}
System.out.println("Minimum occurring character: " + minChar);    
System.out.println("Maximum occurring character: " + maxChar);  
}   
    
}
