package leetcodedaily;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Findlnode {
    public static void main(String[] args) {
        //create binary tree of level 4
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(3);
        TreeNode right = new TreeNode(2);
        root.left = left;
        root.right = right;
        left = new TreeNode(5);
        right = new TreeNode(3);
        root.left.left = left;
        root.left.right = right;
        left = new TreeNode(9);
        root.right.right = left;
        System.out.println(root);

        //find largest value in each row
        Findlnode obj = new Findlnode();
        List<Integer> result = obj.largestValues(root);
        System.out.println(result);


    }

    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                max = Math.max(max, node.val);

                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }

            result.add(max);
        }

        return result;
    }

    //  1
    // 3 2
    //5 3 9

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
