public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer str =new StringBuffer();// default capacity is 16
        str.append(" appending ");
        str.insert(11, "to");
        System.out.println(str+ " " +str.length()+" "+str.capacity());// str geting latest value thats why it is inmutable
        String s=" Well come ";
        s.concat(" to java");
    
        System.out.println(s);
    
        StringBuffer str1 = new StringBuffer(s);
        str1.reverse();// it reverse the order
        str1.append(" to java");
        System.out.println(str1+ " "  +str1.length()+" "+str1.capacity());
        StringBuffer str2 = new StringBuffer(6);
        System.out.println(str2 + " " +str2.capacity());
        StringBuffer str3 =new StringBuffer();
        str3.append("well come to java string");
        str3.replace(0, 6, "SWell"); // it replace the vaue form existing data
        str3.insert(5 , "-");// it insert the value
       // str3.delete(0,str3.length()); // it delet the whole data
       str3.deleteCharAt(0);// it delet the specific character
        System.out.println(str3);
        //capcity = old capacity *2+2 it increase like this first time we give the it will be the same as length
        StringBuffer str4 = new StringBuffer();
        str4.append("well come to  ");
        str4.ensureCapacity(50);/*  here we give capacity is 50 if its
         capacit is less than 50 then it will give capacity as50 only  and if it is more 
         than that it will use formula */
        System.out.println(str4+ " "+str1.length()+" "+str4.capacity());

    }
    
}
