package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

/**
 * 二叉树相关
 */
public class Solution {

    /**
     * 深度优先遍历
     * @param root
     * @return
     */

    public List<Integer> inOrderTraversal(TreeNode root) {
        List<Integer> nodes = new ArrayList<>();
        inOrder(root, nodes);
        return nodes;
    }

    /**
     * 中序遍历
     * @param root
     * @param list
     */
    public static void inOrder(TreeNode root, List<Integer> list) {
        if (Objects.isNull(root)) {
            return;
        }
        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
    }

    /**
     *                                1
     *                     2                     3
     *               4         5             6          7
     *           8    9    10     11     12     13   14   15
     * @param root
     */
    public static List<Integer> inOrder(TreeNode root) {
        List<Integer> valList = new ArrayList<>();
        if (Objects.isNull(root)) {
            return valList;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            valList.add(cur.val);
            cur = cur.right;
        }
        return valList;
    }

    /**
     * 面试题47：二叉树剪枝 后序遍历
     * @param treeNode
     * @return
     */
    public TreeNode pruneTree(TreeNode treeNode) {
        //
        if (null == treeNode) return null;
        treeNode.left = pruneTree(treeNode.left);
        treeNode.right = pruneTree(treeNode.right);
        if (treeNode.left == null && treeNode.right == null && treeNode.val == 0) {
            return null;
        }
        return treeNode;
    }

    /**
     * 序列化二叉树 ：前序遍历
     * @param root
     * @return
     */
    public String serial(TreeNode root) {
        if (root == null) return "#";
        String left = serial(root.left);
        String right = serial(root.right);
        return root.val + "," + left + "," + right;
    }

    public TreeNode deserialize(String data) {
        String[] nodeStr = data.split(",");
        return null;
    }


}
