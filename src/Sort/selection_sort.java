/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sort;

/**
 * @title: selection sort
 * + how it works:
 *  1) go through the array to pick the largest element, swap it with last index
 *  2) go through the array to pick 2nd largest element, swap it with the second last index
 *  3) repeat until get to first index
 * + pros: easy to implement
 * + cons: very slow
 * @efficiency: O(n^2)
 * @author Vodka
 */
public class selection_sort {
  public selection_sort ( int [ ] num )
{
     int i, j, first, temp;  
     for ( i = num.length - 1; i > 0; i -- )  
     {
          first = 0;   //initialize to subscript of first element
          for(j = 1; j <= i; j ++)   //locate smallest element between positions 1 and i.
          {
               if( num[ j ] > num[ first ] )         
                 first = j;
          }
          temp = num[ first ];   //swap smallest found with element in position i.
          num[ first ] = num[ i ];
          num[ i ] = temp; 
      }           
}
}
    
    
    
    /*public selection_sort(int[] data)
   {
       int i,j,temp,first = 0;
       /*iterate through the array
        *start a seperate counter j to keep track the index of 
        *largest current element
        *locate the largest element in the array between pos 0 to pos i-1
        *after complete going thru the array, swap last index with largest element found
        *
       for(i=data.length-1;i>0;i--)
       {   
           first = 0;          //initialize the tracking progress(subscript of indices
           for (j=1;j<i;j++)   //
           {
               if(data[j]>data[first])
                   first = j;
           }
           temp = data[first];  //last element saved to a temporary cache
           data[first] = data[i]; //swap largest to last index
           data[i] = temp;    //swap prev last index to largest so data unchanged
       }
   }
}
    
    */
    
    
    
    
    
    
    
    
    
    /* <=== WRONG VERSION OF SORTING ===> */
    /* Why is it wrong????                */
    /*
    public selection_sort(int[] data)
    {
        int max_temp = 0;  //temporary largest element in each iteration
        int index = 0;     //index of the temporary largest element
        /* go through the array each loop, if find a number > max_temp, max_temp value set to that
         * after done going through the loop, set the last index = current max_temp 
         * and max_temp value to 0
         *
        int counter = 0; //count the loops
        while(counter<data.length-1)
        {
            int swap=0;
            counter++;
            //reset max element before each loop
        max_temp = 0;
        index = 0;
        for(int i=0;i<data.length-counter++;i++)
        {
            if(max_temp<data[i])  // if find an element larger than temporary max, 
                                  // remember new max AND SWAP with the last index
            {
                max_temp = data[i];
                swap = data[data.length- counter];
                data[data.length - counter] = max_temp;
                data[i] = swap;
            }
        }
               // System.out.println("largest element is "+data[data.length-counter]);
        }
    }
    
  
}
*/
