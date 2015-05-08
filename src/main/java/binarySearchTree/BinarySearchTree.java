package binarySearchTree;

/**
 * Java implementation of Binary Search Tree
 *
 * Created by Yagnesh on 5/4/2015.
 */
public class BinarySearchTree {

    private TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    /**
     * Insert data from root. This will call TreeNode's insert method.
     * @param data
     */
    public void insert(Integer data) {
        if (root == null) {
            root = new TreeNode(data);
        } else {
            root.insert(data);
        }
    }

    /**
     * Find the node containing the data
     * @param data
     * @return treeNode
     */
    public TreeNode find(Integer data) {
        if (root != null) {
            return root.find(data);
        }
        return null;
    }


}
