import java.util.*;
import java.time.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class Main{
    public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=s.nextLine();
        
        String ptn="\\b(\\w+)(?:\\W+\\1\\b)+";
        Pattern pattern=Pattern.compile(ptn);
        Matcher matcher=pattern.matcher(str);
        
        System.out.println("Original String:");
        System.out.println(str);
        
        while(matcher.find()){
            str=str.replaceAll(matcher.group(),matcher.group(1));
        }
        System.out.println("After duplicate remove string:");
        System.out.println(str);
        
       
        }
}