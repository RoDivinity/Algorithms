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
public class Binary_Tree {
   
     Tree_Node root;
    public Binary_Tree()
    {
       root = null;
    }
    
    // adding elements recursively,
    //      if no data on right of ptr -> add data to the right
    //      if no data on left of ptr  -> add data to the left
    private Tree_Node insert(int x, Tree_Node ptr)
    {
        if (ptr==null)          //if there is not yet any data, insert it at root node
        {
            ptr = new Tree_Node(x);
        }
        else 
        {
            if(ptr.getRightTree()==null)
               ptr.setRightTree(insert(x, ptr.getRightTree()));
            else
                ptr.setLeftTree(insert(x, ptr.getLeftTree()));
        }
        return ptr;
    }
    
    /**** function to add data ****/
    public void insert(int data)
    {
        root = insert(data, root);
    }
    
    //print out data in pre order
    private void preOrder(Tree_Node node)
    {
        if (node != null)
        {
            System.out.print(node.getData() + " -> ");
            preOrder(node.getLeftTree());
            preOrder(node.getRightTree());
        }
    }
    
    public void preOrder()
    {
        preOrder(root);
    }
    
}