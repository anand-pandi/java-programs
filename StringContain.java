import java.util.Scanner;

public class StringContain{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String firstString = scanner.nextLine();
        System.out.println("Enter the second string:");
        String secondString = scanner.nextLine();
        if (firstString.contains(secondString)) {
            System.out.println("The first string contains the second string.");
        } else {
            System.out.println("The first string does not contain the second string.");
        }
    }
}
