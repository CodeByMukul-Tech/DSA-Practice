package Problesm;

import java.util.*;

class MinnimumCakes {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int t=sc.nextInt();
            while(t>0){
                int n=sc.nextInt();
                int []A=new int[n];
                int m=sc.nextInt();
                int k=sc.nextInt();
                for(int i=0;i<n;i++){
                    A[i]=sc.nextInt();
                }
                Solution ob =new Solution();
                int ans = ob.minDays(A,n,m,k);
                System.out.println(ans);
                t--;
            }
        }
    }

}
class Solution {


    public boolean checkes(int[]A , int m , int k , int day ){
        int count = 0 , caks = 0 ;
        for(int x : A){
            if(x <=day){
                count++;
                if(count == k){
                    caks++;
                    count= 0 ;
                }

            } else{
                count  = 0 ;
            }

        }

        return caks>= m;
    }

    public int minDays(int[] bloomDay,int n, int m, int k) {
        if ((long) m *k > n) return -1;
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for(int i = 0 ; i <n ;i++){
            low = Math.min(low,bloomDay[i]);
            high = Math.max(high,bloomDay[i]);
        }

        int ans = -1 ;

        while(low<=high){
            int mid = low+(high-low)/2;
            if(checkes(bloomDay,m,k,mid )){
                ans = mid ;
                high = mid -1;
            }
            else{
                low = mid +1;
            }
        }

        return ans ;


    }
}