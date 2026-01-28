package ProblemDay3;

import java.util.*;

public class EquilibriumIndex {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = Solution.findEquilibriumIndex(a);
        System.out.println(ans);
    }
}

class Solution {
    static int findEquilibriumIndex(int[] a) {
      int rightsum = 0 ;
      int leftsum =0;
      int totalsum = 0 ;
      for(int i : a){
          totalsum+=i;
      }

      for(int i = 0 ; i< a.length ; i++){
          rightsum = totalsum - leftsum - a[i];
          if(rightsum == leftsum){
              return i;
          }

          leftsum +=a[i];
      }

      return -1;
    }
}