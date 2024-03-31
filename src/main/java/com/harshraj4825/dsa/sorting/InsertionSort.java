package com.harshraj4825.dsa.sorting;

public class InsertionSort implements Sort{

    /**
     * Inserting sort is a sorting algorithm that place an unsorted element at its suitable place in each iteration.
     * @param input unsorted array
     */
    @Override
    public void sort(int[] input) {
        //assuming input[0] is sorted
        for (int i=1;i<input.length;i++){{
            int pivot=input[i];
            int j=i-1;//last sorted index
            while (j>=0 && input[j]>pivot){
                input[j+1]=input[j];
                j--;
            }
            input[j+1]=pivot;
        }}
    }
}
