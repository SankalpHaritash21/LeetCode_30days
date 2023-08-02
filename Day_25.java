package Leetcode_30days;
import java.util.*;
public class Day_25 {

    //https://leetcode.com/problems/unique-number-of-occurrences/
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> x=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            x.put(arr[i], x.getOrDefault(arr[i], 0) + 1);
        }
        HashSet<Integer> y=new HashSet<>();
        for(int z:x.values())
        {
            if(y.contains(z))
                return false;

            y.add(z);
        }
        return true;
    }

    public static void main(String arg[])
    {
        int a[]={3,5,-2,-3,-6,-6};
        System.out.println(uniqueOccurrences(a));
    }


}
