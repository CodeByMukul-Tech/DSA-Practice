package Problemset4;

import java.util.*;

class Solution {
    static void findRepeatingAndMissingNumbers(int[] arr) {
        int[] ans = new int[2];
        int n = arr.length;

        int[] frequency = new int[n + 1];

        for (int i = 0; i < n; i++) {
            frequency[arr[i]]++;
        }


        for (int i = 1; i <= n; i++) {
            if (frequency[i] > 1) {
                ans[0] = i;
            }
            if (frequency[i] == 0) {
                ans[1] = i;
            }

        }

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

    }
}

public class RollNumber {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        Solution.findRepeatingAndMissingNumbers(nums);
        // System.out.print(ans[0] + " " + ans[1] + "\n");
    }
}