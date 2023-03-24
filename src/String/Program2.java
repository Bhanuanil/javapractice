package String;
//3.	Java Program to Convert String to Date
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Program2 {
    public static void main(String[] args) {
        String string = "2017-07-25";
        LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);
        //LocalDate Date =LocalDate.parse(string, DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(date);
        //System.out.println(Date);
    }
}
