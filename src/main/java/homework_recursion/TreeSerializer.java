package homework_recursion;

public class TreeSerializer {
    public String serialize(TreeNode root) {
        if (root == null) {
            return "NULL";
        }
        String left = serialize(root.left);
        String right = serialize(root.right);
        return String.format("(%d, %s, %s)", root.val, left, right);
    }
}