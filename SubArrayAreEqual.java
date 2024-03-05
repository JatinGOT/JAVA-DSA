import java.util.Scanner;

public class SubArrayAreEqual {
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    static int PrefixSum(int arr[]) {
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        return totalSum;
    }

    static boolean equalSumPart(int arr[]) {
        int pref = 0;
        int totalSum = PrefixSum(arr);
        for (int i = 0; i < arr.length; i++) {
            pref += arr[i];
            int suffix = totalSum - pref;
           
            if(pref == suffix){
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements");
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        // System.out.println(PrefixSum(arr));
        System.out.println(equalSumPart(arr));

    }
}
