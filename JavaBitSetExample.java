import java.util.BitSet;
public class JavaBitSetExample{
    public static void main (String[] args) {
        BitSet bs1=new BitSet(5);
        BitSet bs2=new BitSet(5);
        BitSet andResult=(BitSet)bs1.clone();
        andResult.and(bs2);
        System.out.print(andResult.cardinality()+" "+bs2.cardinality()+"\n");
        
        bs1.set(4);
        System.out.print(bs1.cardinality()+" "+bs2.cardinality()+"\n");
        
        bs2.flip(2);
        System.out.print(bs1.cardinality()+" "+bs2.cardinality()+"\n");
        
        BitSet orResult=(BitSet)bs2.clone();
        orResult.or(bs1);
        System.out.print(bs1.cardinality()+" "+orResult.cardinality()+"\n");
    }
}