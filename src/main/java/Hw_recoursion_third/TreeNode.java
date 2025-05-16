package Hw_recoursion_third;

import java.util.List;
import java.util.ArrayList;

public class TreeNode {
    public int val;
    public List<TreeNode> children;

    public TreeNode(int val) {
        this.val = val;
        this.children = new ArrayList<>();
    }

    public void addChild(TreeNode child) {
        this.children.add(child);
    }
}