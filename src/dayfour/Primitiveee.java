package dayfour;

class Prtimitiveee {
    // Primitive data types
    byte byteValue;
    short shortValue;
    int intValue;
    long longValue;
    float floatValue;
    double doubleValue;
    char charValue;
    boolean booleanValue;

    // Non-primitive data types
    String stringValue;
    Integer integerWrapper;
    Double doubleWrapper;
    Prtimitiveee objectReference;

    public static void main(String[] args) {
        // Create an instance of the class
        Prtimitiveee instanceOfTheClass = new Prtimitiveee();

        // Print default values of primitive data types
        System.out.println("Default value of byte: " + instanceOfTheClass.byteValue);
        System.out.println("Default value of short: " + instanceOfTheClass.shortValue);
        System.out.println("Default value of int: " + instanceOfTheClass.intValue);
        System.out.println("Default value of long: " + instanceOfTheClass.longValue);
        System.out.println("Default value of float: " + instanceOfTheClass.floatValue);
        System.out.println("Default value of double: " + instanceOfTheClass.doubleValue);
        System.out.println("Default value of char: '" + instanceOfTheClass.charValue + "'");
        System.out.println("Default value of boolean: " + instanceOfTheClass.booleanValue);

        // Print default values of non-primitive data types
        System.out.println("Default value of String: " + instanceOfTheClass.stringValue);
        System.out.println("Default value of Integer (wrapper): " + instanceOfTheClass.integerWrapper);
        System.out.println("Default value of Double (wrapper): " + instanceOfTheClass.doubleWrapper);
        System.out.println("Default value of Object reference: " + instanceOfTheClass.objectReference);

    }
}

