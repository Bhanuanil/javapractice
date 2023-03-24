package Exception;

public class InavalidAgeException extends Exception{
    public InavalidAgeException(String str) {
        super(str);
    }
    static void valiDate(int age) throws InavalidAgeException{
    if(age <18)
    {
        throw new InavalidAgeException(" age is not valid to vote");
    }
    else 
    {
        System.out.println(" wellcome to vote ");
    }
    }
    public static void main(String[] args) {
    try{
        valiDate(13);
    }catch(InavalidAgeException ex)
    {
        System.out.println(" cought the exception ");
        System.out.println(" Exception occure  " +ex);
    }
    System.out.println(" rest of the code");
    }
    
}
