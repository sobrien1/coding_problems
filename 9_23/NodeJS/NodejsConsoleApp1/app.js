'use strict';
Console.log("Hello");

// Solution to 9/23 Problem A Day 
// 3 solutions
// Where k = number we are trying to match to
// x = list 
// and i = length of list 
// x = {x1, x2, x3 .... xi} where true is returned for when two list entries return k

var numberList; 
var matchingNumber; 
var match; 

// Solution #1 
// Bubble Sort Type Solution
// Each number is only compared with the elements in front of them
numberList = { 1, 2, 3, 4, 5};
match = false;
for (var counter = 0; counter < numberList.length; counter++) {
    for (var innerCounter = counter + 1; innerCounter < numberList.length; innerCounter++) {
        Console.log("Determining if " + numberList[counter] + " and " + numberList[innerCounter] + " sum to " + matchingNumber); 
        if ((numberList[counter] - numberList[innerCounter]) == matchingNumber) {
            Console.log("MATCH FOUND!"); 
            match = true; 
        }
    }
}

