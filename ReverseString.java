public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello, World!";  // Example string to reverse

        // Reverse the string using StringBuilder
        String reversed = new StringBuilder(str).reverse().toString();

        // Print the reversed string
        System.out.println("Reversed String: " + reversed);
    }
}
