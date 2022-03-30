package company;

import java.util.Arrays;
public class ArrayOps1 {
    public static void main(String[] args) {

        int[]arr= {10,20,15,30,25,60,30};
        System.out.println(Arrays.toString(arr));
       int max = maximum(arr);
        //System.out.println(max);
        // display(arr);
        System.out.println(search(arr,30));

    }
    public static int search(int[]arr,int ele)
    {
      for(int i=0;i<=arr.length-1;i++)
      {
          if(arr[i]==ele);
          {
              return i;
          }

      }
      return -1;
    }

    public static int maximum(int[]arr) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i]){
                max=arr[i];
            }

        }

        return max;
    }

    static public void display(int[] arr)
    {
        for(int val: arr){
            System.out.println(val+" ");
        }
        System.out.println();
    }
}
