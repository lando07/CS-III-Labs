
// Your Name
import static java.lang.System.in;
import static java.lang.System.out;

import java.util.LinkedList;
import java.util.Queue;

public class IntBST {

    private TreeNode root;

    public IntBST() {
        root = null;
    }

    public void add(int value) {
        root = add(value, root);
    }

    private TreeNode add(int value, TreeNode tree) {
        if (tree == null) {
            tree = new TreeNode(value, null, null);
        }

        else if (value < tree.value) {
            tree.left = add(value, tree.left);
        }

        else if (value > tree.value) {
            tree.right = add(value, tree.right);
        }

        return tree;
    }

    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(TreeNode tree) {
        if (tree != null) {
            inOrder(tree.left);
            System.out.print(tree.value + " ");
            inOrder(tree.right);
        }
    }

    // add preOrder, postOrder, and revOrder
    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(TreeNode tree) {
        if (tree != null) {
            out.print(tree.value + " ");
            preOrder(tree.left);
            preOrder(tree.right);
        }
    }

    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(TreeNode tree) {
        if (tree != null) {
            postOrder(tree.left);
            postOrder(tree.right);
            out.print(tree.value + " ");
        }
    }

    public void revOrder() {
        revOrder(root);
    }

    private void revOrder(TreeNode tree) {
        if (tree != null) {
            revOrder(tree.right);
            out.print(tree.value + " ");
            revOrder(tree.left);
        }
    }

    public int getNumLevels() {
        return getNumLevels(root);
    }

    private int getNumLevels(TreeNode tree) {
        if (tree == null)
            return 0;
        else if (getNumLevels(tree.left) > getNumLevels(tree.right))
            return 1 + getNumLevels(tree.left);
        else
            return 1 + getNumLevels(tree.right);
    }

    // getWidth
    public int getWidth() {
        if (root == null)
            return 0;
        int largestWidth = 1;
        Queue<TreeNode> parents = new LinkedList<>();
        Queue<TreeNode> children = new LinkedList<>();
        parents.add(root);
        while (!parents.isEmpty()) {
            TreeNode tree = parents.remove();
            if (tree.left != null) {
                children.add(tree.left);
            }
            if (tree.right != null) {
                children.add(tree.left);
            }
            if (parents.isEmpty()) {
                largestWidth = Math.max(largestWidth, children.size());
                parents = new LinkedList<>(children);
                children.clear();
            }
        }
        return largestWidth;
    }

    public boolean isFull() {
        return isFull(root);
    }

    private boolean isFull(TreeNode tree) {
        if (tree == null)
            return false;
        // if left and right are full, then do recursive call
        if (tree.left != null && tree.right != null) {
            return isFull(tree.left) && isFull(tree.right);
        } // if node is a leaf, then return true
        else if (tree.left == null && tree.right == null) {
            return true;
        } else {
            return false;
        }
    }

    public int getNumLeaves() {
        return getNumLeaves(root);
    }

    private int getNumLeaves(TreeNode tree) {
        if (tree == null)
            return 0;
        else if (tree.left != null || tree.right != null) {
            return getNumLeaves(tree.left) + getNumLeaves(tree.right);
        } else {
            return 1;
        }
    }

    public int getDiameter() {
        return getDiameter(0, root);
    }

    private int getDiameter(int max, TreeNode tree) {
        if (tree == null) {
            return max;
        } else if (getNumLevels(tree.right) + getNumLevels(tree.left) + 1 > max) {
            max = getNumLevels(tree.right) + getNumLevels(tree.left) + 1;
        }
        if (getNumLevels(tree.left) > getNumLevels(tree.right)) {
            return getDiameter(max, tree.left);
        } else {
            return getDiameter(max, tree.right);
        }
    }

    public int getHeight() {
        return getHeight(root) - 1;
    }

    private int getHeight(TreeNode tree) {
        if (tree == null) {
            return 0;
        } else {
            return 1 + Math.max(getHeight(tree.left), getHeight(tree.right));
        }
    }

    public int getNumNodes() {
        return getNumNodes(root);
    }

    private int getNumNodes(TreeNode tree) {
        if (tree == null) {
            return 0;
        } else {
            return 1 + getNumNodes(tree.left) + getNumNodes(tree.right);
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        toStringBuilder(root, str);
        return str.toString();
    }

    private void toStringBuilder(TreeNode tree, StringBuilder str) {
        if (tree != null) {
            toStringBuilder(tree.left, str);
            str.append(tree.value + " ");
            toStringBuilder(tree.right, str);
        }
    }

    // add search, getLargest, getSmallest, levelOrder, remove, displayTree here
    private static class TreeNode {
        private int value;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int value, TreeNode left, TreeNode right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

}