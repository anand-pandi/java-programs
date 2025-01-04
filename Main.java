import java.util.*;
public class Main{
    public static void main (String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Guava");
        Iterator<String> iterator=list.iterator();
        while(iterator.hasNext()){
            String s=iterator.next();
            System.out.println(s);
            
            if(s.equals("Banana")){
            iterator.remove();
        }
        }
        
       System.out.println(list);
        
    }
}