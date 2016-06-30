/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;
import Binary_Tree.*;
import Binary_Search.*;
/**
 *
 * @author Vodka
 */
public class Algorithms {

    
    public static void main(String[] args) 
    {
        int[] TestSet =  {1 ,2 ,4 ,5 ,5 ,6 ,8,9,12,16,17,20};
        //Tree_Node[] test_node = new Tree_Node[7];
     Binary_Search test = new Binary_Search(TestSet);
     
       System.out.println(test.binarySearch(20));
    }
    
}
