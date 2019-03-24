package easy.e0637averageoflevelsinbinarytree;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<Long[]> records;

    public List<Double> averageOfLevels(TreeNode root) {
        records = new ArrayList<>();

        helper(root, records, 0);

        int size = records.size();
        List<Double> rtn = new ArrayList<>(size);
        for (Long[] record : records) {
            long sum = record[0];
            long count = record[1];
            rtn.add(sum * 1.0 / count);
        }

        return rtn;
    }

    private void helper(TreeNode node, List<Long[]> records, int level) {
        if (node == null) {
            return;
        }
        int size = records.size();
        if (size <= level) {
            Long[] record = new Long[2];
            record[0] = (long)node.val;
            record[1] = (long)1;
            records.add(record);
        } else {
            Long[] record = records.get(level);
            record[0] += node.val;
            record[1]++;
        }
        helper(node.left, records, level + 1);
        helper(node.right, records, level + 1);


    }
}
