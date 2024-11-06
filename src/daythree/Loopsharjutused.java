package daythree;

import java.util.Arrays;

public class Loopsharjutused {
   
    public static void main(String[] args) {

        printNumbers();
        carBrand();
        int sum = getSum();
        sumOfNumbers(sum);
        Multiply();


    }
    //TODO Exercise 5 - Multiplication Table
    //TODO Write a program that uses a for loop to print the multiplication table of 7.
    //TODO Provide the table up to 7*10, meaning limit loop to repeat 10-times.
    //TODO Hint: When printing the results, use variables values and Strings
    private static void Multiply() {
        int n = 7;
        for (int i = 0; i < 11; i++) {
            System.out.println("Multiply" + " " + n + " * " + i + " = " + n * i);
        }
    }
    //TODO Exercise 4 – Even Numbers Between 1 and 20
    //TODO Write a program that uses a for loop to print all the even numbers between 1 and 20.
    //TODO For incrementing use:  i += 1 (1 is just an example, assign a correct number instead of 1)
    private static void sumOfNumbers(int sum) {
        System.out.println("Even numbers: " + sum);
        for (int i = 2; i <= 20; i += 2) {
            System.out.println("Even numbers: " + i);
        }
    }
    //TODO Exercise 3 – Sum of Numbers
    //TODO Write a program that uses a while loop to calculate the sum of the first 100 positive integers.
    //TODO while (<boolean expression>) {}
    private static int getSum() {
        int sum = 0;
        int number = 1;
        while (number <= 100) {
            sum += number;
            number++;
        }
        return sum;
    }
    //TODO Exercise 2 – Print out each car brand
    //TODO The forEach loop (or enhanced for loop) is designed to iterate over collections or arrays without
    //TODO needing an index variable. Create an array String [ ] cars, define array with elements „Ford", „Honda", „Audi".
    // Using forEach loop
    //TODO print each car brand to the console.
    //TODO for (String car : cars) {}
    private static void carBrand() {
        String[] carBrand = {"Ford","Honda","Audi"};
        for (String brand : carBrand) {
            System.out.println("CarBrand: " + brand);
        }
    }
    //TODO Exercise 1 - Print Numbers 1 to 10
    //TODO Write a program that uses a for loop to print numbers from 1 to 10.
    //TODO for (int i = 0; i < 5; i++) {}
    private static void printNumbers() {
        for (int i = 1; i < 11; i++) {
            System.out.println("Print numbers: " + i);
        }
    }
}

