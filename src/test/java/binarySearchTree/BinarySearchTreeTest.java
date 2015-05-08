package binarySearchTree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Yagnesh on 5/4/2015.
 */
public class BinarySearchTreeTest {

    private BinarySearchTree bst;

    @Before
    public void setUp() throws Exception {
        bst = new BinarySearchTree();
    }

    @Test
    public void testInsert() throws Exception {
        bst.insert(new Integer(10));
        assertEquals("Root should have value 10",10,bst.getRoot().getData().intValue());
    }

    @Test
    public void theNodesInsertedshouldNotViolateBSTRules() throws Exception {
        bst.insert(new Integer(10));
        bst.insert(new Integer(12));
        bst.insert(new Integer(8));

        assertEquals("Root should have value 10", 10, bst.getRoot().getData().intValue());
        assertEquals("Right node should have value 12", 12, bst.getRoot().getRightNode().getData().intValue());
        assertEquals("Left node should have value 8", 8, bst.getRoot().getLeftNode().getData().intValue());

        bst.insert(new Integer(6));
        bst.insert(new Integer(9));
        bst.insert(new Integer(13));
        bst.insert(new Integer(11));

        assertEquals("Node with value 6 should be on level 3 and left child of 8", 6,
                bst.getRoot().getLeftNode().getLeftNode().getData().intValue());
        assertEquals("Node with value 9 should be on level 3 and right child of 8", 9,
                bst.getRoot().getLeftNode().getRightNode().getData().intValue());
        assertEquals("Node with value 11 should be on level 3 and left child of 12", 11,
                bst.getRoot().getRightNode().getLeftNode().getData().intValue());
        assertEquals("Node with value 13 should be on level 3 and right child of 12", 13,
                bst.getRoot().getRightNode().getRightNode().getData().intValue());

    }

    @Test
    public void nodesInsertedCanBeFoundOut() throws Exception {
        bst.insert(new Integer(10));
        bst.insert(new Integer(12));
        bst.insert(new Integer(8));

        assertEquals("Node 8 must be present", 8, bst.find(8).getData().intValue());
        assertEquals("Node 10 must be present", 10, bst.find(10).getData().intValue());
        assertEquals("Node 12 must be present", 12, bst.find(12).getData().intValue());
        assertNull(bst.find(21));
    }

}