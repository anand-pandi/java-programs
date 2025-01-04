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
public class JavaAbstract{
    public static void main (String[] args) {
      Scanner scn=new Scanner(System.in);
        String title=scn.nextLine();
        MyBook new_novel=new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is:" + new_novel.getTitle());
        scn.close();
    }
}