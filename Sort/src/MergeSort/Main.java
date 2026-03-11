package MergeSort;
/*
* THis is code divide frist into smaller parts
* jab tak vo ek ek element ma nhi ata tabh tak cut karta raho
* merge karo
*
* base on divide and conquer technique
*
* step - 1 find mid = l+r/2 ;
* Step - 2 mergesort(arr , l , mid ) divide kara ga in left half
* step - 3 mergeSort(arr,mid+1 , r) divide karage in right half ma ;
* method call further merege(arr, l , mid , r); for merge the call ;
*
* */
import java.util.*;
import java.io.*;

class Solution {

    public static void merge(int[] arr , int low , int mid , int high){
        int  i = low;
        int j = mid+1;
        ArrayList<Integer> list = new ArrayList<>();
        while (i<=mid && j<= high){
            if(arr[i]<arr[j]){
                list.add(arr[i]);
                i++;
            }
            else{
                list.add(arr[j]);
                j++;
            }
        }

        while(i<=mid){
            list.add(arr[i]);
            i++;
        }
        while(j<= high){
            list.add(arr[j]);
            j++;

        }

        for(int k = low ; k <= high ;k++){
            arr[k] = list.get(k-low);
        }
    }
    static void mergeSort(int[] arr,int l,int r){
        if(l>=r) return;
       int mid = l+(r-l)/2;
       mergeSort(arr,l,mid);
       mergeSort(arr,mid+1,r);
       merge(arr,l,mid,r);
    }
}
public class Main {
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] a=new int[n];
        for(int i= 0; i < n; i++)
            a[i] = input.nextInt();
        Solution Obj = new Solution();
        Obj.mergeSort(a,0,n-1);
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}