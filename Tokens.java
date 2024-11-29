import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        String a=scan.nextLine();
        StringTokenizer tokenizer=new StringTokenizer(a);
        while(tokenizer.hasMoreTokens()){
            String token=tokenizer.nextToken();
            System.out.println(token);
        }
    }
}