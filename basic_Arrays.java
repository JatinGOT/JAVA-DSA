// import ArrayExample.multiDimensionArrays;

/**
 * basic_Arrays
 */
class ArrayExample {
    void demoArrays() {
        System.out.println("Arrays ...");
        int[] ages = new int[3];
        float[] weights = new float[2];

        ages[0] = 18;
        ages[1] = 20;
        System.out.println(ages[0]);
        System.out.println(ages[1]);

        weights[0] = 18.5f;
        System.out.println(weights[0]);
        // System.out.println(ages[5]);
    }

    void multiDimensionArrays() {
        // int[][] arr_1 = new int[5][3];
        int[][] arr = { { 56, 43, 6 }, { 34, 7, 8 }, { 8, 9, 5 } };
        // System.out.println(arr[0][0]);
        // System.out.println(arr[0][1]);
        // System.out.println(arr[0][2]);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }

        }

    }

}

/**
 * Innerbasic_Arrays
 */

public class basic_Arrays {

    public static void main(String[] args) {
        ArrayExample obj = new ArrayExample();
        obj.demoArrays();
        obj.multiDimensionArrays();

    }
}