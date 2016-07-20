package Sort;

/**
 * @title quick sort
 * + how it works:
 * 1) Locate the middle element of the array to act as a pivot
 * 2) Initialize 2 pointers, left and right. Left pointer go from 1st element and right pointer 
 * go from last element. 
 * 3) Compare left pointer with pivot, if larger, stop. Compare right pointer
 * with pivot. If smaller, stop.
 * 4) Swap left and right pointer.
 * 5) Repeat process till 2 pointers cross. Swap the pivot back to middle. Now all left elements
 * of pivot are < pivot and all right elements of pivot > pivot.
 * 6_ Recursion of Sorting left sub_array and right sub_array
 * + pros: extremely fast on average
 * + cons: may be very slow if the middle element is close to max or min of the array
 *         in worst case may cause stack overflow as it recurses at high level O(n^2)
 * @efficiency: O(n*log n)
 * @author Vodka
 */
public class quick_sort {
    int recursion = 0;
    public quick_sort (int[] data)
    {
        quick_sort(data , 0 , data.length - 1);
        recursion = 0;
    }
    
    public void quick_sort(int[] data, int left_bound, int right_bound)
    {
     int pivotIndex = findPivot(data, left_bound , right_bound);
     //move pivot to the end of sorting array
     swap (data, pivotIndex , right_bound);
     System.out.println(java.util.Arrays.toString(data) + " " + recursion);
     recursion ++;
     //find the position of element needed to swap with pivot & this divide array into 2
     //sub_array for sorting. swap_pos will be the index of first element on right sub array
     int swap_pos = partition (data, left_bound , right_bound - 1, data[right_bound]);
     //swap pivot back to the correct place it belongs to
     swap (data , swap_pos , right_bound);
     
     if ((swap_pos - left_bound ) > 1) 
         quick_sort (data , left_bound , swap_pos - 1); //sort left sub_array
     if ((right_bound - swap_pos) > 1)
         quick_sort (data , swap_pos + 1 , right_bound); //sort right sub_array
    }
    
    //find the index of pivot in array
    // it's always in the middle of the array
    public int findPivot(int[] data, int left_bound, int right_bound){
        return (left_bound+right_bound)/2;
    } 
    
    //swap the pivot to the end of the sorting array
    public void swap (int[] data, int index, int swap_index){
        int temp = data[index];
        data[index] = data[swap_index];
        data[swap_index] = temp;
    }
    
    //function to sort the array by comparing the left pointer and right pointer with pivot
    //left pointer only stops when points to value > pivot
    //right pointer only stops when points to value < pivot
    //if both pointers stop || pointers cross, swap the out of place values
    public int partition (int[] data, int left_bound , int right_bound , int a){
        while (left_bound <= right_bound)
        {
         while (data[left_bound] < a)       //move pointer leftward if values < pivot
             left_bound ++ ;
         while ((right_bound >= left_bound) && (data[right_bound] >= a ))    
             right_bound -- ;                //move pointer rightward if values > pivot and not crosses yet
         if (right_bound > left_bound)
             swap (data , left_bound , right_bound);   //swap out of place values
        }
        return left_bound;          //return first position in right partition
    }

}
