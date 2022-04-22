package com.assessment;

import java.util.Scanner;

public class HealthyHearts {

    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);
        final int heartRate = 220;
        final float minZone = 0.5F;
        final float maxZone = 0.85F;


        while (true) {
            System.out.println("What is your age?:");
            int age = Integer.parseInt(inputScanner.nextLine());
            if (age > 0) {
                System.out.println("Your maximum hear rate = " + (heartRate - age));
                System.out.println("Your target HR zone is = " +
                        (heartRate * minZone) + "-" + (heartRate * maxZone) +
                        " beats per minute");
                break;
            }
            System.out.println("Enter valid age");

        }

    }
}

