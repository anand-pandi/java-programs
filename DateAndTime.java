import java.util.*;
import java.time.*;
class Main{
    public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        int month=s.nextInt();
        int day=s.nextInt();
        int year=s.nextInt();
        
        LocalDate date=LocalDate.of(year,month,day);
        String dayOfWeek=date.getDayOfWeek().toString();
        System.out.println(dayOfWeek);
        }
}