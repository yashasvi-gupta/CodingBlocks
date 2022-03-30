package company;

public class SubArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println();
        subArrayPrint(arr);
        System.out.println();
        subArrayPrintSum2loop(arr);


       // for (int i = 0; i <= 3; i++) {
           // System.out.println(arr[i] + " ");
        }

        //subArrayPrint(arr);
        //subArrayPrintSum3loop(arr);



    public static void subArrayPrint(int[] arr) {
        for (int si = 0; si < arr.length; si++) {
            for (int ei = si; ei < arr.length; ei++) {
                // System.out.println("("+si+" "+ei+")");
                for (int k = si; k <= ei; k++) {
                    System.out.println(arr[k] + " ");
                    System.out.println();
                }
            }
        }
    }

    public static void subArrayPrintSum3loop(int[] arr) {
        for (int si = 0; si < arr.length; si++) {
            for (int ei = si; ei < arr.length; ei++) {

                int sum=0;
                for (int k = si; k <= ei; k++) {
                    System.out.println(arr[k] + " ");
                    sum = sum + arr[k];
                }

                    System.out.println("-----"+sum);
                }
            }
        }
    public static void subArrayPrintSum2loop(int[] arr) {
        for (int si = 0; si < arr.length; si++) {


                int sum=0;
              for(int ei = si ; ei< arr.length ;ei++) {

                    sum = sum + arr[ei];
                  System.out.println(sum);
                }



        }
    }

    }



