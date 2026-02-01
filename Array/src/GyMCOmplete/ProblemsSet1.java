package GyMCOmplete;

import java.io.*;
import java.util.*;

class ProblemsSet1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr.add(x);
        }

        Solution ob = new Solution();
        System.out.println(ob.candies(arr, n));

    }
}


class Solution {
    public int candies(ArrayList<Integer> A, int n) {
       

    }
}
