package Leetcode_30days;

public class Day_4 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {


        ListNode t=headA;
        while(t!=null)
        {
            ListNode p=headB;
            while(p!=null)
            {
                if(t==p)
                    return t;
                p=p.next;
            }
            t=t.next;
        }
        return null;
    }


      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }

    class Solution {
        public int minDepth(TreeNode root) {
            if (root == null)
                return 0;
            if (root.left == null && root.right == null)
                return 1;
            if (root.left == null)
                return 1 + minDepth(root.right);
            if (root.right == null)
                return 1 + minDepth(root.left);
            return 1 + Math.min(minDepth(root.left), minDepth(root.right));
        }
    }
}
