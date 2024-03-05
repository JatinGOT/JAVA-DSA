import java.util.Scanner;

public class ArrayTargetSumQuestion {

    // static void input() {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter the length of array : ");
    // int n = sc.nextInt();
    // int arr[] = new int[n];
    // System.out.println("Enter the " + n + " of arrary ");
    // for (int i = 0; i < arr.length; i++) {
    // arr[i] = sc.nextInt();
    // }
    // System.out.println("Element of array ");
    // for (int i = 0; i < arr.length; i++) {
    // System.out.print(arr[i] + " ");
    // }
    static int targetSum(int array[], int k) {
        int n = array.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] + array[j] == k) {
                    ans++;
                }
            }
        }

        return ans;
    }

    static int tripletsSum(int array[], int k) {
        int n = array.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int u = j + 1; u < n; u++) {

                    if (array[i] + array[j] + array[u] == k) {
                        ans++;
                    }
                }
            }

        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // System.out.println("Enter the " + n + " of arrary ");
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();
        // }
        // System.out.println("Element of array ");
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }
        // ---- Targest Question ---
        // Question : Find the total number of pair in Array where sum is equal to the
        // given value x;

        int array[] = { 3, 4, 5, 1, 2, 4 };
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int k = 7;
        System.out.println();
        System.out.println("There are " + targetSum(array, k) + " Pairs of " + k + " in an array");

        // Question 2 : Find the total number of triplets in Array where sum is equal to
        // the
        // given value x;

        System.out.println("There are " + tripletsSum(array, k) + " triplets of " + k + " in an array");

    }
}
