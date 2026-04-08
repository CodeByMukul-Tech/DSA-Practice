package Sqarerootpart2;

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static int sqrt(int A) {
      long s =  1;
      long e = A;
//      int ans = 0 ;
      while(s <=e){

          long mid = s+(e-s)/2;
          if(mid*mid == A)return(int) mid;
          else if(mid*mid >A) e= mid-1;
          else s = mid+1;
      }
      return(int) e ;
    }

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        System.out.println(sqrt(A));

    }
}