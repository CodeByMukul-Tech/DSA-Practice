package Problem;

import java.io.*;
import java.lang.*;

class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z;
    }
}

class Mainu {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String inputLine[] = br.readLine().trim().split(" ");

        int n = Integer.parseInt(inputLine[0]);
        Job[] arr = new Job[n];
        inputLine = br.readLine().trim().split(" ");

        //adding id, deadline, profit
        for(int i=0, k=0; i<n; i++){
            arr[i] = new Job(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
        }

        Solution ob = new Solution();

        //function call
        int[] res = ob.solve(arr, n);
        System.out.println (res[0] + " " + res[1]);

    }
}

class Solution
{

    int[] solve(Job arr[], int n)
    {
        // Your code here

    }
}
