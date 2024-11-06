package daytwo;

public class Methods {

    //Meetodid on mingid koodi osad, mis grupeerivad mingit teatud kindlat funktsiooni

    //Kui koodis on korduvaid koodi osasid, võiks mõelda, et äkki peaks nende kohta tegema eraldi meetodi

    public static void main(String[] args) {

    int age = 20;
    getPerson(age);

    }

    // Lisame meetodi, mis prindib ekraanile Hello
    //TODO - loo uus meetod getName() ja kutsu see main meetodist välja
    //TODO - getName() meetodi sees prindi konsooli "John"

    private static void getPerson(int age){
        System.out.println("Check user details: ");
        getName();
        checkUserAge(age);
    }

    private static void getName(){
        System.out.println("John");
    }

    private static void checkUserAge(int age){

        if (age < 18){
            System.out.println("You are younger than 18 years");
        }else {
            boolean canDrive = true;
            getAge(age, canDrive, "You can drive");
        }
    }
    private static void getAge(int age, boolean canDrive, String text){
        if (canDrive){
            System.out.println("Age is: " + age + " " + text);
        }
    }


}

