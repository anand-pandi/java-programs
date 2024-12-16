class Gen1<T,V>{
    T ob1;
    V ob2;
    Gen1(T o1,V o2){
        ob1=o1;
        ob2=o2;
    }
    void showtype(){
        System.out.println("Type of T is "+ob1.getClass().getName());
        System.out.println("Type of V is "+ob2.getClass().getName());
    }
    T getob(){
        return ob1;
    }
    V getob1(){
        return ob2;
    }
}
public class GenericTwoParameterExample{
    public static void main (String[] args) {
        Gen1<Integer,Double> obj=new Gen1<Integer,Double>(88,104.44);
        obj.showtype();
        int v=obj.getob();
        System.out.println("value is "+v);
        double d=obj.getob1();
        System.out.println("value is "+d);
        Gen1<String,Integer> obj1=new Gen1<String,Integer>("Hello",45);
        obj1.showtype();
        String str=obj1.getob();
        System.out.println("Value is "+str);
        int val=obj1.getob1();
        System.out.println("Value is "+val);
        
        
    }
}