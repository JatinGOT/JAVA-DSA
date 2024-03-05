public class ArrayQuestion3 {
    public static void main(String[] args) {
        
        // Question : Given 2 integer a and b Swap the 2 Given value using temp variable
        // int a = 6;
        // int b = 7;
        // int temp = a;
        // a = b;
        // b = temp;
      

        // Another approach 

        int a = 9;
        int b = 6;
        a = a + b ; // a = 9 + 6 = 15 
        b = a - b ; // b = 15 - 6 = 9 
        a = a - b ; // a = 15 - 9 = 6  
        System.out.println("A value is : "+a);
        System.out.println("B value is : "+b);


    }
}
