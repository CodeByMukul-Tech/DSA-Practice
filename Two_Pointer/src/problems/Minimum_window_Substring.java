package problems;

import java.io.*;
import java.util.*;

class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length()) {
            return "";
        }

        Map<Character, Integer> mapt = new HashMap<>();
        for (char c : t.toCharArray()) {
            mapt.put(c, mapt.getOrDefault(c, 0) + 1);
        }

        int required = mapt.size();
        int formed = 0;

        Map<Character, Integer> maps = new HashMap<>();
        int left = 0;
        int right = 0;
        int minLen = Integer.MAX_VALUE;
//        int count = t.length();
        int start = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            maps.put(c, maps.getOrDefault(c, 0) + 1);

            if (mapt.containsKey(c) && maps.get(c).intValue() == mapt.get(c).intValue()) {
                formed++;
            }

            while (left <= right && formed == required) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;

                }
                char c1 = s.charAt(left);
                maps.put(c1, maps.get(c1) - 1);
                if (mapt.containsKey(c1) && maps.get(c1) < mapt.get(c1)) {
                    formed--;
                }

                left++;
            }

            right++;


        }
        return minLen == Integer.MAX_VALUE ? ""
                : s.substring(start, start + minLen);

    }
}

public class Minimum_window_Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s, t;
        s = sc.next();
        t = sc.next();
        Solution Obj = new Solution();
        System.out.print(Obj.minWindow(s, t));
    }
}