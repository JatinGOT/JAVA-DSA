public class ReverseAnArray {

    static int[] revArray(int arr[]) {
        int j = 0;
        int ans[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            ans[j++] = arr[i];
        }
        return ans;

    }

    static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // -----------------------------------------
    static void swapInArray(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    
    static void ReversedArray(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            swapInArray(arr, i, j);
            i++;
            j--;

        }
    }

    public static void main(String[] args) {

        // System.out.println("Sorted Array ");
        int arr[] = { 1, 2, 3, 4, 5 };
        printArr(arr);
        // int [] ans = revArray(arr);
        // System.out.println("Reversed Array ");
        // for (int i = 0; i < ans.length; i++) {
        // System.out.print(ans[i]+" ");
        // }

        // Approach 2 : implace : without take another array modify given array
        System.out.println("Reversed Array ");
        ReversedArray(arr);
        printArr(arr);

    }
}
