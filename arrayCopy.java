public class arrayCopy {
    static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void changeArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }

        // int arr[] = { 5, 4, 6, 10 };
        // System.out.println("Current array ");
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }
        // System.out.println();
        // System.out.println("Copied array ");
        // int arr_2[] = arr;
        // arr_2[0] = 1;
        // arr_2[1] = 1;
        // // printarr(arr); // after changing the value our arr is also changed.....
        // printarr(arr_2);

    }

    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 5;
        arr[1] = 6;
        arr[2] = 7;
        changeArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
