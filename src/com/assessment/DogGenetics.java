package com.assessment;

import java.util.Random;
import java.util.Scanner;

public class DogGenetics {

    public static void main(String[] args) {

        int sum = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("What is your dogs name?");
        String dogName = input.nextLine().trim();

        Random rand = new Random();
        int randomPercent = rand.nextInt(100) + 1;

        int dogBreedStBernard = 0, dogBreedChihuahua = 0, dogBreedRedNosed = 0 ,dogBreedCommon = 0,  dogBreedDoberman = 0;

        while (sum < 100) {
            dogBreedStBernard = rand.nextInt(100) + 1;
            dogBreedChihuahua = rand.nextInt(100) + 1;
            dogBreedRedNosed = rand.nextInt(100) + 1;
            dogBreedCommon = rand.nextInt(100) + 1;
            dogBreedDoberman = rand.nextInt(100) + 1;

            sum = dogBreedStBernard + dogBreedChihuahua + dogBreedRedNosed + dogBreedCommon + dogBreedDoberman;
        }

        System.out.printf(" St. Bernard %d%n Chihuahua %d%n Dramatic RedNosed Asian Pug %d%n Common Cur %d%n King Doberman %d%n",
                            dogBreedStBernard, dogBreedChihuahua, dogBreedRedNosed, dogBreedCommon, dogBreedDoberman);



    }
}
