package Practice.Leetcode;

import java.util.HashMap;

public class FindChampionII {
    public static void main(String[] args) {
        
    }

    static int findChampion(int n, int[][] edges) {

        HashMap<Integer, Integer> winner = new HashMap<>();
        HashMap<Integer, Integer> loser = new HashMap<>();

        for(int i = 0; i < edges.length; i++) {
            int winnerId = edges[i][0];
            int loserId = edges[i][1];
            loser.put(loserId, 1);
            if(winner.containsKey(loserId)) {
                winner.remove(loserId);
            }
            if(loser.containsKey(winnerId)) {
                continue;
            }
            winner.put(winnerId, 1);

        }
        if(winner.size() == 1 && loser.size() == n - 1) {
            return winner.keySet().iterator().next();
        }
        return -1;
    }
}
