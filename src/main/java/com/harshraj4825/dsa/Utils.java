package com.harshraj4825.dsa;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Utils {
    public static void swapIntInArray(int[] arr,int i, int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }

    public static String printArray(int [] arr){
        return Stream.of(arr)
                .map(String::valueOf)
                .collect(Collectors.joining("","[","]"));
    }
}
