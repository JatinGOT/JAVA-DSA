import java.util.Scanner;

public class twoPointer {

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    static void sortArrayzeroes(int arr[]) {
        int n = arr.length;
        int zeroes = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zeroes++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (i < zeroes) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }

    static void AlternateApproach(int arr[]) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }

            if (arr[left] == 0) {
                left++;
            }

            if (arr[right] == 1) {
                right--;
            }

        }

    }
    static void oddEvenComes(int arr[]){
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if (arr[left] %2==1 && arr[right]%2 == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }

            if (arr[left]%2 == 0) {
                left++;
            }

            if (arr[right]%2 == 1) {
                right--;
            }

        }

    }

    static void ReversedArray(int[] arr) {
         int i = 0; int j = arr.length - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;

        }
    }
    static int [] sortSquares(int []arr){
        int n =arr.length;
        int left = 0,right = n-1;
        int [] ans = new int[n];
        int k = 0;
        while (left<=right) {
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k++]=arr[left]*arr[left];
                left++;
            }
            else{
                ans[k++]=arr[right]*arr[right];
                right--;
            }
        }
        
        return ans;

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

        // Sort an array consisting of only 0s and 1s;
        // -------------------------------------------- Print karna jb karana ho...
        // sortArrayzeroes(arr);
        // System.out.println("SORTED ARRAY ");
        // printArray(arr);
        // --------------------------------------------------------------------------

        // Alternate Approach

        // -------------------------------------------- Print karna jb karana ho...
        // AlternateApproach(arr);
        // System.out.println("SORTED ARRAY ");
        // printArray(arr);
        // --------------------------------------------------------------------------


        // all even number comes first then odd one comes....
        // 1 2 3 4 5 
        // 2 4 1  3 5 ;

        // ------------------------------
        // oddEvenComes(arr);
        // System.out.println("first Odd Number then Even Numbers ");
        // printArray(arr);
        // -------------------------------------

        int [] ans = sortSquares(arr);
        ReversedArray(ans);
        System.out.println("Array after a non decreasing order ");
        printArray(ans);
    

        
    }
}
