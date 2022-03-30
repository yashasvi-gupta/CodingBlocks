package company;

import java.util.Arrays;

public class Kadanes {
    public static void main(String[] args) {
     int[] arr={2,-2,-3,4,-5};
        System.out.println(Arrays.toString(arr));
       // System.out.println(Kadanes(arr));
        System.out.println(Kadanes2(arr));
    }
    public static int Kadanes(int[] arr)
    {
        int maxSum= Integer.MIN_VALUE;
        int sum =0;
        for(int i =0; i<arr.length;i++){
            sum=sum+arr[i];

            if(sum > maxSum)
            {
                maxSum=sum;
            }
            if(sum<0)
            {
                sum=0;
            }
        }
         return maxSum;
    }
    public static int Kadanes2(int[]arr)
    {
        int maxSum= Integer.MIN_VALUE;
        int sum =0;
        int maxSi=-1;
        int maxEi=-1;
        int si=0;
        for(int i =0; i<arr.length;i++){
            sum=sum+arr[i];

            if(sum > maxSum)
            {
                maxSum=sum;
                maxSi=-1;
                maxEi=-1;

            }
            if(sum<0)
            {
                si=i+1;
                sum=0;
            }
        }
        for(int i =maxSi; i<=maxEi;i++)
        {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
        return maxSum;
    }
}
