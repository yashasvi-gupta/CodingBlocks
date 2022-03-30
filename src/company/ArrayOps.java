package company;

import java.util.Scanner;

public class ArrayOps {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] ar = takeInput();
        System.out.println("---------");
        display(ar);

    }

    public static int[] takeInput() {

        System.out.println("Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "];");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void display(int[] arr) {
        for (int val : arr) {
            System.out.println(val);
        }
    }
}

