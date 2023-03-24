public class switchex {
    public static void main(String[] args) {
        int number=20;
        switch(number)
        {
        case 10: System.out.println(10);
        break;
        case 20: System.out.println(20);
        break;
        case 30: System.out.println(30);
        default:
        System.out.println(" Not in 10, 20, 30");
        } 
          // monnths
        int month=8;
        String monthstri=" ";
        switch(month)
        {
            case 1: monthstri= " 1 january ";
            break;
            case 2: monthstri= " 2 FEBRUARY ";
            break;
            case 3: monthstri= " 3 MARCH ";
            break;
            case 4: monthstri= " 4 APRIL ";
            break;
            case 5: monthstri= " 5 MAY ";
            break;
            case 6: monthstri= " 6 JUNE ";
            break;
            case 7: monthstri= " 7 JULY ";
            break; 
            case 8: monthstri= " 8 AUGUST";
            break;
            case 9: monthstri= " 9 SEPTEMBER ";
            break;
            case 10: monthstri= " 10 OUCTOMBER ";
            break;
            case 11: monthstri= " 11 NOVEMBER ";
            break;
            case 12: monthstri= " 12 DECEMBER ";
            break;
            default:
            System.out.println("invalid ");

        }
         System.out.println(monthstri);

         // demonstrate java in string 
         String levelstri=" beignner ";
         int level= 3;
         switch(levelstri)
         {
            case "beignner": level=1;
            break;
            case " intermediate": level=2;
            break;
            case " expert " : level=3;
            break;
            default: level=0;

         }
         System.out.println(" your leve is "+level);
    }
    
}
