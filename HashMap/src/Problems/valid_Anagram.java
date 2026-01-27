package Problems;
import java.util.*;

class Solutionr {
    static boolean areAnagram(String c1, String c2) {

        Map<Character,Integer> IaconBase1 = new HashMap<>();
        Map<Character,Integer> IaconBase2 = new HashMap<>();

        for(char c : c1.toCharArray()){
            int value= IaconBase1.getOrDefault(c,0);
            IaconBase1.put(c,value+1);
        }
        for(char c : c2.toCharArray()){
            int value= IaconBase2.getOrDefault(c,0);
            IaconBase2.put(c,value+1);
        }

        for(char c : IaconBase1.keySet()){
            if(!IaconBase2.containsKey(c)) return false;
            else if (IaconBase1.get(c)!=IaconBase2.get(c))return false;
        }

        return  true;
    }
}

public class valid_Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        Solutionr Obj = new Solutionr();

        if (Obj.areAnagram(str1, str2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
