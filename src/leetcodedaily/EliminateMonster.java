package leetcodedaily;

import java.util.Arrays;

public class EliminateMonster {
    public static void main(String[] args) {
        
    }

    static int eliminateMaximum(int[] dist, int[] speed) {
        int[] time = new int[dist.length];
        
        for (int i = 0; i < dist.length; i++) {
            time[i] = (int) Math.ceil((double) dist[i] / speed[i]);
        }
        Arrays.sort(time);
        int i;
        for( i = 0; i < time.length; i++) {
            if(time[i] - i == 0) {
                break;
            }

        }
        return i;
    }
}
