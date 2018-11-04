package com.mytest.demo.algorithm;

/**
 * 插入排序：将数组中的数据分为两个区间，已排序区间和未排序区间。初始已排序区间只有一个元素，就是数组的第一个元素。插入算法的核心思想是取未排序区间中的元素，在已排序区间中找到合适的插入位置将其插入，并保证已排序区间数据一直有序。重复这个过程，直到未排序区间中元素为空，算法结束。
 * 时间复杂度：n平方
 * 基于比较
 * 空间复杂度：1
 * 是原地排序
 * 是稳定的算法（对于值相同的元素，我们可以选择将后面出现的元素，插入到前面出现元素的后面
 * 最好情况时间复杂度：n
 * 最坏情况时间复杂度：n的平方
 */
public class InsertionSort {

    // 插入排序，a 表示数组，n 表示数组大小
    public static int[] insertionSort(int[] array, int n) {
        if (n > 1) {
            for (int i = 1; i < n; ++i) {
                int value = array[i];
                int j = i - 1;
                // 查找插入的位置
                for (; j >= 0; --j) {
                    if (array[j] > value) {
                        array[j + 1] = array[j];  // 数据移动
                    } else {
                        break;
                    }
                }
                array[j + 1] = value; // 插入数据
            }
        }
        return array;
    }

}
