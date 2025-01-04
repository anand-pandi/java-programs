import java.util.*;
class Student{}
class Rockstar{}
class Hacker{}
 class JavaInstanceof{
    public static void main (String[] args) {
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
        ArrayList mylist=new ArrayList();
        for(int i=0;i<t;i++){
            String str=scn.next();
            if(str.equals("Student"))mylist.add(new Student());
            if(str.equals("Rockstar"))mylist.add(new Rockstar());
            if(str.equals("Hacker"))mylist.add(new Hacker());
            }
            System.out.println(count(mylist));
    }


    static String count(ArrayList mylist){
        int a=0,b=0,c=0;
        for(int i=0;i<mylist.size();i++){
            Object element =mylist.get(i);
            if(element instanceof Student)a++;
            if(element instanceof Rockstar)b++;
            if(element instanceof Hacker)c++;
        }
        String ret =Integer.toString(a)+" "+Integer.toString(b)+" "+Integer.toString(c);
        return ret;
    }
}