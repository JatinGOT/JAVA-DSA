import java.util.Scanner;

public class ArrayManipulation {
    static int findUnique(int arr[]) {
        int n = arr.length;
        // [1,2,1]
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                ans = arr[i];
            }
        }
        return ans;
    }

    static int findMax(int[] arr) {
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        return mx;
    }

    static int findSecMax(int arr[]) {
        int mx = findMax(arr);
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == mx) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax = findMax(arr);
        return secondMax;
    }

    static int firstRepNo(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) { // find first no
            for (int j = i + 1; j < arr.length; j++) { // find second no
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the " + n + " of array ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Element of array ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // Find the unique number in a given array value all the elements are being
        // repeated twice and one being uniue
        // [1,2,3,4,2,1,3]
        // o/p [4] is the unique value

        // System.out.println("Unique element : " + findUnique(arr));

        // Find the second largest element in array
        // [9,8,9,6,9,5,8]
        // [8];
        System.out.println();
        System.out.println("Maximum value " + findMax(arr));
        System.out.println("Second Maximum value " + findSecMax(arr));

        // find value that is first repeating in array if no value is being repeat
        // return -1;
        // [1,5,3,4,6,3,4]
        // o/p = 3
        System.out.println();
        System.out.println("Repeating value is : " + firstRepNo(arr));
    }
}
