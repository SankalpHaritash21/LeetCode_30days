package Leetcode_30days;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Day_24 {
    public boolean PredictTheWinner(int[] nums) {
        if(nums.length == 1) return true;
        int su = 0;
        for (int i: nums) su += i;
        int res = ans(nums, 0, nums.length - 1);
        if (res < (su - res)) return false;
        return true;
    }
    public static int ans(int[] nums, int left, int right) {
        if (left > right) return 0;
        int choice1 = nums[left] + Math.min(ans(nums, left + 2, right), ans(nums, left + 1, right - 1));
        int choice2 = nums[right] + Math.min(ans(nums, left + 1, right - 1), ans(nums, left, right - 2));
        return Math.max(choice1, choice2);
    }


        public static void main (String[] args)throws IOException
        {

// 		Scanner in = new Scanner(System.in);

// 		int t = in.nextInt();
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

            //testcases
            int t = Integer.parseInt(read.readLine());

            while(t-- >0)
            {
                //size of array
                int n = Integer.parseInt(read.readLine());
                long[] arr= new long[n];

                String str[] = read.readLine().trim().split(" ");

                //adding elements to the array
                for(int i=0;i<n;i++)
                    arr[i] = Long.parseLong(str[i]);

                // StringBuffer sb = new StringBuffer();

                Day_24 ob = new Day_24();

                //calling rearrange() function
                ob.rearrange(arr, n);
                StringBuffer sb = new StringBuffer();

                //appending and printing the elements
                for(int i =0; i < n; i++)
                    sb.append(arr[i] + " ");
                System.out.println(sb);
            }
        }

// } Driver Code Ends

        // temp: input array
        // n: size of array
        //Function to rearrange  the array elements alternately.
        public static void rearrange(long arr[], int n){

            int s= 0;
            int e = n-1;
            int maxPlusOne = (int) arr[e] + 1;

            for (int i = 0; i < n; i++) {

                if (i%2 == 0) {
                    arr[i] += (arr[e] % maxPlusOne) * maxPlusOne;
                    e--;
                } else if (i%2 != 0) {
                    arr[i] += (arr[s] % maxPlusOne) * maxPlusOne;
                    s++;
                }
            }

            for (int i =0; i< n; i++) {
                arr[i] = arr[i] / maxPlusOne;
            }

        }

    }

