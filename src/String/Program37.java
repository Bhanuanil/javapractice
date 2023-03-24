package String;

import java.io.Console;

//•	Java program to find the duplicate characters in a string
public class Program37 {
    public static void main(String[] args) {
        String str="Great responsibility";
        int count;
        //Converts given string into character array
        char string[]=str.toCharArray();
        System.out.println("Duplicate characters in a given string: ");  
        for(int i=0;i<str.length();i++)
        {
            count=1;
            for(int j=i+1;j<str.length();j++)
            {
                if(string[i]==string[j]&&string[i]!=' ')
                {
                    count++;
                    string[j]='0';
                }
            }
            if(count > 1 && string[i] != '0')  
            System.out.println(string[i]);  
        }
    }    
}
