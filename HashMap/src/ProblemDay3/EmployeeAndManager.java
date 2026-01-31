package ProblemDay3;

import java.util.*;

class Solutionrt {

    static int getorEmployees(
            String manager,
            Map<String, Integer> ans,
            Map<String, List<String>> managerEp) {

        // no employee under him
        if (!managerEp.containsKey(manager)) {
            ans.put(manager, 0);
            return 1;
        }

        int count = 0;

        for (String emp : managerEp.get(manager)) {
            count += getorEmployees(emp, ans, managerEp);
        }

        ans.put(manager, count);
        return count + 1;
    }

    public void EmpUnderManager(Map<String, String> emp) {

        Map<String, List<String>> managerEp = new HashMap<>();
        String ceo = "";

        for (String key : emp.keySet()) {

            // CEO
            if (key.equals(emp.get(key))) {
                ceo = key;
            } else {
                String manager = emp.get(key);

                managerEp.putIfAbsent(manager, new ArrayList<>());
                managerEp.get(manager).add(key);
            }
        }

        Map<String, Integer> ans = new HashMap<>();

        getorEmployees(ceo, ans, managerEp);

        // print answer
        for (String key : ans.keySet()) {
            System.out.println(key + " -> " + ans.get(key));
        }
    }
}

public class EmployeeAndManager {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<String, String> emp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            emp.put(sc.next(), sc.next());
        }

        Solutionrt obj = new Solutionrt();
        obj.EmpUnderManager(emp);
    }
}
