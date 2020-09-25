// ConsoleApplication2.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include <cstdio>

int divideBySubtraction(int divisor, int dividend) {
    int quotient;
    for (quotient = 0; dividend > 0; quotient++)
    {
        dividend -= divisor;
    }
    return quotient; 
}

int main()
{
    // Solution 1
    // Multiple all of the numbers together 
    // Divide by the number at the current index
    // Place in the new array 
    // Time Complexity = i^2 (where i is the length of the array of numbers) 
    // Space Complexity = constant
    int numberList[5] = { 1,2,3,4,5 };
    int arrayLength = sizeof(numberList) / sizeof(int); 
    int arrayProduct = numberList[0]; 

    for (int counter = 1; counter < arrayLength;  counter++) {
        arrayProduct *= numberList[counter];
    }

    std::cout << "Solution 1 Results: ";
    for (int counter = 0; counter < arrayLength;  counter++) {
        // Print out the results
        std::cout << arrayProduct / numberList[counter] << " ";
    }

    std::cout << std::endl; 

    // Solution 2 
    // Multiple all the numbers together just like solution 1 
    // Divide by the number at the current index
    // Instead of division, subtraction will be used to simulate division
    // Time complexity = i (for every element) * i (looping through every element again) * constant (the worse case of the product dividing by 1)
    // Space Complexity = constant 
    int newNumberList[5] = { 1,2,3,4,5 };
    int newArrayLength = sizeof(newNumberList) / sizeof(int); 
    arrayProduct = newNumberList[0];

    for (int counter = 1; counter < newArrayLength; counter++) {
        arrayProduct *= newNumberList[counter];
    }

    std::cout << "Solution 2 Results: ";
    for (int counter = 0; counter < newArrayLength; counter++) {
        std::cout << divideBySubtraction(newNumberList[counter], arrayProduct) << " ";
    }

    std::cout << std::endl;
}

