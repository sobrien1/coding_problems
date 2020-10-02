import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class App {

    // Solution to 9/23 Problem A Day
    // Given an array of numbers, return whether any two numbers
    // add up to a k 
    //
    // 2 solutions
    // Where k = number we are trying to match to
    // x = list
    // and i = length of list
    // x = {x1, x2, x3 .... xi} where true is returned for when two list entries return k

    public static void main(String[] args) throws Exception {
        Integer[] numberArray = new Integer[]{-15,-5,-3,2,1,16,32};
        ArrayList<Integer> numberList = new ArrayList<Integer>(Arrays.asList(numberArray));
        Integer matchingNumber = 17; 

        // Error checking 
        if (numberList.size() <= 1) {
            System.out.println("The list of numbers it not long enough.");
        } else {

            // Solution 1: 
            // Bubble sort type solution 
            // Only compare an item to data further in the array
            // Time complexity == n-1, n-2, n-3, n-4 ..... = n(n+1)/2
            boolean matchFound = false; 

            for (int a=0; a < numberList.size(); a++)
            {
                for (int b=a+1; b < numberList.size(); b++)
                {
                    if (numberList.get(a)+numberList.get(b) == matchingNumber)
                    {
                        System.out.println(String.format("Matches were found between %d and %d",numberList.get(a), numberList.get(b))); 
                        matchFound = true; 
                    }
                }
            }
            String result = (matchFound) ? "found" : "not found"; 
            System.out.println(String.format("Using solution 1, a match was %s\n", result)); 

            // Solution 2 
            // HashSet 
            // On one iteration, place the number number needed to add up
            // to the matching number in the array. If this number matches
            // an existing entry in the hashSet, a match was found.
            // Time Complexity = O(n) (iterating through the array)
            // Space Complexity = O(n)
            Set<Integer> hash = new HashSet<Integer>();
            matchFound=false; 
            for (int a=0; a<numberList.size(); a++)
            {
                Integer current=numberList.get(a); 
                Integer remaining=matchingNumber - current; 
                if (hash.contains(current)){
                    System.out.println(String.format("Matches were found between %d and %d", numberList.get(a), matchingNumber - numberList.get(a))); 
                }
                hash.add(remaining); 
            }
        }
    }
}
