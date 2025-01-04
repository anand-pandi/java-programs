import java.util.*;
abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}
class MyBook extends Book{
    
    public void setTitle(String s){
        this.title=s;
    }
    
}
public class AbstractExample{
    public static void main (String[] args) {
      Scanner scn=new Scanner(System.in);
        String title=scn.nextLine();
        MyBook a=new MyBook();
        a.setTitle(title);
        System.out.println("Enter title:" + a.getTitle());
        scn.close();
    }
}