package com.bridgelabz;
import java.util.Scanner;

public class EuclideanDistance {

        public static void main(String[] args) {

            System.out.println("Enter the value of x and y below to find the Euclidean distance : ");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the value of X : ");
            int x = sc.nextInt();
            System.out.print("Enter the value of Y : ");
            int y = sc.nextInt();
            //Formula to Calculate Euclidean distance from (0,0) to (X ,Y)
            double distance = Math.sqrt((x *  x) + (y * y));
            System.out.print("The Euclidean distance from the point (x, y) to the origin ( 0 , 0) : " + distance);

        }
}
