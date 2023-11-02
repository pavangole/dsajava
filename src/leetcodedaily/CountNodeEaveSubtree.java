package leetcodedaily;

public class CountNodeEaveSubtree {
    static int count = 0;
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(2);

        averageOfSubtree(root);
        System.out.println(count);
    }

    static  int[]  averageOfSubtree(TreeNode root) {
        if(root == null){
            return new int[]{0,0};
        }
        if(root.left == null && root.right == null){
            count++;
            return new int[]{root.val,1};
        }

        int[] left = averageOfSubtree(root.left);
        int[] right = averageOfSubtree(root.right);
        int[] temp = new int[]{left[0] + right[0] + root.val, left[1] + right[1] + 1};
        if(temp[0] / temp[1] == root.val){
            count++;
        }
        return temp;

    }
}
