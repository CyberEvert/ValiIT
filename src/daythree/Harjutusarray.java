package daythree;

import java.util.Arrays;

public class Harjutusarray {
public static void main(String[] args) {

    //Exercise1 - Declare and Initialize an Array
    //Task: Declare an integer array of size 5 and initialize it with values: {1, 2, 3, 4, 5}.
    //Hint: Use int[] myArray = {1, 2, 3, 4, 5};
/*
    int[] myArray = {1,2,3,4,5};
    System.out.println(Arrays.toString(myArray));;
*/

    //Exercise2 - Access Specific Elements
    //Task: Access and print the third element in the array {10, 20, 30, 40, 50}.
    //Hint: Use array[2] (since arrays are zero-indexed).
/*
    int[] myArray = {10, 20, 30, 40, 50};
    System.out.println(myArray[2]);
*/

    //Exercise3 - Modify an Element
    //Task: Given an array {5, 10, 15, 20}, change the second element to 12 and print the entire array to see the change.
    //Hint: Assign a new value to array[1], then print the elements individually.
/*
    int[] Array = {5,10,15,20};
    Array[1] = 12;
    System.out.println(Arrays.toString(Array));
*/
    //Exercise4 - Array Length Property
    //Task: Create an array {8, 6, 7, 5, 3, 0, 9} and print its length.
    //Hint: Use array.length to get the length of an array.
/*
    int [] Array = {8, 6, 7, 5, 3, 0, 9};
    System.out.println(Array.length);
*/
    //Exercise5 - Sum of Elements (Without Loop)
    //Task: Calculate the sum of elements in an array {4, 2, 8, 1, 6} and store it in a variable.
    //Hint: Manually add each element: int sum = array[0] + array[1] + ... + array[4];
/*
    int[] Array = {4, 2, 8, 1, 6};
    int sum = Arrays.stream(Array).sum();
    System.out.println(sum);
*/

}
}
