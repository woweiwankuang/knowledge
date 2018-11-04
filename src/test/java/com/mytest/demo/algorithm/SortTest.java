package com.mytest.demo.algorithm;

import org.junit.Test;

import java.util.Arrays;

/**
 * 排序
 */
public class SortTest {

    /**
     * 有序度和逆序度的概念：有序度是数组中具有有序关系的元素对的个数。
     * 有序元素对：a[i] <= a[j], 如果 i < j。
     * 对于一个倒序排列的数组，比如 6，5，4，3，2，1，有序度是 0；对于一个完全有序的数组，比如 1，2，3，4，5，6，有序度就是n*(n-1)/2，我们把这种完全有序的数组的有序度叫作满有序度。
     */
    @Test
    public void sortTest(){
        //定义无序数组
        int[] array = {3,6,2,8,4,5,9,5};

        //冒泡排序
        System.out.println(Arrays.toString(BubbleSort.bubbleSort(array, array.length)));



    }

}