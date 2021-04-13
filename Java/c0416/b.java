package Java.c0416;

import java.util.ArrayList;
import java.util.List;

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

class Solution {
    List<Integer> list = new ArrayList<Integer>();

    public void f(TreeNode root) {
        if (root.left == null && root.right == null) {
            list.add(root.val);
        } else {
            f(root.left);
            f(root.right);
            list.add(root.val);
        }
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        f(root);
        return list;
    }
}

public class b {
    public static void main(String[] args) {
        Solution solution = new Solution();

    }

}
