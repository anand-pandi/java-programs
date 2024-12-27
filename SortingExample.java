import java.util.Arrays;
import java.util.Scanner;
class SortingExample{
    public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] numbers =new int[n];
        for(int i=0;i<n;i++){
            numbers[i] =s.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        System.out.println("Original Array:"+Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Sorting Array:"+Arrays.toString(numbers));
    }
}