package leetcodedaily;

import java.util.HashSet;
import java.util.Set;

public class PathCrossing {
    public static void main(String[] args) {
        // Your code here

    }

    boolean isPathCrossing(String path) {
        int x = 0, y = 0;
        Set<String> visited = new HashSet<>();
        visited.add("0,0");

        for (char c : path.toCharArray()) {
            if (c == 'N') {
                y++;
            } else if (c == 'S') {
                y--;
            } else if (c == 'E') {
                x++;
            } else if (c == 'W') {
                x--;
            }

            String currentPosition = x + "," + y;
            if (visited.contains(currentPosition)) {
                return true;
            }
            visited.add(currentPosition);
        }

        return false;
    }

}
