package Leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class leet116 {




    public Node connect(Node root) {
        LinkedList<Node> que = new LinkedList<Node>();
        if (root != null)
            que.add(root);
        while (!que.isEmpty()) {
            int size = que.size();
            for (int i = 0; i < size; ++i) {
                Node node = que.remove();
                if(i==size-1)
                    node.right=null;
                else if(i<size-1) {
                    assert que.peek() != null;
                    que.peek().right=que.get(1);
                }
                if (node.left != null)
                    que.add(node.left);
                if (node.right != null)
                    que.add(node.right);
            }
        }
        return root;
    }

}

