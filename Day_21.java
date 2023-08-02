package Leetcode_30days;
import java.util.*;
public class Day_21 {

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
    public int peakIndexInMountainArray(int[] arr) {
        int s=0,e=arr.length;

        while(s<e){
            int m=s+(e-s)/2;
            if(arr[m]>arr[m+1])
                e=m;
            else
                s=m+1;
        }
        return s;
    }

    public static void inOrder(TreeNode root, ArrayList<Integer> list) {
        if(root == null) return;
        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> a=new ArrayList<>();
        inOrder(root,a);
        return a;
    }
}
