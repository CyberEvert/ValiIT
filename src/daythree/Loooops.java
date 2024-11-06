package daythree;

public class Loooops {
    public static void main(String[] args) {
        //TODO While
        /*
        int count = 1;
        while (count <= 5) {
            System.out.println("Count is:" +count);
            count++;
            System.out.println("Count is after count ++" + count);
        }
*/
        //TODO DoWhile
/*
        int count = 1;
        do {
         System.out.println("Count is" +count);
         count++;
         }
        while (count <= 5);
*/
        //TODO For
/*
        for (int count = 1; count <= 5; count++) {
            System.out.println("Count:" +count);
        }
*/
        //TODO Foreach
/*
        String[] fruits = {"Apple", "Banana","Orange"};
        for (String fruit : fruits) {
            System.out.println("Fruit:" +fruit);
        }
*/
        //TODO break
/*
        for (int count = 1; count <= 5; count++) {
            if (count == 3) {
                break;
            }
            System.out.println("Count is: " + count);
        }
*/
        //TODO continue
/*
        for (int count = 1; count <= 5; count++) {
            if (count == 3) {
                continue;
            }
            System.out.println("Count is: " + count);
        }
*/
        //TODO math.random täring

        int diceRoll = rollDice();

        System.out.println("You rolled a number: " + diceRoll);

    }


    private static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

}
