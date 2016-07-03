/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sort;

/**
 * 
 * @author Vodka
 */
public class bubble_sort {
    public bubble_sort(int[] data)
    {
        boolean isFinished = false;    //check if the array is done sorted
                                       //if there is no more swapping taking place
                                       //need to iterate the swapping at least once
        boolean isSwapped  = true;    //flag if something is swapped
        
        int counter = 0;               /*loop through the array. After each loop, 
                                        *last - counter data in array sorted, i.e 
                                        *counter = 0, data[length] is sorted    
                                        *counter = 1, data[length-1] is sorted.
                                        *After each loop increase counter by 1 to reflect change
                                        *and reset flag isSwapped to false
                                        *If there is a loop that isSwapped =false, i.e. nothing 
                                        *is swapped -> done! -> flag isFinished = true to end loop*/
        int temp    = 0;
        while (isSwapped)
        {   
            isSwapped = false;
            counter ++;                //increase counter before sorting array since index start at 0
            for(int i=0;i<data.length-counter;i++)
            {
                if(data[i]>data[i+1])   
                                            // swapped something, flagged
                    {
                    temp        =   data[i+1];
                    data[i+1]   =   data[i];
                    data[i]     =   temp;
                    isSwapped   =   true;
                    }
                //can merge isFinished and isSwapped
                //no more swapped = isSwapped = false ->finished sorting -> end loop 
            }
            
        }
    }
}
