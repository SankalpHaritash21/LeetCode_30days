package Leetcode_30days;
import java.util.*;
public class Day_28 {
    public int thirdMax(int[] nums) {
        long max = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;

        for (int num:nums){
            if (num> max){
                thirdMax = secondMax;
                secondMax = max;
                max = num;
            } else if (num>secondMax && num<max) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (num>thirdMax && num<secondMax) {
                thirdMax = num;
            }
        }
        int result = (thirdMax==Long.MIN_VALUE) ? (int)max : (int)thirdMax;
        return result;
    }

    int ans = Integer.MAX_VALUE;

    void helper(int[] cookies, int start, int k, int[] temp) {
        if (start == cookies.length) {
            int max = 0;
            for (int c : temp)
                max = Math.max(max, c);
            ans = Math.min(ans, max);
            return;
        }
        for (int i = 0; i < k; i++) {
            temp[i] += cookies[start];
            helper(cookies, start + 1, k, temp);
            temp[i] -= cookies[start];
        }
    }

    public int distributeCookies(int[] cookies, int k) {
        helper(cookies, 0, k, new int[k]);
        return ans;
    }
}
