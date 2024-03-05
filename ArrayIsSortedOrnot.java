import java.lang.reflect.Array;
import java.util.*;

public class ArrayIsSortedOrnot {
    static boolean isSorted(int arr[]) {
        boolean check = true;
        for (int i = 1; i < arr.length; i++) {
            // not sorted
            if (arr[i] < arr[i - 1]) {
                check = false;
                break;
            }
        }
        return check;
    }

    static int kthSmallestElement(int arr[], int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }

    static int kthLargestElement(int arr[], int k, int n) {
        Arrays.sort(arr);
        return arr[n - k];
    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 8, 10, 19 };
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Smallest Element : " + arr[0]);
        System.out.println("Largest element : " + arr[n - 1]);
        // System.out.println("Is Sorted "+isSorted(arr));

        // kth smallest / largest elemet in unsorted Array
        int k = 2;
        System.out.println("Kth smalllest element " + kthSmallestElement(arr, k));
        System.out.println("kth Largest element " + kthLargestElement(arr, k, n));

    }
}
