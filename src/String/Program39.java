package String;
//•	Java Program to find the frequency of characters
public class Program39 {
    public static void main(String[] args) {
        String str = "This is java program for frequency";
        char ch = 'a';
        int frequency = 0;
        for(int i = 0; i < str.length(); i++) {
            if(ch == str.charAt(i)) {
                ++frequency;
            }
        }

        System.out.println("Frequency of " + ch + " = " + frequency);
    }
    
}
