import java.util.*;

public class rotateAnArray {
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] rotateArray(int arr[], int k) {
        int n = arr.length;
        int j = 0;
        k = k % n;
        int ans[] = new int[n];
        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];

        }
        return ans;

    }

    static void ReversedArray(int[] arr, int i, int j) {
        while (i < j) {
            swapInArray(arr, i, j);
            i++;
            j--;
        }
    }

    static void swapInArray(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void rotateInPlace(int[] arr, int k) {
        int n = arr.length; 
        k = k % n; 
        ReversedArray(arr, 0, n - k - 1);
        ReversedArray(arr, n - k, n - 1);
        ReversedArray(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a size of an array ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter " + n + " of an array ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Values of array ");
        printArray(arr);

        System.out.println("Enter K : ");
        int k = sc.nextInt();
        // int[] ans = rotateArray(arr, k);
        // printArray(ans);

        // Rotate Array without using another array
        rotateInPlace(arr, k);
        printArray(arr);

    }
}
