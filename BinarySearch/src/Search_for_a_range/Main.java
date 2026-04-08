package Search_for_a_range;


import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++)
            arr[i] = sc.nextInt();

        int k = sc.nextInt();

        Accio ob = new Accio();
        ArrayList<Integer> ans = ob.searchRange(arr, k, N);
        for (int x : ans)
            System.out.print(x + " ");

        System.out.println();

    }
}


class Accio {

    public int leftoccur(int[] arr, int target, int n) {
        int s = 0;
        int e = n - 1;
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == target) {
                ans = mid;
                e = mid - 1;
            } else if (arr[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }

    public int rightoccur(int[] arr, int target, int n) {
        int s = 0;
        int e = n - 1;
        int ans = -1;


        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == target) {
                ans = mid;
                s = mid + 1;
            } else if (arr[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }


    public ArrayList<Integer> searchRange(int[] arr, int target, int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(leftoccur(arr, target, n));
        ans.add(rightoccur(arr, target, n));

        return ans;
    }
}
