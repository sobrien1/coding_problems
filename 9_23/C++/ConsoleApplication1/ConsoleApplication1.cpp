/*
// ConsoleApplication1.cpp : This file contains the 'main' function. Program execution begins and ends there.
// Solution to 9/23 Problem A Day
// 2solutions
// Where k = number we are trying to match to
// x = list
// and i = length of list
// x = {x1, x2, x3 .... xi} where true is returned for when two list entries return k
*/

#include <iostream>
#include <unordered_set>

int main()
{
    // Solution #1 
    // Bubble Sort Type Solution
    // Each number is only compared with the elements in front of them
    // Complexity Analysis (where i = length of numberList) = i-1, i-2, i-3, i-4, i-5 ..... i*(i+1)/2 
    int numberList[] = { -1,-5,-6,8,12,15,17 };
    int length = sizeof(numberList) / sizeof(int);
    bool match = false;
    int matchingNumber = 2;
    for (int counter = 0; counter < length; counter++) {
        // Only check for matches with the proceeding elements
        for (int innerCounter = counter + 1; innerCounter < length; innerCounter++) {
            printf("Determining if %d and %d sum to %d\n",
                numberList[counter], numberList[innerCounter], matchingNumber); 
            if (numberList[counter] + numberList[innerCounter] == matchingNumber) {
                printf("Match is found! %d and %d sum to %d\n", numberList[counter], numberList[innerCounter], matchingNumber);
                match = true;
                break;
            }
        }
        if (match == true) break;
    }
    
    printf("Ending Solution #1\n\n");

    // Solution #2
    // Use a hash map lookup based on the number that is needed to sum to the matching number
    // Each number is subtracted from the matching number. That is used as a lookup 
    // Complexity Analysis (where i = length of number list) = 1 + 1 + 1 + 1 .... i
    std::unordered_set <int> hashNumberList;
    for (int counter = 0; counter < length; counter++) {
        int missingPairNumber = matchingNumber - numberList[counter]; 
        printf("Searching for a match for %d \n", numberList[counter]);
        if (hashNumberList.find(missingPairNumber) != hashNumberList.end()) {
            printf("Match is found! %d and %d sum to %d\n", numberList[counter], missingPairNumber, matchingNumber);
            match = true;
            break;
        }
        hashNumberList.insert(numberList[counter]);
    }
}

