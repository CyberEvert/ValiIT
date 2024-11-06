package dayfour;

import java.util.ArrayList;
import java.util.List;

public class ListArrayList {
    public static void main(String[] args) {
        List<String> ListOfNames = new ArrayList<String>();
        ListOfNames.add("James");
        ListOfNames.add("John");
        ListOfNames.add("Jane");

        System.out.println(ListOfNames);

        for (String name : ListOfNames) {
            System.out.println(name);
        }

        ListOfNames.remove(1);

        System.out.println();

        System.out.println("Print out name: " + ListOfNames.get(0));
        System.out.println("Print out name: " + ListOfNames.get(1));

        ListOfNames.set(1, "Madis");

        System.out.println("Names after modification: " + "\n" + ListOfNames);
}
}
