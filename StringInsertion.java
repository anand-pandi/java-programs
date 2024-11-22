public class StringInsertion {
    public static void main(String[] args) {
        String original = "Hello, World!";
        String toInsert = "Beautiful ";
        int position = 7;  
        
        String result = insertString(original, toInsert, position);
        System.out.println(result);
    }
    public static String insertString(String original, String toInsert, int position) {
       if (position < 0 || position > original.length()) {
            throw new IllegalArgumentException("Invalid position");
        }
        return original.substring(0, position) + toInsert + original.substring(position);
    }
}