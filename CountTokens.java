import java.util.*;
class CountTokens{
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        String a=scan.nextLine();
        StringTokenizer tokenizer=new StringTokenizer(a,",");
        int tokenCount=tokenizer.countTokens();
        System.out.println(tokenCount);
        while(tokenizer.hasMoreTokens()){
            String token=tokenizer.nextToken();
            System.out.println(token);
        }
    }
}