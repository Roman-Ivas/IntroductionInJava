package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //        Topic: Variables, conditions, cycles, arrays, methods
//
//         Homework
//        Task 1:
//        Display the inscription "Your time is limited, so don't waste it living someone else's life" on the screen Steve Jobs
//        in different lines. Example output:
//        "Your time is limited,
//        so don't waste it
//        living someone else's life"
//        Steve Jobs
        System.out.println("Fall seven times");
        System.out.println("and");
        System.out.println("stand up eight");


//        Task 2:
//        The user enters two numbers from the keyboard. The first number is the value, the second number is the percentage,
//                which must be calculated. For example, we entered 50 and 10 from the keyboard. We need to display it on the screen
//        10 percent of 50. The result is 5.
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value
        System.out.print("Enter the value: ");
        double value = scanner.nextDouble();

        // Prompt the user to enter the percentage
        System.out.print("Enter the percentage: ");
        double percentage = scanner.nextDouble();

        // Calculate the result (percentage of the value)
        double result = (percentage / 100) * value;

        // Display the result
        System.out.println(percentage + "% of " + value + " is " + result);


//        Task 3:
//        The user enters 3 numbers from the keyboard. It is necessary to create a number containing these numbers.
//        For example, if 7, 3, 8 are entered from the keyboard, then the number 738 should be formed.
        // Prompt the user to enter the three numbers
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();

        // Concatenate the numbers to create a single number
        int concatenatedNumber = number1 * 100 + number2 * 10 + number3;

        // Display the concatenated number
        System.out.println("The concatenated number is: " + concatenatedNumber);

//        Task 4:
//        The user enters a six-digit number. It is necessary to change the first and sixth numbers in this number, and
//        also the second and fifth numbers. For example, 723895 should become 593827
//        If the user does not enter a six-digit number, an error message should be displayed
        // Prompt the user to enter a six-digit number
        System.out.print("Enter a six-digit number: ");
        int number = scanner.nextInt();

        // Check if the input is a six-digit number
        if (isValidSixDigitNumber(number)) {
            // Swap the first and sixth digits and the second and fifth digits
            int swappedNumber = getSwappedNumber(number);

            // Display the swapped number
            System.out.println("Swapped number: " + swappedNumber);
        } else {
            System.out.println("Invalid input. Please enter a six-digit number.");
        }

//        Task 5:
//        The user enters the month number (1-12) from the keyboard. Depending on the received number, the program
//        displays the inscription on the screen: Winter (if the entered value is 1, 2 or 12), Spring (if the entered value is from
//        3 to 5), Summer (if entered from 6 to 8), Autumn (if entered from 9 to 11).
//        If the user entered a value not in the range from 1 to 12, an error message should be displayed
        // Prompt the user to enter the month number
        System.out.print("Enter the month number (1-12): ");
        int monthNumber = scanner.nextInt();

        // Check the month number and display the corresponding season
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Error: Invalid month number. Please enter a number between 1 and 12.");
        }

//        Task 6:
//        The user enters the number of meters from the keyboard. Depending on the user's choice of program
//        converts meters to miles, inches, or yards
        // Prompt the user to enter the number of meters
        System.out.print("Enter the number of meters: ");
        double meters = scanner.nextDouble();

        // Prompt the user to choose the conversion option
        System.out.println("Choose a conversion option:");
        System.out.println("1. Convert to miles");
        System.out.println("2. Convert to inches");
        System.out.println("3. Convert to yards");
        System.out.print("Enter your choice (1/2/3): ");
        int choice = scanner.nextInt();

        result = 0.0;

        // Use a switch statement to perform the conversion based on the user's choice
        switch (choice) {
            case 1:
                result = meters * 0.000621371; // Convert to miles
                System.out.println(meters + " meters is approximately " + result + " miles.");
                break;
            case 2:
                result = meters * 39.3701; // Convert to inches
                System.out.println(meters + " meters is approximately " + result + " inches.");
                break;
            case 3:
                result = meters * 1.09361; // Convert to yards
                System.out.println(meters + " meters is approximately " + result + " yards.");
                break;
            default:
                System.out.println("Invalid choice. Please choose 1, 2, or 3 for the conversion option.");
        }

        //    Task 7:
//    The user enters two numbers from the keyboard. It is necessary to display all the odd numbers in the specified
//    range If the boundaries are not specified correctly, it is necessary to normalize the boundaries. Example,
//            if 20 and 11 are entered, normalization is required, after which the start will be equal to 11 and the end will be 20.
// Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Normalize the boundaries if necessary
        int start, end;
        if (num1 < num2) {
            start = num1;
            end = num2;
        } else {
            start = num2;
            end = num1;
        }

        // Display the odd numbers within the specified range
        System.out.println("Odd numbers in the range " + start + " to " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

//        Task 8:
//        Display the multiplication table in the range specified by the user on the screen. For example, if
//        the user specified 3 and 5, the table might look like this
//        3*1 = 3 3*2 = 6 3*3 = 9 ………… 3* 10 = 30
//……………………………………………………
//        5*1 = 5 5 *2 = 10 5 *3 = 15 …………
        // Prompt the user to enter the range
        System.out.print("Enter the lower bound: ");
        int lowerBound = scanner.nextInt();
        System.out.print("Enter the upper bound: ");
        int upperBound = scanner.nextInt();

        // Display the multiplication table in the specified range
        for (int i = lowerBound; i <= upperBound; i++) {
            for (int j = 1; j <= 10; j++) {
                result = i * j;
                System.out.print(i + "*" + j + " = " + result + "  ");
            }
            System.out.println(); // Move to the next line for the next number
        }

//        Task 9:
//        In a one-dimensional array filled with random numbers, we determine the minimum and
//        maximum value, count the number of negative values, count the number
//        positive values, we count the number of zeros. The result is displayed on the screen.
        // Define the size of the array
        int arraySize = 20; // You can adjust the size as needed

        // Create an array and fill it with random numbers
        int[] numbers = new int[arraySize];
        Random random = new Random();

        for (int i = 0; i < arraySize; i++) {
            numbers[i] = random.nextInt(201) - 100; // Generates random numbers from -100 to 100
        }

        // Initialize variables for statistics
        int min = numbers[0];
        int max = numbers[0];
        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;

        // Calculate statistics
        for (int numberL : numbers) {
            if (numberL < min) {
                min = numberL; // Update minimum
            }
            if (numberL > max) {
                max = numberL; // Update maximum
            }
            if (numberL < 0) {
                negativeCount++; // Count negative values
            } else if (numberL > 0) {
                positiveCount++; // Count positive values
            } else {
                zeroCount++; // Count zeros
            }
        }

        // Display the statistics
        System.out.println("Array: " + java.util.Arrays.toString(numbers));
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        System.out.println("Number of negative values: " + negativeCount);
        System.out.println("Number of positive values: " + positiveCount);
        System.out.println("Number of zeros: " + zeroCount);


//        Task 10:
//        We have a one-dimensional array filled with random numbers. Based on array data
//        necessary:
// Create a one-dimensional array containing only even numbers from the first array
// Create a one-dimensional array containing only odd numbers from the first array
// Create a one-dimensional array containing only negative numbers from the first array
// Create a one-dimensional array containing only positive numbers from the first array
        // Create an array and fill it with random numbers
        int[] originalArray = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            originalArray[i] = random.nextInt(201) - 100; // Generates random numbers from -100 to 100
        }

        // Initialize lists for the filtered arrays
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        ArrayList<Integer> negativeNumbers = new ArrayList<>();
        ArrayList<Integer> positiveNumbers = new ArrayList<>();

        // Filter the numbers and add them to the respective lists
        for (int numberL : originalArray) {
            if (numberL % 2 == 0) {
                evenNumbers.add(numberL);
            } else {
                oddNumbers.add(numberL);
            }
            if (numberL < 0) {
                negativeNumbers.add(numberL);
            } else if (numberL > 0) {
                positiveNumbers.add(numberL);
            }
        }

        // Convert the ArrayLists to arrays
        int[] evenArray = evenNumbers.stream().mapToInt(Integer::intValue).toArray();
        int[] oddArray = oddNumbers.stream().mapToInt(Integer::intValue).toArray();
        int[] negativeArray = negativeNumbers.stream().mapToInt(Integer::intValue).toArray();
        int[] positiveArray = positiveNumbers.stream().mapToInt(Integer::intValue).toArray();

        // Display the filtered arrays
        System.out.println("Original Array: " + java.util.Arrays.toString(originalArray));
        System.out.println("Even Numbers: " + java.util.Arrays.toString(evenArray));
        System.out.println("Odd Numbers: " + java.util.Arrays.toString(oddArray));
        System.out.println("Negative Numbers: " + java.util.Arrays.toString(negativeArray));
        System.out.println("Positive Numbers: " + java.util.Arrays.toString(positiveArray));


        //Task 11:
        //Write a method that displays a vertical or horizontal line from some characters. The method takes
        //as parameters: line length, direction, symbol.
        printLine(10, "horizontal", "-");
        printLine(5, "vertical", "|");

        //Task 12:
        //Write a method that sorts an array in descending or ascending order depending on the selection
        //user
        // Prompt the user to enter the array elements
        System.out.print("Enter the array size: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Prompt the user for sorting order
        System.out.print("Enter 'asc' for ascending or 'desc' for descending order: ");
        String sortOrder = scanner.next();

        // Sort the array based on user's choice
        if (sortOrder.equalsIgnoreCase("asc")) {
            sortAscending(arr);
        } else if (sortOrder.equalsIgnoreCase("desc")) {
            sortDescending(arr);
        } else {
            System.out.println("Invalid sorting order. Please use 'asc' or 'desc'.");
        }

        // Display the sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));

        scanner.close();
    }
    private static int getSwappedNumber(int number) {
        int firstDigit = (number / 100000) % 10;
        int secondDigit = (number / 10000) % 10;
        int thirdDigit = (number / 1000) % 10;
        int fourthDigit = (number / 100) % 10;
        int fifthDigit = (number / 10) % 10;
        int sixthDigit = number % 10;

        return (sixthDigit * 100000) + (fifthDigit * 10000) + (fourthDigit * 1000) + (thirdDigit * 100) + (secondDigit * 10) + firstDigit;
    }

    // Function to check if the input is a valid six-digit number
    public static boolean isValidSixDigitNumber(int num) {
        return num >= 100000 && num <= 999999;
    }

    // Method to print a line
    public static void printLine(int length, String direction, String symbol) {
        if (direction.equalsIgnoreCase("horizontal")) {
            for (int i = 0; i < length; i++) {
                System.out.print(symbol);
            }
        } else if (direction.equalsIgnoreCase("vertical")) {
            for (int i = 0; i < length; i++) {
                System.out.println(symbol);
            }
        } else {
            System.out.println("Invalid direction. Use 'horizontal' or 'vertical'.");
        }
    }

    // Method to sort the array in ascending order
    public static void sortAscending(int[] arr) {
        Arrays.sort(arr);
    }

    // Method to sort the array in descending order
    public static void sortDescending(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }

    }
}