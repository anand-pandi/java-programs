import java.util.*;
public class MapExample{
    public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.nextLine();
        
        HashMap<String,String> phoneBook = new HashMap<>();
        for(int i=0;i<n;i++){
            String name=s.nextLine();
            String number=s.nextLine();
            phoneBook.put(name,number);
        }
        while(s.hasNextLine()){
            String query=s.nextLine();
            if(phoneBook.containsKey(query)){
                System.out.println(query + "=" + phoneBook.get(query));
            }else{
                System.out.println("Not found");
            }
        }
        s.close();
    }
}