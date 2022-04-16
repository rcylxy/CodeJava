package Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrder {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> work = new Stack<TreeNode>();
        if (root == null)
            return result;
        work.push(root);
        while (!work.isEmpty()) {
            TreeNode node = work.peek();
            result.add(work.pop().val);
            if (root.right != null) {
                work.push(root.right);
            }
            if (root.left != null) {
                work.push(root.right);
            }
        }
        return result;
    }
}
