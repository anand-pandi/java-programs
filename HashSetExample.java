import java.util.*;

public class HashSetExample {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.nextLine();
        HashSet<String> name=new HashSet<>();
        for(int i=0;i<n;i++){
            String firstName=s.next();
            String secondName=s.next();
            String pair=firstName+" "+secondName;
            name.add(pair);
            System.out.println(name.size());
        }
        s.close();
    }
}
