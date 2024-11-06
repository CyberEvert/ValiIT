package dayeight;

import java.util.Scanner;

//Coverting types
//Exercise 1
//Convert number to string int originalNumber = 123;
//Convert string back to number

// Exercise 2 - Check for Valid Number Input
// Write a program that checks if the input string can be converted to a valid integer.
// If valid, print the number; otherwise, display an error using try - catch.

//Exercise 3 – Reverse the String and Convert to int
//Given the string text = "123456", write a Java program that:
//Reverses the string using a for loop.
//Converts the reversed string into an integer and prints the result.
//Expected output: 654321

public class ConvertingEx1 {
    

    public static void main(String[] args) {

        checkValidNumber();
        reversedInput();
        convertBackToBack();

    }
        private static void convertBackToBack () {
            // Step 1: Convert number to string
            int originalNumber = 123;
            String numberAsString = Integer.toString(originalNumber);
            System.out.println("Converted number to string: " + numberAsString);

            // Step 2: Convert string back to number
            int convertedBackToNumber = Integer.parseInt(numberAsString);
            System.out.println("Converted string back to number: " + convertedBackToNumber);
        }

        private static void checkValidNumber () {
            Scanner sc = new Scanner(System.in);
            System.out.println("Check if its a valid number: ");
            String input = sc.nextLine();

            try {
                int number = Integer.parseInt(input);
                System.out.println("Valid number is: " + number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number");
            }
        }
        private static void reversedInput () {
            String text = "123456";

            String reversedText = "";
            for (int i = text.length() - 1; i >= 0; i--) {
                reversedText += text.charAt(i);
            }
            System.out.println(reversedText);

            int reversedNum = Integer.parseInt(reversedText);
            System.out.println(reversedNum);

            text.charAt(text.length() - 1);
            System.out.println(text.charAt(text.length() - 1));
        }
    }