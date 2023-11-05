package Practice.Leetcode;

public class FindChampionI {
    public static void main(String[] args) {
        //grid = [[0,1,1],[0,0,1],[0,0,0]]
        int[][] grid = new int[][] {{0,1,1},{0,0,1},{0,0,0}};
        System.out.println(findChampion(grid));
    }

    static int findChampion(int[][] grid) {
        int champion = -1;
        for(int row = 0; row < grid.length ; row++) {
            for(int column = 0; column < grid.length ; column++) {
                if(row == column) {
                    continue;
                }
                if(grid[row][column] == 1) {
                    if(champion == -1)  {
                        champion = row;
                    }
                    else if(grid[row][champion] == 1) {
                        champion = row;
                    }
                }    
            }
        }
        return champion;
    }
}
