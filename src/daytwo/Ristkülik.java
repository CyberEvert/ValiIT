package daytwo;

public class Ristkülik {

    //TODO - loo uus meetod nimetusega private static void getArea() mis arvutab ristküliku pindala
    //TODO - kutsu see main meetodist välja, argumendi väärtustega 4 ja 5
    //TODO - loo uus meetod nimetusega private static void checkArea()
    //TODO - kutsu checkArea() meetod välja getArea() meetodist
    //TODO - prindi konsooli "Area is bigger than 20" kui pindala suurus ületab 20 ja "Area is smaller than 20"


    private static void main (String[] args) {
    int a = 4;
    int b = 5;
        getArea(a, b);
    }

    private static void getArea(int a, int b){
        int result = a * b;
        checkArea(result);

    }
    private static void checkArea(int result) {
        if(result < 20) {
            System.out.println("Area is bigger than 20");
        } else {
            System.out.println("Area is smaller than 20");
        }
    }
}
