package dayfour;

public class Exercises {

    public static void main(String[] args) {
        Car carInOtherClass1 = new Car();
        System.out.println(carInOtherClass1.brand);

        Car carInOtherClass2 = new Car("Toyota", "", 0);
        System.out.println(carInOtherClass2.brand);

        System.out.println(carInOtherClass2);
    }
}
