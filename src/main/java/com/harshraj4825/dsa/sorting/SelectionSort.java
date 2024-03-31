package com.harshraj4825.dsa.sorting;

import com.harshraj4825.dsa.Utils;

public class SelectionSort implements Sort{
    /**
     * Selection sort is a sorting algo that select the smallest element from unsorted list in each iteration
     * and place that element at the beginning of the unsorted list
     * @param input unsorted array
     */
    @Override
    public void sort(int[] input) {
        for (int i=0;i<input.length-1;i++){
            int minIndex=i;
            //In this loop, try to find index of min value
            for(int j=i+1;j<input.length;j++){
                if(input[j]<input[minIndex]){
                    minIndex=j;
                }
            }
            if(minIndex!=i){
                //if minIndex is not equal to i then swap the value
                Utils.swapIntInArray(input,minIndex,i);
            }
        }
    }
}
