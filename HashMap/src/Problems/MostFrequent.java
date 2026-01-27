package Problems;

import java.io.*;
import java.util.*;

class Solutioni {
    public void mostFrequent(String[] arr, int n) {
        Map<String , Integer> map = new HashMap<>();
        int check = 0 ;
        String keys = "";



        for(int i = 0 ; i< n ; i++){
            map.put(arr[i] ,map.getOrDefault(arr[i],0)+1);
           if(map.get(arr[i]) >= check ){
               check = map.get(arr[i]);
               keys = arr[i];
           }

        }
        if(keys == arr[0]){
            System.out.println(arr[n-1]);
        }
        else{
            System.out.println(keys);
        }
    }
}

public class MostFrequent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = sc.next();
        }
        Solutioni Obj = new Solutioni();
        Obj.mostFrequent(arr, n);
        System.out.println('\n');
    }
}
