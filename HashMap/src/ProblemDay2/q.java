package ProblemDay2;


import java.io.*;
import java.util.*;

class Solution {
    public int maxLen(int arr[]) {
        
    }
}

class Largest_Subarray_with_0_Sum {

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Solution Obj = new Solution();
        System.out.println(Obj.maxLen(nums));
    }
}
