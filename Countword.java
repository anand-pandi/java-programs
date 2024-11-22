public class Countword
{
	public static void main(String[] args) {
        String input = "Java is platform independent programming language";

        if (input == null || input.trim().isEmpty()) {
            System.out.println("The string is empty.");
        } else {
            String[] words = input.trim().split("\\s+");
            int wordCount = words.length;
            System.out.println("Number of words in the string: " + wordCount);
        }
	}
}