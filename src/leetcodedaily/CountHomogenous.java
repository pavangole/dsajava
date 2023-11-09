package leetcodedaily;

public class CountHomogenous {
    public static void main(String[] args) {
        
    }

    static int countHomogenous(String s) {
        long count = 0;
        long result = 0;
        char prev = ' ';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == prev) {
                count++;
            } else {
                count = 1;
                prev = s.charAt(i);
            }
            result += count;
        }
        return (int) (result % 1000000007);
        


    }
}
