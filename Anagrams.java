import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        String a=scan.nextLine();
        String b=scan.nextLine();
        boolean ret=isAnagram(a,b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
        
    }
    public static boolean isAnagram(String a, String b){
        if(a.length() != b.length()){
            return false;
        }
        
        a=a.toLowerCase();
        b=b.toLowerCase();
        
        int[] frequencyA =new int[26];
        int[] frequencyB =new int[26];
        
        for(int i=0;i<a.length();i++){
            frequencyA[a.charAt(i) - 'a']++;
            frequencyB[b.charAt(i) - 'a']++;
        }
        for(int i=0;i<26;i++){
            if(frequencyA[i] != frequencyB[i]){
                return false;
            }
        }
        return true;
    }
}