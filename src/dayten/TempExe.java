package dayten;

import java.util.Scanner;

public class TempExe {

    public static void main(String[] args) {
        double[][] temperatures = {
                {22.5, 25.0, 20.0}, //Day1 (morning, afternoon, evening)
                {24.0, 26.5, 21.5}, //Day2
                {23.0, 27.0, 22.0} //Day3
        };

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day (1,2 or 3) to find the maximum temperature: ");
        int day = sc.nextInt();

        getMaxTemperature(temperatures, day);

        accessSpecificElements();
        calculateDailyAverage();
    }
    private static void accessSpecificElements() {
        double[][] temperatures = {
                {22.5, 25.0, 20.0}, //Day1
                {24.0, 26.5, 21.5}, //Day2
                {23.0, 27.0, 22.0} //Day3
        };
        double morningTempDay1 = temperatures[0][0];
        System.out.println("Morning temperature on Day 1: " + morningTempDay1);

        double afernoonTempDay3 = temperatures[2][1];
        System.out.println("Afternoon temperature on Day 3: " + afernoonTempDay3);
    }
    private static void calculateDailyAverage() {
        double[][] temperatures = {
                {22.5, 25.0, 20.0}, //Day1
                {24.0, 26.5, 21.5}, //Day2
                {23.0, 27.0, 22.0} //Day3
        };
        for (int day = 0; day < temperatures.length; day++) {
            double sum = 0;
            for (int timeOfDay = 0; timeOfDay < temperatures.length; timeOfDay++) {
                sum += temperatures[day][timeOfDay];
            }
            double average = sum / temperatures[day].length;
            System.out.println("Avareage temperature for Day " + (day + 1) + ": " + average);
        }
    }
    private static void getMaxTemperature(double[][] temperatures, int day) {
        if(day < 1 || day > temperatures.length) {
            System.out.println("Invalid day");
            return;
        }

        double [] dayTemperatures = temperatures[day - 1];

        double maxTemp = dayTemperatures[0];
        for (double temp : dayTemperatures) {
            if(temp > maxTemp) {
                maxTemp = temp;
            }
        }
        System.out.println("Max temperature for Day " + day  + ": " + maxTemp + "°C");
    }
}