/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_Search;

/**
 *
 * @author Vodka
 */
public class Binary_Search {
    /* binary search:
    /  *Requirements:
    /   Ascending sorted array
    / let value you look up = x, 
    /   point the first data with middle index, 
    /     a = [max+min]/2.
    /       if x<a
    /           repeat binary search from smallest data to a
    /       if x>a
    /           repeat binary search from a to largest data
    /       if x=a
    /           return true
    */
    int[] data;
    
    public Binary_Search(int[] array)
    {
         data = array;
         
    }
    

    public boolean binarySearch(int key) 
    {
         int index_low = 0;
         int index_high = data.length-1;
          
         while(index_high >= index_low) {
             int index_middle = (index_low+index_high) / 2;
             if(data[index_middle] == key) {
                 return true;
             }
             if(data[index_middle] < key) {
                 index_low = index_middle + 1;
             }
             if(data[index_middle] > key) {
                 index_high = index_middle - 1;
             }
        }
        return false;
   }
}