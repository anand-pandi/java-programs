import java.util.*;
import java.math.BigInteger;

class BigIntegerJava {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        String b=s.nextLine();
        
        BigInteger a1=new BigInteger(a);
        BigInteger b1=new BigInteger(b);
        
        BigInteger sum=a1.add(b1);
        BigInteger product=a1.multiply(b1);
        
        System.out.println(sum);
        System.out.println(product);
        
    }
}