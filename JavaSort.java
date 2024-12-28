import java.util.*;
class JavaSort{
    public static void main (String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the total number of student:");
        int n=scn.nextInt();
        scn.nextLine();
        
        int[] ids=new int[n];
        String[] names=new String[n];
        double[] cgba=new double[n];
        
        for(int i=0;i<n;i++){
            System.out.println("Enter id:");
            ids[i]=scn.nextInt();
            scn.nextLine();
            System.out.println("Enter name:");
            names[i]=scn.nextLine();
            System.out.println("Enter cgba:");
            cgba[i]=scn.nextDouble();
        }
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        
    }
}