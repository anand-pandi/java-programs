import java.util.*;
public class JavaBitSet{
    public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();

        BitSet bs1=new BitSet(n);
        BitSet bs2=new BitSet(n);
        for(int i=0;i<m;i++){
            String str=s.next();
            int a=s.nextInt();
            int b=s.nextInt();
            switch(str){
                case "AND":
                    if(a == 1){
                        bs1.and(bs2);
                    }else{
                        bs2.and(bs1);
                    }
                    break;
                case "SET":
                    if(a == 1){
                        bs1.set(b);
                    }else{
                        bs2.set(b);
                    }
                    break;
                case "FLIP":
                    if(a == 1){
                        bs1.flip(b);
                    }else{
                        bs2.flip(b);
                    }
                    break;
                case "OR":
                    if(a == 1){
                        bs1.or(bs2);
                    }else{
                        bs2.or(bs1);
                    }
                    break;
                default:
                 System.out.println("Invalid operation");
                 break;
                }
                System.out.println(bs1.cardinality()+" "+bs2.cardinality());
        }
        s.close();
    }
}