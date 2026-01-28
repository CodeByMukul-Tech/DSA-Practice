package ProblemDay2;

import java.util.*;

class Solutiong {
    public int givenDifference(int[] A, int n, int B) {
        Set<Integer> sets = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (sets.contains(A[i] + B) || sets.contains(A[i] - B)) {
                return 1;
            }

            sets.add(A[i]);
        }

        return 0;
    }
}

public class Bdifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, B;
        n = sc.nextInt();
        int[] mat = new int[n];
        for (int i = 0; i < n; ++i) {
            mat[i] = sc.nextInt();
        }
        B = sc.nextInt();
        Solutiong Obj = new Solutiong();
        System.out.println(Obj.givenDifference(mat, n, B));
        System.out.println('\n');
    }
}
