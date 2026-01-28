package ProblemDay2;

import java.io.*;
import java.util.*;

class Solutionw {
    public boolean arrayPairs(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            int rem = num % k;
            if (rem < 0) rem += k;
            map.put(rem, map.getOrDefault(rem, 0) + 1); // agar numebr se solve nhi kar pa rha
            // hai toh hm use kara ga remainder pa count kara vo
            // easy hai beacuse the remainder map se question length deceasse kar rhi hai  ...

        }

        for (int key : map.keySet()) {

            if (key == 0) {
                if (map.get(key) % 2 != 0) {
                    return false;
                }
            } else if (2 * key == k) {
                if (map.get(key) % 2 != 0) {
                    return false;
                }
            } else {
                int rem = map.get(key);
                int rem2 = map.getOrDefault(k - key, 0);

                if (rem != rem2) {
                    return false;
                }
            }

        }

        return true;


    }
}

public class ArrayPairsDivisibleByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solutionw Obj = new Solutionw();
        if (Obj.arrayPairs(arr, k)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}