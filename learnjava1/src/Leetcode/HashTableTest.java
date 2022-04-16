package Leetcode;

import java.util.HashMap;

/**
 * @Classname HashTableTest
 * @Date 2022/4/14 16:50
 * @Created by 李晓阳
 * <p>
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class HashTableTest {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null)
            return false;

        HashMap<ListNode, Boolean> work = new HashMap<>();
        ListNode p = head;
        while (p != null) {
            if(work.containsKey(p)){
                return true;
            }
            work.put(p, true);//put进去的是true，代表着p节点已经被访问过了。
            p = p.next;
        }
        return false;
    }
}
