package com.bridgelabz;
import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        double temperature, v, windChill;
        System.out.println("Enter Temperature and Wind Speed");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Temperature in Fahrenheit : ");
        temperature = scanner.nextDouble();
        System.out.print("Enter Wind Speed (in miles per hours) : ");
        v = scanner.nextDouble();
        System.out.println(v);
        if (temperature <= 50.0) {
            if (v > 3.0 && v <= 120.0) {
                windChill = (35.75 + 0.6215 + (0.4275 * temperature - 35.75) * Math.pow(v, 0.16));
                System.out.println("The WindChill is : "+windChill);
            }
        } else System.out.println("Invalid Input! Temperature should be less than 50 or Wind Speed should " +
                "between 3 and 120 miles per hours");
    }
}
