package Practice.Leetcode;

public class LongestZigzagPath {
    public static void main(String[] args) {
        
        //
    }

    static int longestZigZag(TreeNode root) {
        return helper(root, -1,0,0);
    }


    static int helper(TreeNode root, int direct, int countr, int countl) {
        if(root == null) {
            return 0;
        }
        if(root.left == null && root.right == null) {
            return 0;
        }
        if(direct == 0) {
            countl = countl + 1;
            countr = 0;
        }
        if(direct == 1) {
            countr = countr + 1;
            countl = 0;
        }
        int left = 0;
        int right = 0;
        if(root.left != null)
        {
            left = helper(root.left, 1,countr, countl);
            if(direct == 0 && countl < 2) {
                left = left + 1;
            }
        }
        if(root.right != null) {
            right = helper(root.right,0,countr,countl);
            if(direct == 1 && countr < 2) {
                right = right + 1;
            }
        }
        return Math.max(left,right);
    }


}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

