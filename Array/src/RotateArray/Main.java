package RotateArray;

import java.util.Scanner;

public class Main {

    public static void rotete(int[]arr ){
        int temp = arr[arr.length-1];
        for(int i = arr.length-1 ; i >= 1 ;i--){
            arr[i] = arr[i-1];
        }
        arr[0]= temp;
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i< n ; i++){
            arr[i] = input.nextInt();
        }
        for(int i = 0 ;i<count ;i++){
            rotete(arr);
        }



        for(int i = 0 ; i< n ; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
