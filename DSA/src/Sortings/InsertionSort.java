package Sortings;

import java.util.Arrays;
//Takes the element and places it at correct index
public class InsertionSort {
    public static void main(String[] args) {
        //int [] arr={1,8,4,22,17,3,2};
        int[] arr={5,4,1,2,8};
        for(int i= 0;i<arr.length;i++){
            int j=i;

            while(j > 0 && arr[j-1] > arr[j]){

                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;

            }
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }
}
