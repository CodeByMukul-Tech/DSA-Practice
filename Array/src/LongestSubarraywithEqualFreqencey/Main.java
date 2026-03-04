package LongestSubarraywithEqualFreqencey;


import java.util.*;


class Solution {
    public static int longestSubarray(int[] arr) {
        int max = 0;
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        Map<String, Integer> map = new HashMap<>();
        map.put("0#0", -1);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) count0++;
            if (arr[i] == 1) count1++;
            if (arr[i] == 2) count2++;

            int d1 = count1 - count0;
            int d2 = count2 - count1;

            String key = d1 + "#" + d2;

            if (map.containsKey(key)) {
                int k = i - map.get(key);
                max = Math.max(max, k);

            } else {
                map.put(key, i);
            }
        }

        return max;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        Solution Obj = new Solution();
        System.out.println(Obj.longestSubarray(arr));
    }
}
