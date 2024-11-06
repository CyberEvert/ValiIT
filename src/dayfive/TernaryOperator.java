package dayfive;

public class TernaryOperator {
    public static void main(String[] args) {

        //evenOrOdd();
        //numIsGreater();
        //eligibleToVote();


    }

    private static void eligibleToVote() {

        int age = 17;
        String result = (age >= 18) ? "Eligible to vote" : "Ineligible to vote";

        System.out.println(result);
    }

    private static void numIsGreater() {
        int number1 = 10;
        int number2 = 20;

        int result = (number1 > number2) ? number1 : number2;
        System.out.println(result);
    }

    private static void evenOrOdd() {
        int number = 7;

        System.out.println("Ternary operator");

        String result = (number % 2 == 0)  ? "even" : "odd";

        System.out.println("The number is: " + number + " is " + result);
    }
}
