package dayseven;

import java.util.Scanner;

public class TryCatch {




    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
           System.out.println("Enter a number: ");
           int a = sc.nextInt();
            int result = 100 / a;
           System.out.println("100 divided by " + a + " is: " + result);
           // Risky code
        } catch (ArithmeticException e) {
            System.out.println("0 ei saa jagada");
          // Handle exception
        }finally {
            sc.close();
            // Always executed
            System.out.println("This will always run.");
        }
    }
}