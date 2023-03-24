public class objectclassdemo {
    int i=12;
    String str= " hello ";
    void Display()
    {
        System.out.println(" This is display method ");
    }
    
        int j;
        String str1 ;
        int rollno;
        String name;
        objectclassdemo(){
            //this("bhanu",10);
             i=10;
             str=" hello";
            System.out.println(" In constructor " +i+ " "+str);
        }
        objectclassdemo( int rollno, String name ){
            this.rollno=rollno;
            this.name =name;
            System.out.println(" In param consructor");
        }
        objectclassdemo( String name, int rollno)
        {
            this.rollno=rollno;
            this. name=name;
            System.out.println(" in param constructor");

        }
        objectclassdemo(String a, boolean b)
        {
           System.out.println(" string and boolean");
        }
        objectclassdemo(int j, String s, boolean c)
        {
            System.out.println(" int string boolean");
        }
       
        public static void main(String[] args) {
 
        int a=33;
        objectclassdemo classobj = new objectclassdemo();
        classobj.i= 100;
        classobj.str=" class ";
        classobj.Display();
        
        
        objectclassdemo classobj1 =new objectclassdemo();
        classobj1.i = 500;
        classobj1.str = " demo ";
        classobj1.Display();
        System.out.println(classobj.i+ " " +classobj.str+" " +a);
        System.out.println(classobj1.i +" "+ classobj1.str);
        objectclassdemo class3 =new objectclassdemo("bhanu ",true);
        class3.Display();
        objectclassdemo class4= new objectclassdemo(1, "nani", true);
        class4.Display();
    }
    
}
