package common;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Util {
    /***************************List Node************************************/
    public static ListNode constructListNode(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return null;
        } else if (n == 1) {
            return new ListNode(nums[0]);
        }

        ListNode start = new ListNode(nums[0]);
        ListNode tmp = new ListNode(nums[1]);
        start.next = tmp;
        ListNode current = tmp;
        for (int i = 2; i < n; i++) {
            tmp = new ListNode(nums[i]);
            current.next = tmp;
            current = tmp;

        }
        return start;
    }


//    public static ListNode constructListNode(int[] nums, int[] nextIdx) {
//        int numsLen = nums.length;
//        if (numsLen == 0) {
//            return null;
//        }
//        if (numsLen == 1) {
//            return new ListNode(nums[0]);
//        }
//        int nextIdxLen = nextIdx.length;
//        if (nextIdxLen < numsLen) {
//            return null;
//        }
//
//        ListNode start = new ListNode(nums[0]);
//        ListNode pre = start;
//        int childIdx = nextIdx[0];
//
//        int count = 0;
//        while (childIdx != TreeNode.IMPOSSIBLE_VALUE && count < numsLen) {
//            ListNode node = contains(start, nums[childIdx]);
//            if (node == null) {
//
//                node = new ListNode(nums[childIdx]);
//            }
//
//            pre.next = node;
//            pre = pre.next;
//            childIdx = nextIdx[childIdx];
//            count++;
//        }
//
//        return start;
//    }

    public static List<Integer> unConstructListNode(ListNode node) {

        return unConstructListNode(node, false);
    }

    public static List<Integer> unConstructListNode(ListNode node, boolean hasCycle) {
        if (!hasCycle) {
            List<Integer> ret = new ArrayList<>();
            if (node == null) {
                return ret;
            }
            while (node != null) {
                ret.add(node.val);
                node = node.next;
            }
            return ret;
        } else {
            ListNode newNode = breakCycle(node);
            return unConstructListNode(newNode, false);
        }
    }

    private static ListNode breakCycle(ListNode node) {
        ListNode slow = node;
        ListNode fast = slow;


        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break;
            }
        }

        ListNode p = slow;
        while (p.next != slow) {
            p = p.next;
        }
        p.next = null;
        return slow;
    }

    private static ListNode contains(ListNode start, int value) {
        if (start == null) {
            return null;
        }
        ListNode p = start;
        while (p != null && p.val != value) {
            p = p.next;
        }
        return p;
    }

    /***************************TreeNode************************************/

//    static List<Integer> getTreeNodeValueList(TreeNode root) {
//        Queue<TreeNode> q = new LinkedList<>();
//        List<Integer> valList = new ArrayList<>();
//
//        q.add(root);
//        while (!q.isEmpty()) {
//            TreeNode node = q.poll();
//            if (node != null) {
//                valList.add(node.val);
//                TreeNode left = node.left;
//                TreeNode right = node.right;
//
//                if (left != null || right != null) {
//                    q.add(left);
//                    q.add(right);
//                }
//
//            }
//
//        }
//        return valList;
//    }
//
//    public static int[] unconstructTreeNode(TreeNode root) {
//        List<Integer> valList = TreeNode.getTreeNodeValueList(root);
//        int valListLen = valList.size();
//        int[] valArray = new int[valListLen];
//        for (int i = 0; i < valListLen; i++) {
//            valArray[i] = valList.get(i);
//        }
//        return valArray;
//    }
    public static List<Integer> unconstructTreeNodeList(TreeNode root) {
        if (root == null) {
            return null;
        }
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> rtn = new ArrayList<>();

        q.add(root);

        while (!q.isEmpty()) {
            TreeNode n = q.poll();
            if (n == null) {
                rtn.add(null);
            } else {
                rtn.add(n.val);
                q.add(n.left);
                q.add(n.right);
            }
        }

        int rtnLen = rtn.size();
        int i = rtnLen - 1;
        int count = 0;
        while (rtn.get(i) == null) {
            count++;
            i--;
        }
        rtn = rtn.subList(0, rtnLen - count);
        return rtn;
    }

    /***************************NormalTreeNode************************************/
    public static TreeNode constructTreeNode(Integer[] nodes) {
        int nodesLen = nodes.length;
        if (nodesLen == 0) {
            return null;
        }
        TreeNode root = new TreeNode(nodes[0]);

        Queue<TreeNode> parent = new LinkedList<>();
        parent.add(root);
        for (int i = 1; i < nodesLen; i++) {
            TreeNode c = null;
            if (i % 2 != 0) {
                if (nodes[i] != null) {
                    c = new TreeNode(nodes[i]);
                    parent.add(c);
                    TreeNode t = parent.peek();
                    t.left = c;
                }
            } else {
                if (nodes[i] != null) {
                    c = new TreeNode(nodes[i]);
                    parent.add(c);
                    TreeNode t = parent.poll();
                    t.right = c;
                } else {
                    parent.poll();
                }
            }


        }

        return root;
    }

//    public static TreeNode constructTreeNode(int[] nodes, int[] parentIdxs, int[] childrenPosition) {
//        int nodesLen = nodes.length;
//        if (nodesLen == 0) {
//            return null;
//        }
//        TreeNode root = new TreeNode(nodes[0]);
//        for (int i = 1; i < nodesLen; i++) {
//            TreeNode node = findParentNode(root, nodes, parentIdxs, childrenPosition, parentIdxs[i]);
//            int pos = childrenPosition[i];
//            if (pos == 0) {
//                if (nodes[i] != IMPOSSIBLE_VALUE) {
//                    node.left = new TreeNode(nodes[i]);
//                }
//            } else {
//                if (nodes[i] != IMPOSSIBLE_VALUE) {
//                    node.right = new TreeNode(nodes[i]);
//                }
//            }
//        }
//
//        return root;
//
//    }

//    public static TreeNode findNode(TreeNode root, int targetVal) {
//        targetNode = null;
//        findNodeHelper(root, targetVal);
//        return targetNode;
//    }

//    private static void findNodeHelper(TreeNode node, int targetVal) {
//        if (node == null) {
//            return;
//        }
//        if (node.val == targetVal) {
//            targetNode = node;
//            return;
//        }
//        if (targetNode == null) {
//            findNodeHelper(node.left, targetVal);
//        }
//        if (targetNode == null) {
//            findNodeHelper(node.right, targetVal);
//        }
//
//    }


//    private static TreeNode findParentNode(TreeNode root, int[] nodes, int[] parents, int[] children, int parentIdx) {
//        Stack<int[]> backTrackStack = new Stack<>();
//        while (parents[parentIdx] != IMPOSSIBLE_VALUE) {
//            backTrackStack.push(new int[]{nodes[parentIdx], children[parentIdx]});
//            parentIdx = parents[parentIdx];
//        }
//
//        TreeNode node = root;
//        while (!backTrackStack.isEmpty()) {
//            int[] tmpInfo = backTrackStack.pop();
//            int val = tmpInfo[0];
//            int child = tmpInfo[1];
//
//            if (child == 0) {
//                node = node.left;
//            } else {
//                node = node.right;
//            }
//            assert (node.val == val) : "wrong node";
//        }
//
//        return node;
//
//    }

    // private static TreeNode dfs(TreeNode root, int val ) {
    // Stack<TreeNode> s = new Stack<TreeNode>();
    //
    // s.push(root);
    // while (!s.isEmpty()) {
    // TreeNode node = s.pop();
    // if (node == null) {
    // continue;
    // }
    // if (node.val == val) {
    // if(node.left==null||node.right==null){
    // return node;
    // }else{
    // continue;
    // }
    //
    // } else {
    // TreeNode left = (TreeNode)node.left;
    // TreeNode right = (TreeNode)node.right;
    // s.push(right);
    // s.push(left);
    // }
    // }
    // return null;
    // }


    /***************************BinarySearchTreeNode************************************/

    private static void add(BinarySearchTreeNode node, int value) {
        if (value < node.val) {
            if (node.left != null) {
                add((BinarySearchTreeNode) node.left, value);
            } else {

                node.left = new BinarySearchTreeNode(value);
            }
        } else if (value > node.val) {
            if (node.right != null) {
                add((BinarySearchTreeNode) node.right, value);
            } else {

                node.right = new BinarySearchTreeNode(value);
            }
        }
    }

    public static BinarySearchTreeNode constructTreeNode(int[] nodes) {
        if (nodes == null) {
            return null;
        }
        int nodesLen = nodes.length;
        if (nodesLen == 0) {
            return null;
        }

        BinarySearchTreeNode root = new BinarySearchTreeNode(nodes[0]);

        for (int i = 1; i < nodesLen; i++) {
            add(root, nodes[i]);
        }

        return root;
    }


/***************************NaryTreeNode************************************/

//    public static Node constructTreeNode(int[] values, int[] parentIdxs) {
//        int nodesLen = values.length;
//        if (nodesLen == 0) {
//            return null;
//        }
//        Map<Integer, Node> map = new HashMap<>();
//        Node root = new Node( values[0],null);
//        map.put(0, root);
//
//        for (int i = 1; i < nodesLen; i++) {
//            Node childNode = new Node(values[i],null);
//
//            int parentIdx = parentIdxs[i];
//            Node parentNode = map.get(parentIdx);
//            List<Node> children = parentNode.children;
//            if (children == null) {
//                children = new ArrayList<>();
//            }
//            children.add(childNode);
//            parentNode.children = children;
//
//            map.put(i, childNode);
//        }
//
//        return root;
//
//    }
}
