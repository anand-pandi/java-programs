class Gen1<T>{
    T ob1;
    Gen1(T o1){
        ob1=o1;
    }
    void showtype(){
        System.out.println("Type of T is "+ob1.getClass().getName());
    }
    T getob(){
        return ob1;
    }
}
public class GenerticExample{
    public static void main (String[] args) {
        Gen1<Integer> obj=new Gen1<Integer>(88);
        obj.showtype();
        int v=obj.getob();
        System.out.println("value is "+v);
        Gen1<String> obj1=new Gen1<String>("Hello");
        obj1.showtype();
        String str=obj1.getob();
        System.out.println("Value is "+str);
    }
}