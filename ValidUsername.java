import java.util.*;
import java.util.regex.Pattern;

public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    String regex="^[a-zA-Z][a-zA-Z0-9_]{8,30}[a-zA-Z0-9]$";
	    Pattern pattern=Pattern.compile(regex);
	    int n=Integer.parseInt(s.nextLine());
	    for(int i=0;i<n;i++){
	        System.out.println("Enter the username:");
	        String username=s.nextLine();
	        
	        if(pattern.matcher(username).matches()){
	            System.out.println("Valid username");
	        }else{
	            System.out.println("Invalid username");
	        }
	    }
		
	}
}