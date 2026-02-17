package Problemset4;

// A Java program to print all anagrams together
import java.util.*;

public class GroupOfAnagrams {
    // Given a list of words in wordArr[],
    static void printAnagramsTogether(String wordArr[], int size) {
        //your code here
    }

    // Driver program to test above functions
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] wordArr = new String[n];
        for (int i = 0; i < n; i++)
            wordArr[i] = sc.next();
        sc.close();
        printAnagramsTogether(wordArr, n);
    }
}