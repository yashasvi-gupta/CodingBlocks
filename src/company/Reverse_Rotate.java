package company;

import lec_40.Parent;

import java.util.Arrays;

public class Reverse_Rotate {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
       // System.out.println(Arrays.toString(arr));
        //reverse(arr);
        //System.out.println(Arrays.toString(arr));
        rotate(arr,1);

    }


    public static void reverse(int[]arr)

    {
         int li=0;
         int hi=arr.length-1;
         while(li<hi)
         {
             swap2(arr,li,hi);
             li+=1;
             hi-=1;
         }
    }
    public static void reversePart(int[]arr){

    }
        public static void rotate(int[]arr,int k)
        {
            int temp = arr[arr.length-1];
            for(int i = arr.length-1;i>-1;i++)
            {
                arr[i] =arr[i-1];

            }
            arr[0] = temp;
            System.out.println(Arrays.toString(arr));
        }

    public static void swap2(int arr[],int a, int b)
    {
        int t = arr[a];
        arr[a]=arr[b];
        arr[b]=t;
    }
}
