package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       double sgallons;
       double gallons;
       double quarts;
       double pints;
       double cups;
       double tablespoons;
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the number of gallons: ");
       sgallons = input.nextDouble();
       gallons = sgallons * 1;
       quarts = gallons * 4;
       pints = quarts * 2;
       cups = pints * 2;
       tablespoons = cups * 16;
       System.out.println("In " + gallons + " gallons there are:");
       System.out.println(quarts + " quarts");
       System.out.println(pints + " pints");
       System.out.println(cups + " cups");
       System.out.println(tablespoons + " tablespoons");





    }
}