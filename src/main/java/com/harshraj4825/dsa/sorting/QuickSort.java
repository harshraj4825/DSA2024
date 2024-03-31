package com.harshraj4825.dsa.sorting;

import com.harshraj4825.dsa.Utils;

public class QuickSort implements Sort{
    /**
     * Quick sort is a sorting algorithm based on divide on conquer approach where
     * 1. An array is divided into sub arrays by selecting a pivot element where dividing the  array. The pivot element
     * should be positioned in such a way that elements less than pivot are kept on left side and grater is right side.
     * @param input unsorted array
     */
    @Override
    public void sort(int[] input) {
        quickSort(0,input.length-1,input);
    }

    private void quickSort(int l,int h, int[] input){
        if(l<h){
            int pivot=partition(input,l,h);
            quickSort(l,pivot-1,input);
            quickSort(pivot+1,h,input);
        }
    }
    /**
     * Using Partition logic
     * @return pivot element
     */
    int partition(int[] array, int low, int high) {
        // choose the rightmost element as pivot
        int pivot = array[high];
        // pointer for greater element
        int i = (low - 1);

        // traverse through all elements
        // compare each element with pivot
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                // if element smaller than pivot is found
                // swap it with the greater element pointed by i
                i++;
                Utils.swapIntInArray(array,i,j);
            }
        }
        Utils.swapIntInArray(array,i+1,high);
        // return the position from where partition is done
        return (i + 1);
    }
}
