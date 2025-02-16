# Exercises Java Program

## Overview
This Java program provides a set of utility functions for performing various mathematical operations such as summing integers, computing factorials, raising numbers to a power, summing elements in a list, calculating arithmetic mean and standard deviation, and working with even numbers. Additionally, it includes a method to compute the dot product of two lists.

## Features
- **Summation of Integers (`sumInt`)**: Computes the sum of all integers from 0 to `n`.
- **Factorial Calculation (`factorialInt`)**: Computes the factorial of a given integer `n`.
- **Power Calculation (`nthPower`)**: Computes the `n`-th power of a given number.
- **Summing Elements in a List (`sumElements`)**: Returns the sum of all elements in a list.
- **Arithmetic Mean (`arithmeticMean`)**: Computes the average of a list of integers.
- **Standard Deviation (`standardDeviation`)**: Computes the standard deviation of a list of double values.
- **Summation of Even Numbers (`sumEven`)**: Computes the sum of all even numbers up to `n`.
- **Summing Even Elements in a List (`sumEvenList`)**: Returns the sum of all even numbers in a given list.
- **Filtering Even Numbers (`getEvenList`)**: Returns a list of even numbers from a given list.
- **Generating an Even Number List (`evenList`)**: Returns a list of even numbers up to `n`.
- **Dot Product of Two Lists (`dotProduct`)**: Computes the dot product of two lists of equal size.

## Usage
This program can be executed by running the `main` method in the `Exercises` class. Example output for various method calls is provided.

### Example Output:
```
The sum 0 + 1 + 2 + ... + n of 9: 45
Factorial of 9: 362880
The 5-th power of 9: 59049
The sum of the elements in a list of numbers [1,2,3,4,5]: 15
The arithmetic mean of a list of numbers [1,2,3,4,5]: 3.0
The standard deviation of a list of numbers [1,2,3,4,5]: 1.4142135623730951
The even sum of numbers up until 8: 20
The even sum of numbers in a list of numbers [1,2,3,4,5]: 6
Getting an even list from a list of numbers [1,2,3,4,5]: [2,4]
Getting an even list from the numbers up to 8: [2,4,6,8]
Getting the dot product of two lists. List 1 [5,4,3,2,1] and List 2 [1,2,3,4,5]: 35
```

## Requirements
- Java Development Kit (JDK) installed
- Basic knowledge of Java collections (e.g., `ArrayList`)

## Compilation and Execution
To compile and run the program:

```sh
javac Exercises.java
java Exercises
```

