import java.util.Scanner;

public class PrefixSum {
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    static void makePrefixSum(int arr[]){

        for (int i = 1; i < arr.length; i++) {
         arr[i] = arr[i] + arr[i-1];   
        }
        // return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements  of array ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array ");
        printArray(arr);
        makePrefixSum(arr);
        System.out.println("Prefix sum array");
        printArray(arr);
    }
}
