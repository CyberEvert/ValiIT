
public class BiggerAndIfCondition {

    public static void main(String[] args) {

       // int a = 1;
        // int b = 2;

        // TODO - print out "b is bigger than a"
        // TODO - print out "a is bigger than b" in else if block
        // TODO - print out "a and b are equal" in else block

        /*    if (b > a) {
            System.out.println("b > a");
        } else if (b < a) {
            System.out.println("b < a");
        } else {
            System.out.println("b == a");
        }
        */
        int a = 1;
        int b = 2;

        //TODO - use && (AND)
        //TODO - use || (or)

        // TODO - print out "b is bigger than a, and a is positive"
        // TODO - print out "a is bigger than b, and b is positive" in else if block
        // TODO - print out "a and b are either equal or both are negative" in else block
        // TODO - print out "No spesific conditions were met" in else block

        if (b > a && a > 0) {
            System.out.println("b is bigger than a, and a is positive");
        } else if (b < a && b > 0) {
            System.out.println("a is bigger than b, and b is positive");
        } else if (b == a || b < 0 && a > 0) {
            System.out.println("a and b are either equal or both are negative");
        } else {
            System.out.println("No spesific conditions were met");
        }
    }
}