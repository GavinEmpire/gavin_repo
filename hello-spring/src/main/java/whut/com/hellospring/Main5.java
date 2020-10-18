package whut.com.hellospring;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
public class Main5 {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if (root == null)
            return list;

        if (root.left == null && root.right == null)
            list.add(root.val + "");

        for (String path : binaryTreePaths(root.left))
            list.add(root.val + "->" + path);

        for (String path : binaryTreePaths(root.right))
            list.add(root.val + "->" + path);
        return list;
    }

    public static void main(String[] args) {
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode five = new TreeNode(5);
        one.left = two;
        one.right = three;
        two.right = five;

        new Main5().binaryTreePaths(one).forEach(System.out::println);
    }
}
