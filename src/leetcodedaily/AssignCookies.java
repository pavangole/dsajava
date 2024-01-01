package leetcodedaily;

import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        
    }

    static int findContentChildren(int[] g, int[] s) {
        //sort the  two arrays

        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int i = 0;
        int j = 0;
        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                count++;
                i++;
                j++;
            } else {
                j++;
            }
        }
        return count;
    }
}
