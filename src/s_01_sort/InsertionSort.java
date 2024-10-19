package s_01_sort;

import tools.PrintArr;

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        if (arr.length <= 1 || arr == null) {
            return;
        }

        for (int i = 1; i < arr.length; i++) {//0-i上有序
            for (int j = i-1;j >= 0 && arr[j] > arr[j+1];j--){
                swap(arr,j,j+1);
            }
        }

    }
    public static void swap(int[] arr, int j, int i){
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

    public static void main(String[] args) {
        int[] arr = {1,2,9,3,6,3,4};
        insertionSort(arr);
        PrintArr.PrintArr(arr);
    }

}
