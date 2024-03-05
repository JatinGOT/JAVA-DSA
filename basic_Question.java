import java.util.*;

public class basic_Question {
    Scanner sc = new Scanner(System.in);

    static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void calculateSum() {
        // Calculate the sum of all element in array---
        int sum = 0;
        int arr[] = { 5, 4, 6 };
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }

    void calculateMax() {
        // Calculate the max value out of all element in array...
        int arr[] = { 5, 4, 6, 10 };
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }
        System.out.println(ans);
    }

    void searchValue() {
        // Search the given element x in the arrray if present the return the index else
        // return -1
        int arr[] = { 5, 4, 6, 10 };
        int ans = -1;
        int x = 10;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }

    // Taking Array Input in java
    void takingInput() {

        System.out.println("Enter the size of an array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the element of array . ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }
        printarr(arr);
    }

    static void arrayReference() {

        int arr[] = { 5, 4, 6, 10 };
        System.out.println("Current array ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Copied array ");
        // int arr_2[] = arr;
        // int arr_2[] = arr.clone(); // clone method gives new memory to heap and it
        // will make free space to store the value of new copied and array it will not
        // reflect previos array
        int[] arr_2 = Arrays.copyOf(arr, arr.length); // 2 output = 5 6
        // int[] arr_2 = Arrays.copyOfRange(arr, 0, 3);

        arr_2[0] = 1;
        arr_2[1] = 1;
        // printarr(arr); // after changing the value our arr is also changed.....
        printarr(arr); // current arr
        printarr(arr_2); // after cloning an array

    }

    public static void main(String[] args) {

        basic_Question a = new basic_Question();
        // a.calculateSum();
        // a.calculateMax();
        // a.searchValue();
        // a.takingInput();
        a.arrayReference();
    }
}
