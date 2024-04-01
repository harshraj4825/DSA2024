package com.harshraj4825.dsa.searching;

public class BinarySearch implements Searching{
    /**
     * Step-1 : get mid
     * Step-2 : if(arr[mid]==element)return mid
     * Step-3 : if(arr[mid]>element)then check left side
     * Step- : if(arr[mid]< element)then check right side
     * there are two-way to implement recursive search
     * 1. Using loop. T.C= O(log2n) and S.C=O(1)
     * 2. Using recursion T.C= O(log2n) and S.C=O(log2n)
     * @param arr sorted array
     * @param element element to search in array
     * @return index of the element present in array
     */
    @Override
    public int search(int[] arr, int element) {
        int searchUsingLoop=searchUsingLoop(arr,element);
        if(searchUsingLoop==searchUsingRecursion(arr,0,arr.length-1,element))return searchUsingLoop;
        return -1;
    }

    private int searchUsingLoop(int[] arr,int element){
        int l=0;
        int h=arr.length-1;
        while (l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==element) return mid;
            if (arr[mid]>element)h=mid-1;
            else l=mid+1;
        }
        return -1;
    }

    private int searchUsingRecursion(int[] arr,int l,int r,int element){
        if(l>r)return -1;
        else {
            int mid=(l+r)/2;
            if(arr[mid]==element)return mid;
            else if (arr[mid]>element)return searchUsingRecursion(arr,l,mid-1,element);
            else return searchUsingRecursion(arr,mid+1,r,element);
        }
    }
}
