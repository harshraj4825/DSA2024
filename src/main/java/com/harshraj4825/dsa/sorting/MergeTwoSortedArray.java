package com.harshraj4825.dsa.sorting;

public class MergeTwoSortedArray {
    public int[] mergeTwo(int[] arr1,int[] arr2){
        int l=arr1.length;
        int r=arr2.length;
        int[] result= new int[l+r];
        int k=0;// tracking result
        int i=0;// tracking arr1
        int j=0;//tracking arr2
        while (i<l && j<r){
            if(arr1[i]<=arr2[j]){
                result[k]=arr1[i];
                i++;
            }else {
                result[k]=arr2[j];
                j++;
            }
            k++;
        }

        while (i<l){
            result[k]=arr1[i];
            i++;
            k++;
        }
        while (j<r){
            result[k]=arr2[j];
            j++;
            k++;
        }
        return result;
    }
}
