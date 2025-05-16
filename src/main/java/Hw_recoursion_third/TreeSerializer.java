package Hw_recoursion_third;

import java.util.List;

public class TreeSerializer {
    public String serialize(TreeNode root) {
        if (root == null) {
            return "NULL";
        }

        StringBuilder childrenStr = new StringBuilder();
        List<TreeNode> children = root.children;

        if (children.isEmpty()) {
            childrenStr.append("NULL");
        } else {
            for (int i = 0; i < children.size(); i++) {
                if (i > 0) {
                    childrenStr.append(", ");
                }
                childrenStr.append(serialize(children.get(i)));
            }
        }

        return String.format("(%d, %s)", root.val, childrenStr.toString());
    }
}
