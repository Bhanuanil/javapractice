public class StringBuildeDemo {
    public static void main(String[] args) {
    StringBuilder str = new StringBuilder();
    str.append(" wellcome to this world java ");
    System.out.println(str.capacity());
    StringBuffer str1 = new StringBuffer("Well come to java ");
    System.out.println(str1.capacity());// 16+length=capacity
    StringBuilder str2 = new StringBuilder(70);
    str2.append(" wellcome to this world java program for string builder gasd dsadas asds");
    System.out.println(str2.length()+" "+str2.capacity());
    StringBufferDemo strObj = new StringBufferDemo();
    System.out.println(strObj.toString());
    }
    
}
