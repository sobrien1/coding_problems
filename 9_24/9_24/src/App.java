import java.util.ArrayList;
import java.util.Arrays;

// 9_24 practice problem
// Given an array of integers, return a new array such that each element at index i of the new array is the product of all the
// numbers in the original array except the one at i.
// For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was 
// [3, 2, 1], the expected output would be [2, 3, 6].
// Follow-up: what if you can't use division?
public class App {
    public static void main(String[] args) throws Exception {
        Integer[] number1Array = {1,2,3,4,5}; 
        Integer[] number2Array = {3,2,1}; 
        ArrayList<Integer> numberList1 = new ArrayList<Integer>(Arrays.asList(number1Array)); 
        ArrayList<Integer> numberList2 = new ArrayList<Integer>(Arrays.asList(number2Array)); 

        System.out.println(" Solution 1:"); 
        sol_1(numberList1); 
        sol_1(numberList2); 

        System.out.println(" Solution 2:"); 
        sol_2(numberList1); 
        sol_2(numberList2);
    }

    public static void sol_1(ArrayList<Integer> numberList) {
        ArrayList<Integer> productList = new ArrayList<Integer>(); 
        Integer product = 1; 
        System.out.println(String.format("Number Array: %s", numberList.toString())); 

        // Error checking 
        if (numberList.size() <= 1) {
            System.out.println ("The array is not long enough"); 
        }

        // Solution 1: 
        // Multiply all of the numbers together to get the product of the array 
        // Divide the product by the value at the index to get the product array
        for(int i=0; i<numberList.size(); i++) {
            product *= numberList.get(i); 
        }
 
        for(int i=0; i<numberList.size(); i++) {
            productList.add(product/numberList.get(i)); 
        }

        System.out.println(String.format("Product array: %s\n\n", productList.toString())); 
    }

    public static void sol_2(ArrayList<Integer> numberList) {
        ArrayList<Integer> productList = new ArrayList<Integer>(); 
        Integer product = 1; 
        System.out.println(String.format("Number Array: %s", numberList.toString())); 

        // Error checking 
        if (numberList.size() <= 1) {
            System.out.println ("The array is not long enough"); 
        }

        // Solution 2: 
        // Multiply all of the numbers together to get the product of the array 
        // Divide the product by the value at the index to get the product array
        // This time do not use division
        for(int i=0; i<numberList.size(); i++) {
            product *= numberList.get(i); 
        }
 
        for(int i=0; i<numberList.size(); i++) {
            productList.add(no_division(product,numberList.get(i))); 
        }

        System.out.println(String.format("Product array: %s\n\n", productList.toString())); 
    }

    public static int no_division(int dividend, int divisor) { 
        int product = 0; 
        while (dividend != 0) { 
            dividend -= divisor;
            product++; 
        }

        return product; 
    }
}
