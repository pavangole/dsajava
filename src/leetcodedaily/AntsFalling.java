package leetcodedaily;

public class AntsFalling {
    public static void main(String[] args) {
        
    }

    public int getLastMoment(int n, int[] left, int[] right) {
        //find max of left and max of right
        int maxLeft = 0;
        int maxRight = 0;
        for (int i = 0; i < left.length; i++) {
            maxLeft = Math.max(maxLeft, left[i]);
        }
        for (int i = 0; i < right.length; i++) {
            maxRight = Math.max(maxRight, n - right[i]);
        }
        return Math.max(maxLeft, maxRight);
    }
}
