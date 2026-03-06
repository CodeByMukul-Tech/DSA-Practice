package MinimizeTheDifference;

import java.util.*;

class Solution {
    static int minimizeIt(int[] a, int K) {

        Arrays.sort(a);

        int ans = a[a.length-1] - a[0];

        int small = a[0] + K;
        int big = a[a.length-1] - K;

        if(small > big){
            int temp = small;
            small = big;
            big = temp;
        }

        for(int i = 1; i < a.length-1; i++){

            int add = a[i] + K;
            int subtract = a[i] - K;

            if(subtract < 0)
                continue;

            if(subtract >= small || add <= big)
                continue;

            if(big - subtract <= add - small)
                small = subtract;
            else
                big = add;
        }

        ans = Math.min(ans, big - small);

        return ans;
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] A = new int[n];

        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }

        int ans = Solution.minimizeIt(A,k);
        System.out.println(ans);
    }
}