package com.harshraj4825.dsa.searching;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LinearSearchTest{

    private final Searching searching=new LinearSearch();

    @DataProvider(name = "integer-array")
    public Object[][] dataProvider(){
        return new Object[][] {
                {new int[]{4,3,7,1,5},7}
        };
    }
    @Test(dataProvider = "integer-array")
    public void search(int[] arr, int element) {
        int result=searching.search(arr,element);
        Assert.assertEquals(result,2);
    }
}
