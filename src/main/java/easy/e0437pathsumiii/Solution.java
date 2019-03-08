package easy.e0437pathsumiii;

import common.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int pathSum(TreeNode root, int sum) {

        count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        dfs(root, 0, sum, map);

        return count;
    }

    private int count;

    private void dfs(TreeNode node, int currSum, int sum, Map<Integer, Integer> map) {
        if (node == null) {
            return;
        }
        currSum += node.val;
        if (map.containsKey(currSum - sum)) {
            count += map.get(currSum - sum);
        }

        if (map.containsKey(currSum)) {
            map.put(currSum, map.get(currSum) + 1);
        } else {
            map.put(currSum, 1);
        }

        dfs(node.left, currSum, sum, map);
        dfs(node.right, currSum, sum, map);

        map.put(currSum, map.get(currSum) - 1);


    }
}
