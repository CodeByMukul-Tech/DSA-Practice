package TargetSum;

import java.util.*;

public class Main {
    public static ArrayList<ArrayList<Integer>> findSubsets(int[] arr, int tar) {
     ArrayList <ArrayList<Integer>> ans = new ArrayList<>();
     ArrayList<Integer> curr = new ArrayList<>();
     int n = arr.length;
     return Solver(arr,0,ans,tar,n,curr);

    }

    public static ArrayList<ArrayList<Integer>> Solver(int[] arr,int idx,ArrayList<ArrayList<Integer>> ans,int tar,int n ,ArrayList<Integer> curr){
        if (tar == 0) {
            ans.add(new ArrayList<>(curr));
            return ans;
        }

        if (idx == n) {
            return ans ;
        }
        curr.add(arr[idx]);
        Solver(arr,idx+1 ,ans,tar-arr[idx],n ,curr);
        curr.remove(curr.size()-1);
        Solver(arr,idx+1 ,ans , tar,n,curr);


        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, tar;
        n = sc.nextInt();
        tar = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        ArrayList<ArrayList<Integer>> subsets = findSubsets(arr, tar);
        Collections.sort(subsets, new Comparator<ArrayList<Integer>>() {
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                return o1.get(0).compareTo(o2.get(0));
            }
        });
        if (subsets.isEmpty()) {
            System.out.println(-1);
        } else {
            for (int i = 0; i < subsets.size(); i++) {
                for (int j = 0; j < subsets.get(i).size(); j++)
                    System.out.print(subsets.get(i).get(j) + " ");
                System.out.println();
            }
        }
        sc.close();
    }
}