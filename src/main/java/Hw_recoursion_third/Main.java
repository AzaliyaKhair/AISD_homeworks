package Hw_recoursion_third;

public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);

        root.addChild(node2);
        root.addChild(node3);
        root.addChild(node4);

        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        node2.addChild(node5);
        node2.addChild(node6);

        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(8);
        TreeNode node9 = new TreeNode(9);
        node4.addChild(node7);
        node4.addChild(node8);
        node4.addChild(node9);

        TreeSerializer serializer = new TreeSerializer();
        String result = serializer.serialize(root);
        System.out.println(result);
    }
}