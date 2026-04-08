package squareRootnumber;

import java.util.*;
import java.lang.*;

class Main {
    public static void sqrt(int A) {

        long start = 1;
        long end = A;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (mid * mid == A) {
                System.out.println(mid);
                break;

            }

            else if (mid * mid > A) end = mid - 1;
            else start = mid + 1;
        }



    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        sqrt(A);

    }
}