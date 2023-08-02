package Leetcode_30days;
import java.util.*;
public class Day_29 {

    public static List<List<Integer>> combine(int n[]) {
        List<List<Integer>> p= new ArrayList<>();
        p.add(new ArrayList<>());//[]
        for(int x: n)
        {
             int n1=p.size();
            for(int i=0;i<n1;i++)
            {
                List<Integer> t =new ArrayList<>(p.get(i));
                        t.add(x);
                p.add(t);
            }
        }
        for(int i=0;i<p.size();i++)
            System.out.println(p.get(i));
        return p;
    }


    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        getSubsets(0, new ArrayList<>(), ans, nums);
        return ans;
    }
    public void getSubsets(int idx, List<Integer> ds, List<List<Integer>> ans, int[] a){
        if (idx==a.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        // picking
        ds.add(a[idx]);
        getSubsets(idx+1, ds, ans, a);
        ds.remove(ds.size()-1);

        // not picking
        getSubsets(idx+1, ds, ans, a);
    }

    public static  void  main(String arg[])
    {
        int[] x= {1,2,3};
        combine(x);

    }

}
