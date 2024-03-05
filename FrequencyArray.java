import java.util.*;

public class FrequencyArray {

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static int[] makeFrequencyArray(int [] arr){
        int []freq = new int[10005];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;

        }
        return freq;
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

        int [] freq = makeFrequencyArray(arr);
        System.out.println("Enter Number of  Queries : ");
        int q = sc.nextInt();
        while (q>0) {
            System.out.println("Enter number to be searched");
            int x = sc.nextInt();
            if(freq[x]>0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            q--;         
        }
    }
}
