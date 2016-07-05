/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sort;

/**
 * @title  insertion sort
 * +how it works:
 * 1) first element is added into an imaginative sub-sorted array
 * 2) go through the array, for each individual element, compare it with the last element 
 * of the sub-sorted array. Insert it into correct position by linear search or binary search
 * (sub-sorted array is always in correct order)
 * 3) repeat the process until last element
 * +pros:
 * +cons: faster than other O(n^2) sorting algorithm as sub array is always sorted
 * @efficiency: O(n^2)
 * @author Vodka
 */
public class insertion_sort {
    public insertion_sort(int[] data)
    {
        int temp,i,j;
        for(i=1;i<data.length;i++)  //iterate through the array
        {
            for (j=i;j>0;j--)      //go through the sub-array to insert the data
                                    //in correct position
            {
                if(data[j]<data[j-1])        //compare current data with last data in sub array
                {
                    temp = data[j];           //swap
                    data[j] = data[j-1];
                    data[j-1] = temp;       
                }
                else                           // if correct order, skipped
                {
                    break;
                }
            }
        }
    }
}
