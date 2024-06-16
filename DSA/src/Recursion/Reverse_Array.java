package Recursion;


import java.util.Arrays;

public class Reverse_Array {

    public static void reverse(int[] arr,int left,int right){

        if(left>=right) return;

        arr[left] = arr[left] ^ arr[right];
        arr[right] = arr[left] ^ arr[right];
        arr[left] = arr[left] ^ arr[right];

        reverse(arr,left+1,right-1);



    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,8,9};

        reverse(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));

    }
}
