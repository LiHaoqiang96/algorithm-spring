package com.xust.algorithm.sort;

/**
 * 堆排序(选择排序)
 */
public class Heap_Sort_04 {

    public static void HeapSort(int[] array) {

        // 1. 创建最大堆：从最后一个节点的父节点开始
        int lastIndex = array.length - 1;
        int startIndex = (lastIndex - 1) / 2;
        for (int i = startIndex; i >= 0; i--) {
            maxHeap(array, array.length, i);
        }
        // 2. 排序：末尾与头交换，逐一找出最大值，最终形成一个递增的有序序列
        for (int i = array.length - 1; i > 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            maxHeap(array, i, 0);
        }
    }

    private static void maxHeap(int[] data, int heapSize, int index) {
        // 左子节点
        int leftChild = 2 * index + 1;
        // 右子节点
        int rightChild = 2 * index + 2;
        // 最大元素下标
        int largestIndex = index;
        // 分别比较当前节点和左右子节点，找出最大值
        if (leftChild < heapSize && data[leftChild] > data[largestIndex]) {
            largestIndex = leftChild;
        }
        if (rightChild < heapSize && data[rightChild] > data[largestIndex]) {
            largestIndex = rightChild;
        }
        // 如果最大值是子节点，则进行交换
        if (largestIndex != index) {
            int temp = data[index];
            data[index] = data[largestIndex];
            data[largestIndex] = temp;
            // 交换后，其子节点可能就不是最大堆了，需要对交换的子节点重新调整
            maxHeap(data, heapSize, largestIndex);
        }
    }

    public static void main(String[] args) {

        int[] array = {1, 8, 6, 2, 5, 4, 7, 3};
        HeapSort(array);
        for (int i : array) {
            System.out.print(i + "  ");
        }

    }

}
