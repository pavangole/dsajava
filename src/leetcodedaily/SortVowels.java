package leetcodedaily;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class SortVowels {
    public static void main(String[] args) {
        System.out.println(sortVowels("lEetcOde"));
    }

    static String sortVowels(String s) {
        //crete a arraylist of characters
        //loop through the string
        //if the character is a vowel add it to the arraylist
        //sort the arraylist
        //loop through the string again
        //if the character is a vowel replace it with the first element in the arraylist
        //remove the first element in the arraylist
        //return the string
        //vowels can be upper or lower case
        ArrayList<Character> vowels = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'A' || s.charAt(i) == 'e' || s.charAt(i) == 'E' || 
            s.charAt(i) == 'i' || s.charAt(i) == 'I' || s.charAt(i) == 'o' || s.charAt(i) == 'O' || 
            s.charAt(i) == 'u' || s.charAt(i) == 'U'){
                vowels.add(s.charAt(i));
            }
        }
        Collections.sort(vowels);
        System.out.println(vowels);
        String result = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'A' || s.charAt(i) == 'e' || s.charAt(i) == 'E' || 
            s.charAt(i) == 'i' || s.charAt(i) == 'I' || s.charAt(i) == 'o' || s.charAt(i) == 'O' || 
            s.charAt(i) == 'u' || s.charAt(i) == 'U'){
                result = result + vowels.get(0);
                vowels.remove(0);
            }
            else {
                result = result + s.charAt(i);
            }
        }
        return result;
    }
}
