package hw_recoursion_first;

public class BinaryTreeHeight {
    public int computeHeight(TreeNode node) {
        if (node == null) {
            return -1;
        }
        int leftHeight = computeHeight(node.left);
        int rightHeight = computeHeight(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public void printHeights(TreeNode node) {
        if (node == null) {
            return;
        }
        printHeights(node.left);
        System.out.println("Узел " + node.val + ": высота поддерева = " + computeHeight(node));
        printHeights(node.right);
    }

    public void computeAndPrintHeights(TreeNode root) {
        if (root == null) {
            return;
        }
        printHeights(root);
    }
}
