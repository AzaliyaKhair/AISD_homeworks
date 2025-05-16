package hw_recoursion_second;

public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        TreeSerializer serializer = new TreeSerializer();
        String result = serializer.serialize(root);
        System.out.println(result);
    }
}