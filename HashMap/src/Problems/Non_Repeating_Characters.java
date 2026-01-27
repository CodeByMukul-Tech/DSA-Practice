package Problems;


import java.io.*;
import java.util.*;

class Solutionw {
    public void nonRepeatingCharacter(String s) {
       int[] arr = new int[26];
       for(int i= 0 ; i< s.length();i++){
           arr[s.charAt(i)-'a']++;
       }
       for(int i = 0 ; i < s.length() ;i++){
           if(arr[s.charAt(i)] == 1){
               System.out.println(s.charAt(i));
           }
       }

        System.out.println(-1);
    }
}

public class Non_Repeating_Characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        s = sc.next();
        Solutionw Obj = new Solutionw();
        Obj.nonRepeatingCharacter(s);
        System.out.println();
    }
}