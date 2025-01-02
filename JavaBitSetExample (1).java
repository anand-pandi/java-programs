import java.util.BitSet;
import java.util.Scanner;
public class JavaBitSetExample{
    public static void main (String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the number of bits:\n");
        int n=scn.nextInt();
        scn.nextLine();
        System.out.print("Enter the number of operation:\n");
        int m=scn.nextInt();
        scn.nextLine();
        BitSet bs1=new BitSet(n);
        BitSet bs2=new BitSet(n);
        for(int i=0;i<m;i++){
            System.out.print("Enter the operation name:\n");
            String str=scn.next();
            System.out.print("Enter set number:\n");
            int a=scn.nextInt();
            System.out.print("Enter index number:\n");
            int b=scn.nextInt();
            if(str.equals("AND"))
            {
                if(a==1)
                {
        BitSet andResult=(BitSet)bs1.clone();
        andResult.and(bs2);
        System.out.print(andResult.cardinality()+" "+bs2.cardinality()+"\n");
                }else
                {
                   BitSet andResult1=(BitSet)bs2.clone();
                   andResult1.and(bs1);
                   System.out.println(bs1.cardinality()+" "+andResult1.cardinality()+"\n");
                }
            }
        else if(str.equals("SET"))
        {
            if(a==1)
            {
        bs1.set(b);
        System.out.print(bs1.cardinality()+" "+bs2.cardinality()+"\n");
            }else
            {
                bs2.set(b);
                System.out.println(bs1.cardinality()+" "+bs2.cardinality()+"\n");
            }
            
        }
        else if(str.equals("FLIP"))
        {
            if(a==1)
            {
                bs1.flip(b);
                System.out.println(bs1.cardinality()+" "+bs2.cardinality()+"\n");
            }else
            {
        bs2.flip(b);
        System.out.print(bs1.cardinality()+" "+bs2.cardinality()+"\n");
            }
            
        }
        else if(str.equals("OR"))
        {
            if(a==1)
            {
                BitSet orResult1=(BitSet)bs1.clone();
                orResult1.or(bs2);
            }else
            {
        BitSet orResult=(BitSet)bs2.clone();
        orResult.or(bs1);
        System.out.print(bs1.cardinality()+" "+orResult.cardinality()+"\n");
            }
            
        }
            
        }
    }
}