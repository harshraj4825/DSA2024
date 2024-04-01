package com.harshraj4825.dsa.searching;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BinarySearchTest {

    private final Searching searching=new BinarySearch();

    @DataProvider(name = "integer-array")
    public Object[][] dataProvider(){
        return new Object[][] {
                {new int[]{4,3,7,1,5},7,2},
                {new int[]{4},7,-1},
                {new int[]{4,3},7,-1},
                {new int[]{},7,-1}
        };
    }
    @Test(dataProvider = "integer-array")
    public void search(int[] arr, int element,int expectedResult) {
        int result=searching.search(arr,element);
        Assert.assertEquals(result,expectedResult);
    }
}
