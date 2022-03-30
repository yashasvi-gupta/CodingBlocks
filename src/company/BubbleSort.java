package company;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
     int[]arr={5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        Bubblesort(arr);
    }
    public static void Bubblesort(int[]arr) {
        for (int i = 0; i <= arr.length - 2; i++) {

              //int swap=0;
            for (int j = 0; j <= arr.length - 2; j++) {
                if (arr[j] > arr[j + 1]) {
               //     swap++;
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
           // if(swap==0){
             //   break;
            //}
            System.out.println(Arrays.toString(arr));
        }
    }}

