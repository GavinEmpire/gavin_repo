package whut.com.hellospring;

import java.util.LinkedList;
import java.util.Scanner;

public class BinaryTreeTraverse {

    public static void main(String[] args) {
                InitBiTree initBiTree = createBiTree();
                 System.out.println("——————先序遍历——————");
                 preOrderTraverse(initBiTree);
                 System.out.println();
                 System.out.println("——————中序遍历——————");
                 inOrderTraverse(initBiTree);
                 System.out.println();
                 System.out.println("——————后序遍历——————");
                 postOrderTraverse(initBiTree);
                 System.out.println();
                 System.out.println("——————层序遍历——————");
                 levelOrderTraverse(initBiTree);
                 System.out.println();
                 System.out.println("——————二叉树深度——————");
                 System.out.println(biTreeDepth(initBiTree));
                 System.out.println("——————叶子结点个数——————");
                 System.out.println(biTreeNodeCount(initBiTree));
             }
    public static int biTreeNodeCount(InitBiTree initBiTree) {
        //求叶节点个数
        if (initBiTree != null) {
            int l = biTreeNodeCount(initBiTree.getLchild());
            int r = biTreeNodeCount(initBiTree.getRchild());
            if (l == 0 && r == 0) {
                return 1;
            } else {
                return l + r;
            }
        } else {
            return 0;
        }
    }

    public  static InitBiTree createBiTree() {
        //先序遍历创建二叉树
        System.out.print("请按先序次序依次输入二叉树的值，#号表示建立空树：");
        Scanner sc = new Scanner(System.in);
        String input = null;
        input = sc.next();
        if (input.equals("#")) {
            return null;
        } else {
            InitBiTree initBiTree = new InitBiTree();
            initBiTree.setData(input);
            initBiTree.setLchild(createBiTree());
            initBiTree.setRchild(createBiTree());
            return initBiTree;
        }
    }

    public static void preOrderTraverse(InitBiTree initBiTree) {
        //先序遍历
        if (initBiTree != null) {
            System.out.print(initBiTree.getData());
            preOrderTraverse(initBiTree.getLchild());
            preOrderTraverse(initBiTree.getRchild());
        }
    }

    public static void inOrderTraverse(InitBiTree initBiTree) {
        //中序遍历
        if (initBiTree != null) {
            inOrderTraverse(initBiTree.getLchild());
            System.out.print(initBiTree.getData());
            inOrderTraverse(initBiTree.getRchild());
        }
    }

    public static void postOrderTraverse(InitBiTree initBiTree) {
        //后序遍历
        if (initBiTree != null) {
            postOrderTraverse(initBiTree.getLchild());
            postOrderTraverse(initBiTree.getRchild());
            System.out.print(initBiTree.getData());
        }
    }

    public static void levelOrderTraverse(InitBiTree initBiTree) {
        //层序遍历
        if (initBiTree != null) {
            LinkedList<InitBiTree> linkedList = new LinkedList<InitBiTree>();
            linkedList.offer(initBiTree);
            while (!linkedList.isEmpty()) {
                initBiTree = linkedList.poll();
                if (initBiTree.getLchild() != null) {
                    linkedList.offer(initBiTree.getLchild());
                }
                if (initBiTree.getRchild() != null) {
                    linkedList.offer(initBiTree.getRchild());
                }
                System.out.print(initBiTree.getData());
            }
        }
    }

    public static int biTreeDepth(InitBiTree initBiTree) {
        //求二叉树深度
        if (initBiTree != null) {
            int l = biTreeDepth(initBiTree.getLchild());
            int r = biTreeDepth(initBiTree.getRchild());
            if (l > r) {
                return l + 1;
            } else {
                return r + 1;
            }
        } else {
            return 0;
        }
    }


}
