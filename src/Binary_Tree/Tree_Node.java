/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_Tree;

/**
 *
 * @author Vodka
 */
public class Tree_Node {
    private boolean hasLeftTree;
    private boolean hasRightTree;
    private Tree_Node leftTree;
    private Tree_Node rightTree;
    private int data;
    
    public Tree_Node(int x)
    {
        leftTree        = null;
        rightTree       = null;
        data            = x;
        hasLeftTree     = false;
        hasRightTree   = true;
    }
    
    public void setLeftTree(Tree_Node left)
    {
        leftTree = left;
        hasLeftTree = true;
    }
    
    public void setRightTree(Tree_Node right)
    {
        rightTree = right;
        hasRightTree = true;
    }
    
    public Tree_Node getRightTree()
    {
        return rightTree;
    }
    
    public Tree_Node getLeftTree()
    {
        return leftTree;
    }
    
    public boolean hasLeft()
    {
        return hasLeftTree;
    }
    
    public boolean hasRight()
    {
        return hasRightTree;
    }
    
    public int getData()
    {
        return data;
    }
    
    public void setData(int new_Data)
    {
        data = new_Data;
    }
}
