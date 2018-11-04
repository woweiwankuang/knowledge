package com.mytest.demo.algorithm;

/**
 * 冒泡排序
 * 时间复杂度：n平方
 * 基于比较
 * 空间复杂度：1
 * 是原地排序
 * 是稳定的算法（比较时，等于的情况不做交换
 * 最好情况时间复杂度：n
 * 最坏情况时间复杂度：n的平方
 */
public class BubbleSort {

    // 冒泡排序，a 表示数组，n 表示数组大小
    public static int[] bubbleSort(int[] array, int n) {
        if (n > 1) {
            for (int i = 0; i < n; ++i) {
                // 提前退出冒泡循环的标志位
                boolean flag = false;
                for (int j = 0; j < n - i - 1; ++j) {
                    if (array[j] > array[j + 1]) { // 交换
                        int tmp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = tmp;
                        flag = true;  // 表示有数据交换
                    }
                }
                if (!flag) break;  // 没有数据交换，提前退出
            }
        }
        return array;
    }




}
