package Sortings;

import java.util.Arrays;


public class QuickSort {
    public static int partition(int[] arr,int low,int high){
        int pivot=arr[low];
        int i = low , j = high;

        while(i < j){

            while(arr[i] <= pivot && i <= high - 1)     i++;

            while(arr[j] > pivot && j >= low + 1)       j--;

            if(i<j) {

                int temp = arr[i];

                arr[i] = arr[j];

                arr[j] = temp;
            }

        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;

    }
    public static void quickSort( int[] arr,int low,int high){

      if(low<high){

          int pidix=partition(arr,low,high);

       quickSort(arr,low,pidix-1);

       quickSort(arr,pidix+1,high);

      }
    }
    public static void main(String[] args) {

        int[] arr=new int[]{6,3,9,5,2,8};

        quickSort( arr ,0, arr.length-1 );

        System.out.println(Arrays.toString(arr));

    }
}
