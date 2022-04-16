package Leetcode;

import java.util.*;

public class QueueTest {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        if (root != null)
            que.add(root);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        while (!que.isEmpty()) {
            int size = que.size();
            List<Integer> vec = new ArrayList<Integer>();
            for (int i = 0; i < size; ++i) {
                TreeNode node = que.peek();
                que.remove();
                assert node != null;
                vec.add(node.val);
                if (node.left != null)
                    que.add(node.left);
                if (node.right != null)
                    que.add(node.right);
            }
            result.add(vec);
            Collections.reverse(result);
        }
        return result;
    }
}
