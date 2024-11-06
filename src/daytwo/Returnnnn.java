package daytwo;

public class Returnnnn {

    /*
    public static void main(String[] args) {
        String hello = getGreeting();
        int length = hello.length();
        System.out.println(hello);
    }

    private static String getGreeting(){
        return "Hello World!";
    }
     */
    /*
    public static void main(String[] args) {
        boolean checkIfNumberIsEven = isEven (4);
        System.out.println(checkIfNumberIsEven);
    }
    public static boolean isEven (int number) {
        return number % 2 == 0;
    }
    */

    public static void main(String[] args) {
        int id = 1;
        getUser(id);

    }
    private static void getUser(int id) {
        getUserFullName();
        getUserAge(id);

    }
    private static String getUserFullName() {
        System.out.println("Name");
        String fullName = " John Smith";
        return fullName;
    }
    private static int getUserAge(int userId) {
        System.out.println("Age");
        int age = 38;
        return age;
    }


}
