package Problems;


import java.io.*;
import java.util.*;

class Solutions {
    public void firstElementToOccurKTimes(int[] nums, int n, int k) {
        Map<Integer, Integer> maps = new HashMap<>();

        for (int i = 0; i < n; i++) {

            int value = maps.getOrDefault(nums[i], 0);
            maps.put(nums[i], value + 1);
            if (maps.get(nums[i]) == k) {
                System.out.println(nums[i]);
              return;

            }

        }
        System.out.println(-1);


    }
}

public class FristOccranceKelements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Solutions Obj = new Solutions();
        Obj.firstElementToOccurKTimes(nums, n, k);
        System.out.println();
    }
}