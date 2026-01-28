package ProblemDay3;


import java.io.*;
        import java.util.*;

class Solution8 {
    public int findElement(int[] arr, int n) {



        return -1;
    }
}

public class FindTheHingedElement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution8 Obj = new Solution8();
        System.out.println(Obj.findElement(nums, n));
    }
}