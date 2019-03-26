package easy.e0690employeeimportance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> map = new HashMap<>();
        for (Employee e : employees) {
            map.put(e.id, e);
        }
        return dfs(map, id);
    }

    private int dfs(Map<Integer, Employee> map, int id) {
        Employee e = map.get(id);
        int ans = e.importance;
        for (int subId : e.subordinates) {
            ans += dfs(map, subId);
        }
        return ans;
    }

}

class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    int id;
    // the importance value of this employee
    int importance;
    // the id of direct subordinates
    List<Integer> subordinates;

    Employee(int id, int importance) {
        this.id = id;
        this.importance = importance;
    }


    private static Employee getEmployee(int id, int importance, int[] sub) {
        Employee e = new Employee(id, importance);
        List<Integer> subordinates = new ArrayList<>();
        if (sub != null) {
            for (int s : sub) {
                subordinates.add(s);
            }
        }
        e.subordinates = subordinates;
        return e;
    }

    static List<Employee> construct(int[] ids, int[] imps, int[][] subs) {

        int idsLen = ids.length;
        List<Employee> ret = new ArrayList<>(idsLen);

        for (int i = 0; i < idsLen; i++) {
            Employee e = getEmployee(ids[i], imps[i], subs[i]);
            ret.add(e);
        }
        return ret;
    }

}
