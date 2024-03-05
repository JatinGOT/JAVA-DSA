public class basic_Question2 {
//occurrance of given element 
    static void occ(int arr[]) {
        int x = 5;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        System.out.println(x + " is occured " + count + " times ");
    }

    static int Lastocc(int arr[], int x) {
        int lastIndex = -1;
        // int x = 5;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                lastIndex = i;
            }
        }
        // System.out.println(lastIndex);
        return lastIndex;
    }

    static void greaterOccurance(int arr[]) {
        int x = 5;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>x) {
                count++;
            }
        }
        System.out.println("only "+count+" greater");
    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 5, 1, 5 ,8};
        occ(arr);
        // Last occurent Question
        int x = 5;
        System.out.println("Last Occurence of x is " + Lastocc(arr, x));

        // count the number of element strictly greater than value x.
        greaterOccurance(arr);




    }
}
