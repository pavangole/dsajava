package leetcodedaily;

import java.util.HashMap;
import java.util.Map;

public class FindWinnerArray {
    public static void main(String[] args) {
        
    }

    static int getWinner(int[] arr, int k ){
        Map<Integer, Integer> map = new HashMap<>();
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < max) {
                map.put(max, map.getOrDefault(max, 0) + 1);
                if(map.get(max) == k) {
                    return max;
                }
            } else {
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
                if(map.get(arr[i]) == k) {
                    return arr[i];
                }
                max = arr[i];
            }
        }
        return max;
    }
}
