package com.harshraj4825.dsa.searching;

public class Solution {
	/**
	 * Needs to use binary search
	 * @param arr sorted array
	 * @param key key to search in array
	 * @return true if present
	 */
	public boolean containsElementInArray (int[] arr, int key) {
		int l=0;
		int r=arr.length-1;
		while(l<=r){
			int mid=l+(r-l)/2;
			if(arr[mid]==key)return true;
			else if (arr[mid]>key) {
				r=mid-1;
			}
			else {
				l=mid+1;
			}
		}
		return false;
	}
}