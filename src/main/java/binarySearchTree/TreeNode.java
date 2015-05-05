package binarySearchTree;

/**
 * Java implementation of single tree node of BST
 *
 * Created by Yagnesh on 5/4/2015.
 */
public class TreeNode {

    private Integer data;
    private TreeNode leftNode;
    private TreeNode rightNode;

    public TreeNode(Integer data) {
        this.data = data;
    }

    public Integer getData() {
        return data;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }


    public void insert(Integer data) {
        if (data >= getData()) {
            if (rightNode == null) {
                rightNode = new TreeNode(data);
            } else {
                rightNode.insert(data);
            }
        } else {
            if (leftNode == null) {
                leftNode = new TreeNode(data);
            } else {
                leftNode.insert(data);
            }
        }
    }

    public TreeNode find(Integer data) {
        if (this.data.equals(data)) {
            return this;
        }
        if (data < this.data && leftNode != null) {
            return leftNode.find(data);
        }

        if (rightNode != null) {
            return rightNode.find(data);
        }
        return null;
    }
}
