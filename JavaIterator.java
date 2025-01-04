import java.util.*;
public class JavaIterator{
    public static void main (String[] args) {
        Scanner scn=new Scanner(System.in);
        ArrayList mylist=new ArrayList();
        int n=scn.nextInt();
        int m=scn.nextInt();
        for(int i=0;i<n;i++){
            mylist.add(scn.nextInt());
        }
        mylist.add("###");
        for(int i=0;i<m;i++){
            mylist.add(scn.next());
        }
        Iterator it=func(mylist);
        while(it.hasNext()){
            Object element=it.next();
            System.out.println((String)element);
        }
        scn.close();
        
    }
    static Iterator func(ArrayList mylist){
        Iterator it=mylist.iterator();
        while(it.hasNext()){
            Object element=it.next();
            if(element instanceof String && element.equals("###"))
            break;
        
        }
        return it;
    }
}