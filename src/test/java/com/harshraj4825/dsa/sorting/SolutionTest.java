package com.harshraj4825.dsa.sorting;

import com.harshraj4825.dsa.searching.Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SolutionTest {
    Solution solution=new Solution();
    @Test
    private void containsElementInArray(){
        int[] arr=new int[]{3,6,8,10,14};
        Assert.assertEquals(solution.containsElementInArray(arr,2),false);
        Assert.assertEquals(solution.containsElementInArray(arr,10),true);
    }
}
