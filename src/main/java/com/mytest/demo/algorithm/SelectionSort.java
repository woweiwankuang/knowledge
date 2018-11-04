package com.mytest.demo.algorithm;

/**
 * 选择排序：分已排序区间和未排序区间。但是选择排序每次会从未排序区间中找到最小的元素，将其放到已排序区间的末尾。
 * 时间复杂度：n平方
 * 基于比较
 * 空间复杂度：1
 * 是原地排序
 * 不是稳定的算法
 * 最好情况时间复杂度：n的平方
 * 最坏情况时间复杂度：n的平方
 */
public class SelectionSort {

    public static int[] selectionSort(int[] array, int n) {
        if (n > 1) {
            for (int i = 0; i < n; i++) {
                int needSwapIndex = i;//需要交换的下标
                for (int j = i + 1; j < n; j++) {
                    if (array[j] < array[needSwapIndex]) {
                        needSwapIndex = j;
                    }
                }
                if (needSwapIndex != i) {
                    int tmp = array[i];
                    array[i] = array[needSwapIndex];
                    array[needSwapIndex] = tmp;
                }
            }
        }
        return array;
    }

}
