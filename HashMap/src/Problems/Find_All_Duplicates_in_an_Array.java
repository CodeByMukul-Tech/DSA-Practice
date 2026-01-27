package Problems;

import java.util.*;

class Solutiont {
    public void allDuplicates(int n, int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int k : arr) {
            map.put(k, map.getOrDefault(k, 0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for (int k : map.keySet()) {
            if (map.get(k) >= 2) {
                for (int i = 1; i < map.get(k); i++) {
                    list.add(k);
                }
            }


        }
        if (list.size() == 0) {
            System.out.println(-1);
        } else {

            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }


    }

}

public class Find_All_Duplicates_in_an_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solutiont Obj = new Solutiont();
        Obj.allDuplicates(n, arr);
        sc.close();
    }

}
