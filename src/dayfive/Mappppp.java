package dayfive;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mappppp {
    public static void main(String[] args) {

        //agesOfNames();
        //jobsOfMap();
       //gradesOfNames();
        salariesOutOfList();

    }

    private static void salariesOutOfList() {
        Map<Integer, String> salaries = new HashMap<>();
        salaries.put(1500, "Jack");
        salaries.put(2350, "Jane");
        salaries.put(3476, "Joe");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary: ");
        int salaryToRemove = sc.nextInt();
        if (salaries.containsKey(salaryToRemove)) {
            salaries.remove(salaryToRemove);
            System.out.println("Salary removed: " + salaryToRemove);
        }else{
            System.out.println("Salary not found: " + salaryToRemove);
            sc.close();
            return;
        }
        System.out.println("List of Salaries: ");
        for (Map.Entry<Integer, String> entry : salaries.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    private static void gradesOfNames() {
        Map<String, Integer>grades = new HashMap<>();
        grades.put("Madis", 2);
        grades.put("Kati", 3);
        grades.put("Clen", 5);

        System.out.println("Madis's grade: " + grades.get("Madis"));
        System.out.println("Kati's grade: " + grades.get("Kati"));
        System.out.println("Clen's grade: " + grades.get("Clen"));
    }

    private static void jobsOfMap() {
        Map<String, String> mapOfJobs = new HashMap();
        mapOfJobs.put("Madis", "COO");
        mapOfJobs.put("Kati", "CFO");
        mapOfJobs.put("Laura", "CEO");
        for (Map.Entry<String, String> entry : mapOfJobs.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    private static void agesOfNames() {
        Map<String, Integer> ages = new HashMap();
        ages.put("Mati", 25);
        ages.put("Kati", 35);
        ages.put("Tõnu", 45);

        for (String nameKey : ages.keySet()) {
            System.out.println(nameKey + " is " + ages.get(nameKey) + " years old");
        }
    }
}