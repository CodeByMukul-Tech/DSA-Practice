package SubarrayWithZeroSum;

import java.io.*;
import java.util.*;

class Solution {
    static String solve(int N, int[] Arr) {
        int p = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            p += Arr[i];
            if (map.containsKey(p)) {
                return "Yes";
            } else {
                map.put(p, i);
            }
        }
        return "No";

    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine().trim());
        String[] arr_Arr = br.readLine().split(" ");
        int[] Arr = new int[N];
        for (int i_Arr = 0; i_Arr < arr_Arr.length; i_Arr++) {
            Arr[i_Arr] = Integer.parseInt(arr_Arr[i_Arr]);
        }

        String out_ = Solution.solve(N, Arr);
        System.out.println(out_);

        wr.close();
        br.close();
    }

}
