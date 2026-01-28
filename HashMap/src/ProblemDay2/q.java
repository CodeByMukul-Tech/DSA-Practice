package ProblemDay2;


import java.io.*;
import java.util.*;

class Solutionj {
    public int maxLen(int arr[])
    {
        Map<Integer ,Integer > map = new HashMap<>();
        int sum = 0 ;
        int maxlen = 0 ;
        for(int i = 0 ; i< arr.length ;i++){
            System.out.println( "Arr"+arr[i]  +" "+i);
            sum+=arr[i];
            System.out.println("Sum "+sum+" "+i);


            if(sum == 0){
                System.out.println("Sum "+sum+" "+i);

                maxlen = i+1;
                System.out.println("MaxLen "+maxlen+" "+ i);
            }
            else if(map.containsKey(sum)){
                int k = map.get(sum);
                System.out.println("K "+sum+" "+i);
                maxlen = Math.max(maxlen , i - k);
                System.out.println("Last max len "+maxlen+" "+i);


            }
            else{
                map.put(sum , i);
                System.out.println( "Last else "+sum +" "+i );
            }
        }

        return maxlen;
    }
}

class Largest_Subarray_with_0_Sum {

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Solutionj Obj = new Solutionj();
        System.out.println(Obj.maxLen(nums));
    }
}
