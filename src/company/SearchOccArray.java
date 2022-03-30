package company;

import java.util.Arrays;

public class SearchOccArray {
    public static void main(String[]args){
        int[] arr={10,20,30,40,50,30,90,30};
        System.out.println(Arrays.toString(arr));
        System.out.println(searchalloccurance(arr,30));
    }
    public static int[] searchalloccurance(int[] arr,int ele)
    {
          int count =0;
          for(int i =0;i<=arr.length-1;i++){
              if(arr[i]==ele)
              {
                  count++;
              }
          }
          int[] ans=new int [count];
          int j =0;
          for(int i =0; i<=arr.length-1;i++)
          {
              if(arr[i] == ele)
              {
                  ans[j] = i;
                  j++;
              }
          }
          return ans;
    }
}
