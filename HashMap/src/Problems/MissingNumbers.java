package Problems;

import java.util.*;

class Solutione {
    static void missingNumbers(int n, int arr[], int m, int brr[]) {
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < n; i++){
            int value = map1.getOrDefault(arr[i],0);
            map1.put(arr[i] ,value+1);
        }
        for (int i = 0; i < m; i++){
            int value = map1.getOrDefault(brr[i],0);
            map1.put(brr[i] ,value+1);
        }

        List<Integer> list = new ArrayList<>();
        for(int key : map2.keySet()){
            if(!map1.containsKey(key)) list.add(key);
            else if(map1.get(key )!=map2.get(key))list.add(key);
        }

        if(list.size()==0){
            System.out.println(-1);
        }
        else{
            Collections.sort(list);
            for(int i = 0 ; i< list.size() ; i++){
                System.out.println(list.get(i));
            }
        }
    }

}

public class MissingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int brr[] = new int[m];
        for (int i = 0; i < m; i++) {
            brr[i] = sc.nextInt();
        }

        Solutione Obj = new Solutione();
        Obj.missingNumbers(n, arr, m, brr);
    }
}