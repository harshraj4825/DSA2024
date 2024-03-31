package com.harshraj4825.dsa.sorting;

import com.harshraj4825.dsa.Utils;

public class BubbleSort implements Sort{

    /**
     * Bubble sort is a sorting algorithm that compares two adjacent elements and swaps them until they are in sorted
     * array
     * @param input input
     */
    @Override
    public void sort(int[] input) {
        int size=input.length;
        for (int i=0;i<size-1;i++){
            //iterate till unsorted
            for (int j=0;j<size-i-1;j++){
                if(input[j+1]<input[j]){
                    Utils.swapIntInArray(input,j+1,j);
                }
            }
        }
    }
}
