import java.io.*;
import java.util.*;

public class Arraylist {

    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       System.out.println("Enter the number of lists:");
       int n=scanner.nextInt();
       ArrayList<ArrayList<Integer>> lists=new ArrayList<>();
       for(int i=0;i<n;i++){
        System.out.print("Enter the number of index:");
        int size=scanner.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for(int j=0;j<size;j++){
            list.add(scanner.nextInt());
        }
        lists.add(list);
       }
       System.out.println("Enter the number of queries:");
       int q=scanner.nextInt();
       for(int i=0;i<q;i++){
           System.out.println("Enter the number of list index:");
        int listIndex=scanner.nextInt()-1;
        System.out.println("Enter the number of element index:");
        int elementIndex=scanner.nextInt()-1;
        try{
            System.out.println(lists.get(listIndex).get(elementIndex));
        }catch(IndexOutOfBoundsException e){
            System.out.println("ERROR!");
        }
       }
       scanner.close();
    }
}