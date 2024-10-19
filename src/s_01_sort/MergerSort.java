package s_01_sort;

import tools.PrintArr;

public class MergerSort {
    private static void MergerSort(int[] arr, int L , int R){
        if(L==R){
            return;
        }
        int mid = L + ((R-L)>>1);
        MergerSort(arr,L,mid);
        MergerSort(arr,mid+1,R);
        merge(arr, L, mid, R);
    }

    private static void merge(int[] arr, int l, int mid, int r) {
        //辅助数组
        int[] help = new int[r - l + 1];
        int i = 0;
        int p1 = l;
        int p2 = mid + 1;
        while (p1 <= mid && p2 <= r){
            help[i++] = arr[p1] <= arr[p2] ? arr[p1++] : arr[p2++];
        }
        while (p1 <= mid){
            help[i++] = arr[p1++];
        }
        while (p2 <= r){
            help[i++] = arr[p2++];
        }
        for (i = 0; i < help.length ; i++){
            arr[l+i] = help[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,9,3,6,3,4};
        MergerSort(arr,0, arr.length-1);
        PrintArr.PrintArr(arr);
    }

}
