public class EvenLengthWords {
    public static void main(String[] args) {
        
        String[] words = {"hello", "world", "java", "programming", "even", "length"};
        for (String word : words) {
           if (word.length() % 2 == 0) {
               System.out.println(word);
            }
        }
    }
}