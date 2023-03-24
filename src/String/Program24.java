package String;
//•	Java Program to count the total number of vowels and consonants in a string
public class Program24 {
    public static void main(String[] args) {
        int vCount = 0, cCount = 0;  
        String str = " This is java program for count numcer of vowels and consonants in a string";
        str= str.toLowerCase();
        System.out.println(str);
        for(int i=0; i<str.length();i++)
       { if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
        { //incremet vcount
            vCount++;   
        }
        else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {      
            //Increments the consonant counter    
            cCount++;    
        }    
    }   
    System.out.println("Number of vowels: " + vCount);    
    System.out.println("Number of consonants: " + cCount);    

    }  
}
