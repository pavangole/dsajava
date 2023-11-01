package leetcodedaily;

import java.util.ArrayList;
import java.util.HashMap;

public interface FindmodeinBST {
    static HashMap<Integer, Integer> map = new HashMap<>();
    public static void main(String args[]) {
        //create binary tree of [1,null,2,2]
        TreeNode root = new TreeNode(1);
        // TreeNode right = new TreeNode(2);
        // root.right = right;
        // right = new TreeNode(2);
        // root.right.left = right;

        //find the elemtn having maximum frequency
        findMode(root);
        int max = Integer.MIN_VALUE;
        for(int key : map.keySet()) {
            max = Math.max(max, map.get(key));
        }
        // put all the elements having maximum frequency in an ArrayList

        ArrayList<Integer> result = new ArrayList<>();
        for(int key : map.keySet()) {
            if(map.get(key) == max) {
                result.add(key);
            }
        }
       
        //convert ArrayList to int[]
        int[] arr = new int[result.size()];
        for(int i = 0; i < result.size(); i++) {
            arr[i] = result.get(i);
        }

        
    }

    //Find Mode in Binary Search Tree
    static void findMode (TreeNode root) {
        if(root == null) return;
        findMode(root.left);
        if(map.containsKey(root.val)) {
            map.put(root.val, map.get(root.val) + 1);
        } else {
            map.put(root.val, 1);
        }
        findMode(root.right);

    }
}
