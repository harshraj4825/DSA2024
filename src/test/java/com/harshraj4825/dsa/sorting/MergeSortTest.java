package com.harshraj4825.dsa.sorting;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MergeSortTest{

    private final MergeTwoSortedArray mergeTwoSortedArray = new MergeTwoSortedArray();

    @DataProvider(name = "integer-array")
    public Object[][] dataProvider(){
        return new Object[][] {
                {new int[]{1,2,3,4,5},new int[]{1,2,3,4,5},new int[]{1,1,2,2,3,3,4,4,5,5}},
                {new int[]{1,5,10,15,20},new int[]{1,2,3,4,5},new int[]{1,1,2,3,4,5,5,10,15,20}}
        };
    }

    @Test(dataProvider = "integer-array")
    public void sort(int[] arr1,int[] arr2, int[] result) {
        int[] resp=mergeTwoSortedArray.mergeTwo(arr1,arr2);
        Assert.assertEquals(resp,result);
    }
}
