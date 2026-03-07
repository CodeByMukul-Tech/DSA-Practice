package MaxiumumOnes;

import java.util.*;

class Accio {
    public int longestOnes(int[] arr, int b) {
        int max = 0;
        int n = arr.length;
        int left = 0;
        int zerocount = 0;
        for (int right = 0; right < n; right++) {
            if (arr[right] == 0) {
                zerocount++;

            }
            while (zerocount > b) {
                if (arr[left] == 0) {
                    zerocount--;
                }
                left++;

            }
            max = Math.max(max, right - left + 1);
        }

        return max;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++)
            A[i] = sc.nextInt();
        int B = sc.nextInt();
        Accio Obj = new Accio();
        System.out.println(Obj.longestOnes(A, B));
    }
}