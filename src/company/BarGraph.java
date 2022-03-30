package company;

public class BarGraph {
    public static void main(String[] args) {
        int[]arr={2,3,7,1,5,4};
        System.out.println(arr);
        bargraph(arr);

    }

    public static void bargraph(int[]arr)
    {
        int max= maximum(arr);
        int row=1;
        while(row<=max)
        {
            //self work
            for(int i =0; i<arr.length;i++)
            {
                if(max-arr[i]<row )
                {
                    System.out.println("* ");
                }
                else
                {
                    System.out.println(" ");
                }
            }
            //updation
            row++;
            System.out.println();
        }


    }
    public static int maximum(int[]arr) {
       // int max = Integer.MIN_VALUE;
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i]){
                max=arr[i];
            }

        }

        return max;
    }
}
