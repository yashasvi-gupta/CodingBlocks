package company;

public class Array {
    public static void main(String[] args) {
        int [] arr=null;
        System.out.println(arr);
        arr= new int[5];
        System.out.println(arr);

       // int arr1[]=arr;
        //arr1[0]=100;
        //System.out.println(arr1);
        //System.out.println(arr[0]);
        System.out.println(arr.length);
        System.out.println("--FOR LOOP------");
        int sum=0;

        for(int i=0;i <=arr.length-1 ;i++){
            sum= sum+arr[i];
            System.out.println(arr[i]);
            System.out.println(sum);
        }
        System.out.println("--FOR EACH LOOP");
        for(int val: arr)
        {
            System.out.println(val);
            val=100;
        }
        System.out.println("----FOR LOOP");
        for(int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i]);
        }
        int [] oth = new int[3];
        oth=arr;
    }
}
