package com.wenmq.template.sort;

public class BubbleSort {


    public void bubbleSort(int[] arr) {
        int temp = 0;
        boolean swap;
        for (int i = arr.length - 1; i > 0; i--) {
            swap = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
    }
}
