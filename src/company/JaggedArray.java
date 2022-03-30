package company;

import java.util.Arrays;

public class JaggedArray {
    public static void main(String[] args) {
        int[][] arr=new int[3][];
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        int[] a= new int[3];
        arr[0]=a;
        //arr[0]=new int[3];
        arr[1]=new int [2];
        arr[2]=new int[5];
        System.out.println(arr[0]);
        arr[0] = new int[4];




        //System.out.println(Arrays.toString(arr[0]));
        //System.out.println(arr[1]);
        //System.out.println(Arrays.toString(arr[1]));
        for(int row =0; row< arr.length;row++)
        {
            for(int col=0;col<arr[row].length;col++)
            {
                System.out.println(arr[row][col] +" ");
            }
            System.out.println();

        }
        System.out.println("-------------");
        for(int[] val: arr)
        {
            for(int x:val)
            {
                System.out.println(x+" ");
            }
            System.out.println();
        }
    }
}
