package Practice.Leetcode;

public class CountNoVowels {
    public static void main(String[] args) {
        
    }

    static int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        for(int i = left; i <= right ; i++) {
            String word = words[i];
            //check first character is and last character is vowel
            if((word.charAt(0) == 'a' || word.charAt(0) == 'e' || word.charAt(0) == 'i' ||
            word.charAt(0) == 'o' || word.charAt(0) == 'u' ) && ( word.charAt(word.length() - 1) == 'a' ||
            word.charAt(word.length() - 1) == 'e' || word.charAt(word.length() - 1) == 'i' ||
            word.charAt(word.length() - 1) == 'o' || word.charAt(word.length() - 1) == 'u')) {
                //check if all characters are vowels
                count++;
            }
        }
        return count;
    }
}
