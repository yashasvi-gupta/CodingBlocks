package company;

public class Array1 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        int arr2[] = {5, 4, 3, 2, 1};
        //int a=5 ;
        //int b =7;
      //  for (int val : arr)
        //{
          //  System.out.println(val);
        //}
        System.out.println(arr[0]+" "+arr2[0]);
       // swap(arr[0],arr[1]);
        //swap2(arr,0,1);
        //swap3(arr,arr2);
        swap4(arr,arr2);
        System.out.println(arr[0]+" "+arr2[0]);
        System.out.println(arr+" "+arr);

    }

    public static void swap(int a, int b){
        int t = a;
        a=b;
        b=t;
    }

    public static void swap2(int []arr,int a, int b)
    {
        int t=arr[a];
        arr[a]=arr[b];
        arr[b]=t;

    }
    public static void swap3(int []arr,int []arr2)
    {
        int[]t=arr;
        arr=arr2;
        arr2=t;
    }
    public static void swap4(int []arr,int [] arr2)
    {
        int t= arr[0];
        arr[0]=arr2[0];
        arr2[0]=t;
    }
}