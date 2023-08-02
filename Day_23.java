package Leetcode_30days;
import java.util.*;

//Question link
//https://leetcode.com/problems/maximum-running-time-of-n-computers/submissions/
public class Day_23 {
        public long maxRunTime(int n, int[] A) {
            Arrays.sort(A);
            long sum = 0;
            for (int a: A)
                sum += a;
            int k = 0, na = A.length;
            while (A[na - 1 - k] > sum / (n - k))
                sum -= A[na - 1 - k++];
            return sum / (n - k);
        }
}
