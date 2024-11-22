import java.util.Scanner;

public class SwapStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();
        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();
        System.out.println("Before Swap:");
        System.out.println("First String: " + str1);
        System.out.println("Second String: " + str2);
        str1 = str1 + str2; 
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length()); 
        System.out.println("After Swap:");
        System.out.println("First String: " + str1);
        System.out.println("Second String: " + str2);
  }
}
