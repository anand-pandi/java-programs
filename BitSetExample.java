import java.util.BitSet;
public class BitSetExample
{
	public static void main(String[] args) {
		BitSet bs1=new BitSet(8);
		BitSet bs2=new BitSet(8);
		
		bs1.set(0);
		bs1.set(2);
		bs1.set(4);
		bs2.set(1);
		bs2.set(2);
		bs2.set(3);
		System.out.println(bs1);
		System.out.println(bs2);
		
		BitSet andResult=(BitSet)bs1.clone();
		andResult.and(bs2);
		System.out.println("And Result is"+andResult);
		BitSet orResult=(BitSet)bs1.clone();
		orResult.or(bs2);
		System.out.println("Or Result is"+orResult);
		BitSet xorResult=(BitSet)bs1.clone();
		xorResult.xor(bs2);
		System.out.println("XOR Result is"+xorResult);
		
		System.out.println("Cardinality of BitSet 1:"+bs1.cardinality());
		System.out.println("Cardinality of BitSet 2:"+bs2.cardinality());
	}
}