package com.bridgelabz;
import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        System.out.println("Enter the values of a,b,c below to find Quadratic Equation");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        double a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        double b = sc.nextInt();
        System.out.print("Enter the value of c : ");
        double c = sc.nextInt();
        // Formula of Delta
        double delta = ((b * b) - (4.0 * a * c));

        if (delta >= 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Roots of quadratic equation are : " + root1 + " and " + root2);
        }
        else {
            System.out.println("Invalid! There are no real roots. Try different values");
        }
    }

}
