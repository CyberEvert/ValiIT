package dayeight;

public class CastingExe {
    public static void main(String[] args) {
        int score = 85;
        double average = score; // Implicit casting from int to double.
        System.out.println("The average is " + average);

        double totalAmount = 150.75;
        int roundedAmount = (int) totalAmount; //Explicit casting from double to int.
        System.out.println("The total amount is " + roundedAmount);

        long timestamp = 123456789012L;
        int limitedTimestamp = (int) timestamp; //Explicit casting from long to int.
        System.out.println("The timestamp is " + limitedTimestamp);
    }
}