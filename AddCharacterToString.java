public class AddCharacterToString {
    public static void main(String[] args) {
        String str = "Hello";  
        char charToAdd = '!'; 
        StringBuilder sb = new StringBuilder(str);
        sb.append(charToAdd);
        String result = sb.toString();
        System.out.println("Resulting String: " + result);
    }
}