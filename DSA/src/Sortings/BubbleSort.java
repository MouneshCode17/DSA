package Sortings;

import java.util.Arrays;


/// Pushes the maximum to the last by adjacent swaps
public class BubbleSort {
    public static void main(String[] args) {
    int count=0;
        int[] arr={8,5,2,1,3}; //28 times n(n-1)/2

        int n = arr.length;
        System.out.println(Arrays.toString(arr));
      //  int[] arr={1, 2, 4, 6, 24, 28, 55, 99};
        for(int i= n-1 ;i >= 0;i--){
            int temp=0;

            for(int j = 0;j <= i-1;j++){

                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                else if(arr[i]<=arr[j])  continue;
            }
        }
        System.out.println(Arrays.toString(arr));
       // System.out.println(count);
    }
}
