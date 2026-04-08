package SortedandRotatedArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
class Solution {
    public int search(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] == target) {
                return mid;
            }

            if (nums[s] <= nums[mid]) {
                if (target >= nums[s] && target < nums[mid]) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[e]) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }
        return -1;
    }
}
*/

class Solution {
    public int search(int[] nums, int target) {
        List s=new ArrayList();
        for(int i:nums)s.add(i);
        return s.indexOf(target);
    }
}
class p {
    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(s.search(nums, target));
    }
}