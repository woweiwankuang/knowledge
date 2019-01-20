package com.mytest.demo.algorithm;

/**
 * 归并排序：如果要排序一个数组，我们先把数组从中间分成前后两部分，然后对前后两部分分别排序，再将排好序的两部分合并在一起
 * 时间复杂度：nlogn
 * 基于比较
 * 空间复杂度：n
 * 不是原地排序
 * 稳定的算法
 * 最好情况时间复杂度：nlogn
 * 最坏情况时间复杂度：nlogn
 */
public class MergeSort {

    //归并排序
    public static int[] mergeSort(int[] array, int n) {
        mergeSortSub(array, 0, n - 1);
        return array;
    }

    //归并排序递归调用函数
    private static void mergeSortSub(int[] array, int p, int r) {
        // 递归终止条件
        if (p >= r) return;
        // 取 p 到 r 之间的中间位置 q
        int q = (p + r) / 2;
        // 分治递归
        mergeSortSub(array, p, q);
        mergeSortSub(array, q + 1, r);
        // 将 A[p...q] 和 A[q+1...r] 合并为 A[p...r]
        merge(array, p, q, r);
    }

    //合并
    private static void merge(int[] array, int p, int q, int r) {
        int i = p, j = q + 1, k = 0; // 初始化变量 i, j, k
        int[] tmp = new int[r - p + 1]; // 申请一个大小跟 A[p...r] 一样的临时数组
        while (i <= q && j <= r) {
            if (array[i] <= array[j]) {
                tmp[k++] = array[i++];
            } else {
                tmp[k++] = array[j++];
            }
        }

        // 判断哪个子数组中有剩余的数据
        int start = i, end = q;
        if (j <= r) {
            start = j;
            end = r;
        }

        // 将剩余的数据拷贝到临时数组 tmp
        while (start <= end) {
            tmp[k++] = array[start++];
        }

        // 将 tmp 中的数组拷贝回 A[p...r]
        for (i = 0; i <= r - p; i++) {
            array[p + i] = tmp[i];
        }


    }

    //合并函数借助哨兵简化方法
    //传入的后两个数组各在尾部多放一个和原有最后值相同的值。 循环改为：
//    while (i <= q || j <= r) {
//        if (array[i] <= array[j] && i <= q) {
//            tmp[k++] = array[i++];
//        } else {
//            tmp[k++] = array[j++];
//        }
//    }
    //可以在while循环里完成两个数组的清空，不需要专用部分完成。

}
