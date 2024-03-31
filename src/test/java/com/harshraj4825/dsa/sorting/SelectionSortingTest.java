package com.harshraj4825.dsa.sorting;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SelectionSortingTest implements Sort{
    private final Sort sort = new SelectionSort();

    @DataProvider(name = "integer-array")
    public Object[][] dataProvider(){
        return new Object[][] {
                {new int[]{4,3,7,1,5}}
        };
    }
    @Override
    @Test(dataProvider = "integer-array")
    public void sort(int[] input) {
        sort.sort(input);
        Assert.assertEquals(input,new int[]{1,3,4,5,7});
    }
}
