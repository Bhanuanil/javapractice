public class enhanceswitch {
    public static void main(String[] args) {
        // multiple cases in single block
        int i=20;
        switch(i)
        {
            case 5:
            case 10:
            case 15:
            System.out.println(" for the given value");
            break;
            case 20:
            System.out.println(" value for 20");
            break;
            default:
            System.out.println(" in deault");
        }
        // support multiple value per case 
        int j=15;
        switch(j)
        {
            case 5,10,15:
            System.out.println(" for the given value");
            break;
            case 20:
            System.out.println(" value for 20");
            break;
            default:
            System.out.println(" in deault");
        }
        // yeild is used to retun value and expersion used in switch
        char ch='c';
        String k=switch(ch)
        {
        case 'a','e','i','o','u':
        System.out.println(" alphabet is vovel");
        yield " ";
        case 'b','c','d','f','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z':
        System.out.println(" alphabet is consonent");
        yield "c ";
        default: 
        System.out.println("NOT VOVEL OR CONSONET");
        yield " ";
        };
        System.out.println(" RETURN VALUE IS "+k);
        // Switch with arrow
    int c=10;
    switch(c)
    {
     case 10 -> System.out.println(" In 10");
     case 20 -> System.out.println( "In 20");
     default -> System.out.println("in default");   
    }
    }
    
}
