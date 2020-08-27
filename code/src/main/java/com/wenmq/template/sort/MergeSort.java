package com.wenmq.template.sort;

public class MergeSort {

    public void mergeSort(int[] arr) {
        int[] temp = new int[arr.length];
        internalMergeSort(arr, temp, 0, arr.length - 1);
    }

    private void internalMergeSort(int[] arr1, int[] temp, int left, int right) {
        if (left >= right) return;
        int mid = left + ((right - left) >> 1);
        internalMergeSort(arr1, temp, left, mid);
        internalMergeSort(arr1, temp, mid + 1, right);
        mergeSortedArray(arr1, temp, left, mid, right);
    }

    private void mergeSortedArray(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= right) {
            temp[k++] = arr[i] < arr[j] ? arr[i++] : arr[j++];
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j < right) {
            temp[k++] = arr[j++];
        }
        for (i = 0; i < k; i++) {
            arr[left + i] = temp[i];
        }

    }


}
