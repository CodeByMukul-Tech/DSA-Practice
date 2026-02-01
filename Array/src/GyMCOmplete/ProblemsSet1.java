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
        int[] as = new int[n];
        for (int i = 0; i < n; i++) {
            as[i] = A.get(i);
        }

        int[] leftCandy = new int[n];
        int[] rightCandy = new int[n];
        Arrays.fill(leftCandy, 1);
        Arrays.fill(rightCandy, 1);

//        left

        for (int i = 1; i < n; i++) {
            if (as[i] > as[i - 1]) {
                leftCandy[i] = leftCandy[i - 1] + 1;
            }
        }

//        right

            for(int i = n-2 ; i>=0 ; i--){
                if(as[i]> as[i+1]){
                    rightCandy[i] = rightCandy[i+1] + 1;
                }
            }


            int ans = 0 ;
            for(int i = 0 ; i < n ; i++){
                ans+=Math.max(leftCandy[i],rightCandy[i]);
            }


            return ans ;
    }
}
