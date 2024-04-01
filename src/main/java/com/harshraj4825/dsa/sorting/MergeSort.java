package com.harshraj4825.dsa.sorting;

public class MergeSort implements Sort{

    /**
     * Merge sort is a sorting algorithm that is based on the principle of Divide and Conquer Algorithm
     * Step-1 : calculate mid
     * Step-2 : sort left side of the mid
     * Step-3 : sort right side of the mid
     * Step-4 : merge array left and right
     * @param input unsorted array
     */
    @Override
    public void sort(int[] input) {
        divide(input,0,input.length-1);
    }

    private void divide(int[] arr,int l, int r){
        if(l<r){
            int mid=l+(r-l)/2;
            divide(arr,l,mid);
            divide(arr,mid+1,r);
            conquer(arr,l,r,mid);
        }
    }

    private void conquer(int[] a,int l, int r, int mid){
        int[] b=new int[r-l+1];
        int i=l;//starting index of left side
        int j=mid+1;//starting index of right side
        int k=0;//index in b
        while (i<=mid && j<=r)// loop till one of the array become ended
        {
            if(a[i]<=a[j]){
                b[k]=a[i];i++;
            }else {
                b[k]=a[j];j++;
            }
            k++;
        }

        while (i<=mid){
            b[k]=a[i];
            i++;
            k++;
        }
        while (j<=r){
            b[k]=a[j];
            j++;
            k++;
        }

        for(int p=0, m=l;p<b.length;p++,m++){
            a[m]=b[p];
        }
    }
}
