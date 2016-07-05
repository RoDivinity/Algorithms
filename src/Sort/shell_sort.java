/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sort;

/**
 * @title shell sort
 * + how it works:
 *  1) pick an interval, g (preferably elements/3)
 *  2) sort elements at 0, 0+g, 0+2g, ... 
 *     sort elements at 1, 1+g, 1+2g, ... 
 *     repeat until n*g >= data.length (indicates all sub-arrays in interval are sorted)
 *  3) reduce interval by 1 and use insertion sort (sub-arrays in shorter interval must be sorted, i.e
 *      if interval reduce from 3 to 2, sub-array of index 0, 2, 4, .... must also sorted before move on
 * *) shell sort is just insertion sort breaking down in more steps to make final step (interval = 1) faster
 * + pros:  faster than usual insertion sort
 *          easy to implement
 *          fastest of non-recursive sorts
 * + cons:  depends on how partially sorted array is
 *          not so fast
 *          mess up sequence => slow sort
 * @author Vodka
 * 
 */
public class shell_sort {

    public int count;
   
    public shell_sort(int[] array){
    int inner, outer;               //inner represent sub array, outer represent main array
    int temp;                       
    count = 0;
    int h = 1;
    while (h <= array.length / 3)   //why we need this? to count how many times we need to repeat
                                    //insertion sort
    {
      h = h * 3 + 1;
      System.out.println("value of h: "+h);
    }
    System.out.println("we are here?");
    while (h > 0) {
      
        for (outer = h; outer < array.length; outer++) 
      {
        temp = array[outer];                    //start of the element in gap position
        inner = outer;
        System.out.println("what 2 elements we are looking at? "+array[inner - h]+" "+array[inner]);
        while (inner > h - 1 && array[inner - h] >= temp)   //check if 2 elements of the corresponding 
                                                            //index gap is in correct order
                                                            // need inner > h-1 so that index is not out of bound, otherwise inner -h <0 
        {                                                   // need while loop because we need to insertion sort all sub array
          
          //System.out.println("we swapped "+array[inner-h]+ " with " + temp);
          array[inner] = array[inner - h];  //swap if finding elements are out of order
          inner -= h;
          
          count ++;
        }
        array[inner] = temp;
        
      }
        
      h = (h - 1) / 3; //reduce the gap between indices comparing
      //System.out.println(java.util.Arrays.toString(array));
    }
    }
    
    
   /* public shell_sort(int[] data)
    {
        int i,j,temp,interval,max;
        interval = 3;
        while(interval>0)
        {
         for (i = 0; i<data.length/interval; i++) //sort 2 elements at the specified interval (i, i+interval)
                                                    //then go on next element (i+1, i+1+interval)
         {   
             max = i+interval;
             if(max>=data.length)
             {
                 max = data.length - 1; 
             }
             if(data[i]>data[max])
             {
    //System.out.println(data[i]+" swapped with "+data[i+interval] +" iteration " +i );
                 temp = data [max] ;       //swap
                 data [max] = data[i];
                 data [i] = temp;
                
             }
         }
          System.out.println(java.util.Arrays.toString(data));
         interval --;
        }
        
    } */
}
