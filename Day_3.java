package Leetcode_30days;

public class Day_3 {
     public static class ListNode {
     int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

    //https://leetcode.com/problems/intersection-of-two-linked-lists/
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

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

    public static void print(ListNode head)
    {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static  void main(String arg[])
    {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);


        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);


        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;
        node6.next=node7;
        node7.next=node4;
        System.out.println("Intersection Point is: "+getIntersectionNode(head,node6).val);

    }
}
