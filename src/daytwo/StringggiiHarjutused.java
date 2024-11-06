package daytwo;

public class StringggiiHarjutused {
public static void main(String[] args) {
    //Exercise 1: Convert to Uppercase
    //Problem: Convert a given string to uppercase.
/*
    String original = "hello world";
    String uppercase = original.toUpperCase();
    System.out.println(uppercase);
*/
    //Exercise 2: Convert to Lowercase
    //Problem: Convert a given string to lowercase.
/*
    String original = "HELLO WORLD";
    String lowercase = original.toLowerCase();
    System.out.println(lowercase);
*/
    //Exercise 3: Check if String Contains a Substring
    //Problem: Check if a given "Hello, world!" string contains a specific substring "world".
/*
    String str = "Hello, world!";
    String substring = "world";
    if (str.contains(substring)) {
        System.out.println(str.substring(substring.length()));
    } else {
        System.out.println(str.substring(substring.length()));
    }
*/
    //Exercise 4: Get the First Character of a String
    //Problem: Get the first character of a string "Hello".
/*
    String str = "Hello";
    char firstChar = str.charAt(0);
    System.out.println(firstChar);
*/
    //Exercise 5: Replace a Character in a String
    //Problem: Replace all occurrences of “o“ with “a“ in a string with another character "Hello, world!".
/*
    String str = "Hello, world!";
    String modifiedStr = str.replace('o','a');
    System.out.println(modifiedStr);
*/
    //Exercise 6: Check if a String Starts and Ends with Specific Characters
    //Problem: Write a program that checks if a string starts with one substring and ends with another substring.
    //Example: Input: "Hello, world!", Start: "Hello", End: "world!" → Output: true
/*
    String str = "Hello, world!";
    String start = "Hello";
    String end = "world!";
    System.out.println(str.startsWith(start) && str.endsWith(end));
*/
    //Exercise 7: Extract a Substring Between Two Indices
    //Problem: Write a program that extracts a substring from a given string between two specified indices.
    //Example: Input: "Hello, world!", Start Index: 7, End Index: 12 → Output: "world"
/*
    String input = "Hello, world!";
    int startIndex = 7;
    int endIndex = 12;
    String result = input.substring(startIndex, endIndex);
    System.out.println(result);
*/
    //Exercise 8: Find the First and Last Occurrence of a Character
    //Problem: Write a program that finds the first and last position of a specific character in a string.
    //Example: Input: "abracadabra", Character: 'a' → Output: First Position: 0, Last Position: 10
/*
    String input = "abracadabra";
    char character = 'a';
    int firstPosition = input.indexOf(character);
    int lastPosition = input.lastIndexOf(character);
    System.out.println("firstPosition: " + firstPosition );
    System.out.println("lastPosition: " + lastPosition );
*/
    //Exercise 9: Replace a Word in a Sentence
    //Problem: Write a program that replaces a specific word in a sentence with another word.
    //Example: Input: "Java is fun", Replace "fun" with "awesome" → Output: "Java is awesome"
/*
    String sentence = "Java is fun";
    String oldword = "fun";
    String newword = "awesome";
    String result = sentence.replace(oldword, newword);
    System.out.println(result);
*/
}
}
