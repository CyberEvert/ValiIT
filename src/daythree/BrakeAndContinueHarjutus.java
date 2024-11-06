package daythree;

import java.io.PrintStream;
import java.util.Arrays;

public class BrakeAndContinueHarjutus {
    public static void main(String[] args) {
        
        firstEvenNumber();
        skipMultipliesOfFive();
        multipliesOfThreeSkipSix();
        sumUntilNegativeISFound();
        firstGreaterThanFifty();

        }

    private static void firstEvenNumber() {
        //TODO Exercise 1 - Find the First Even Number in a List
        //TODO Description: Given an array of numbers, use a for loop to find the first even number in the array.
        //TODO Once you find it, print it and exit the loop.
        //TODO int[ ] numbers = {1, 3, 7, 4, 9, 10};
        int[ ] numbers = {1, 3, 7, 4, 9, 10};
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println("First even number: " + number);
                break;
            }
        }
    }


    private static void skipMultipliesOfFive() {
        //TODO Exercise 2 - Print Odd Numbers from 1 to 20, Skip Multiples of 5
        //TODO Description: Use a for loop to print all odd numbers between 1 and 20. If a number is a multiple of 5, skip it using continue.
        for (int i = 1; i <= 20; i+=2) {
            if (i % 5 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    private static void multipliesOfThreeSkipSix() {
        //TODO Exercise 3 - Print Multiples of 3 up to 30, Skip Multiples of 6
        //TODO Description: Use a for loop to print multiples of 3 up to 30. Skip any multiples of 6 using continue.
        for (int i = 3; i <= 30; i+= 3) {
            if (i % 6 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }


    {
        //TODO Exercise 4 - Print the Sum of Non-Negative Numbers Until a Negative Number is Found
        //TODO Description: Given an array of numbers, use a for loop to calculate the sum of all non-
        //TODO negative numbers. Stop the loop when a negative number is encountered.

    }

    private static void sumUntilNegativeISFound() {
        int [] numbers = {5,12,3,7,-4,8,2};
        int sum = 0;

        for (int num : numbers) {
            if (num < 0) {
                break;
            }
            sum += num;
        }
        System.out.println("Sum of non-negative numbers: " + sum);
    }


    private static void firstGreaterThanFifty(){
        //TODO Exercise 5 - Find the First Number Greater Than 50 in an Array
        //TODO Description: Given an array of numbers, use a loop to find the first number greater than 50.
        //TODO Print it exit the loop immediately after finding it.
        int [] numbers = {23,45,39,51,48,60};

        for (int num : numbers) {
            if (num > 50){
                System.out.println("First greater number: " + num);
                break;
            }
        }

    }

}






    

