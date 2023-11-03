package leetcodedaily;

import java.util.ArrayList;
import java.util.List;

public class BuildArrayWithStackOp {
    public static void main(String[] args) {
        
    }

    static List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int i = 0;
        int j = 1;
        while (i < target.length) {
            if (target[i] == j) {
                ans.add("Push");
                i++;
                j++;
            } else {
                ans.add("Push");
                ans.add("Pop");
                j++;
            }
        }
        return ans;
    }
}
