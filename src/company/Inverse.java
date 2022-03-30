package company;

import java.util.Arrays;

public class Inverse {
    public static void main(String[] args) {
        int []arr={1,2,3,4,0};
        int[]res=inverse(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(res));

    }

    public static int[] inverse(int[]arr){
        int[]res=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            res[arr[i]]=i;

        }
        return res;
    }
}
