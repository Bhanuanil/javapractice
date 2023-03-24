public class StringDemo {
    String Name = "123@basdd ";//string is a collection of character, it is inmutable means we can not change
    String st = new String();// string is a class
    public static void main(String[] args) {
        StringDemo stobj = new StringDemo();
        String str = " abcd@435222";// memory will alocated in two places 1 heap area , string constant pool(scp)
      // str=str.concat(" hello java");
        String str1 =" abcd@435222";//string literal
        String str2 = new String(" abcd@435222"); // string class it will create new obj in heap area
        String str4 =" abCd@435222";
        str.concat(" Hello ");// it will not concat because its inmutable 
       System.out.println(str);
       System.out.println(str1);
       System.out.println(str2);
       System.out.println(str.equals(str1)); //equals is give boolean value it check casesencitive 
       System.out.println(str1.equals(str2));
       System.out.println(str1.equals(str4));// it check case sencitive
       System.out.println(str1.equalsIgnoreCase(str4));// it ignore the case sensitive
       System.out.println(str1==str2); // it check the value and references also
       System.out.println(str==str1);
       //compareto method 
       String str5 = "aba";
       String str6 = "aba";
       String str7  = new String("aba12");
       System.out.println(str5.compareTo(str7));// same date it give 0, < it give -,>positive 
       System.out.println(str7.compareTo(str5));
       //substring
       String str8 = "  Hello World ";
       String str9 = "  Good Morning";
       String str10  = new String("welcome java");
       System.out.println(str8.substring(4));
       System.out.println(str10.substring(1, 7));
       // begin index inclusive , end index with exclusive
       System.err.println(str9.toLowerCase());//to lower case
       System.err.println(str9.toUpperCase());// to upper case
       System.out.println(str8.trim());// it trim white spaces begining and end white spaces
       //startwth and ends with
       System.err.println(str8.startsWith("hell"));
       System.err.println(str8.startsWith("  He"));
       System.err.println(str8.endsWith("ll"));
       System.err.println(str8.endsWith("ld "));
       // length of string
       System.out.println(str8.length());
       System.out.println(str8.charAt(12));
       int a=23;
       String str11 = String.valueOf(a);
       System.out.println(a+str11);
       //replace if it 
       String str12 = "hello basic java";
       System.out.println(str12.replace("basic", "core"));
       System.out.println(str12.replace("core", "basic"));
       //charAt return the character at specfic index
       System.out.println(str12.charAt(2));
       // codePointAt-- Return the Unicode of the first character in a string
       System.out.println(str12.codePointAt(6));
       //codePointBefore--Returns the Unicode of the character before the specified index
       System.out.println(str.codePointBefore(2));
       //codePointAt--Returns the number of Unicode values found in a string.
       System.out.println(str12.codePointAt(5));
       // concat--Appends a string to the end of another string
       System.out.println(str12.concat(str11));
      //contains --Checks whether a string contains a sequence of characters
      System.out.println(str.contains(str1));
      System.out.println(str12.contains(str11));
      //Hash code--Returns the hash code of a string
      //System.out.println(str11.hashCode(a));

      

       System.out.println();


       

    }
}
