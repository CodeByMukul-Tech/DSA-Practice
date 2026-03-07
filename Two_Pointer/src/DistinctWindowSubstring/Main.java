package DistinctWindowSubstring;

import java.util.*;

public class Main {

    public static long DistinctCharacterSubstring(String s){
        long count = 0 ;
        int left =  0 ;
        Set<Character > set = new HashSet<>();
        for(int right  = 0 ;right<s.length() ;right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            count+=(right -left +1);
        }

        return  count;
    } // doesn't mean ki tum set ma rakho means ya hai ki set ma add karao jb value
//    set ma vapas dikha toh use remove karo left se or left ko ++ karo jisa right side
//    character ka se sabi duplicate nikal jaya ...

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        long ans = DistinctCharacterSubstring(s);
        System.out.println(ans);
    }
}
