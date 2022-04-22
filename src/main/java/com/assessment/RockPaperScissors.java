package com.assessment;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String answer = "";
        playRounds();

        while (true) {

            System.out.println("Do you want to continue playing Y/N?");
            answer = input.next().toUpperCase().trim();
            if (answer.equals("Y"))
                playRounds();
            else
                break;
                System.out.println("Thanks for playing");

        }
    }

    public static void playRounds() {
        byte choiceRock = 1;
        byte choicePaper = 2;
        byte choiceScissors = 3;

        int rounds;
        int choice;

        int scoreTie = 0;
        int scoreWin = 0;
        int scoreComp = 0;

        Random rand = new Random();
        int randomHand = rand.nextInt(3) + 1;
        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.println("How many rounds do you want to play?");
            rounds = input.nextInt();
            if (rounds <= 10 && rounds > 0)
                break;
            System.out.println("Maximum number of rounds = 10, minimum number of rounds = 1");
        }

        for (int numRounds = 0; numRounds < rounds; numRounds++) {
            System.out.println("Pick your hand choice");
            System.out.println("Enter 1 for paper");
            System.out.println("Enter 2 for rock");
            System.out.println("Enter 3 for scissors");

            choice = input.nextInt();

            if (choice == randomHand) {
                scoreTie += 1;
            }
            else if (choice == choiceRock && randomHand == choiceScissors) {
                scoreWin += 1;
            } else if (choice == choicePaper && randomHand == choiceRock) {
                scoreWin += 1;
            } else if (choice == choiceScissors && randomHand == choicePaper) {
                scoreWin += 1;
            }
            else {
                scoreComp += 1;
            }

        }
        System.out.printf("Tie Score %d, Win Score %d, Lose Score %d%n", scoreTie, scoreWin, scoreComp);

        if (scoreTie > scoreWin && scoreTie > scoreComp)
            System.out.printf("Its a tie score of %d%n ", scoreTie);
        else if (scoreWin > scoreTie && scoreWin > scoreComp)
            System.out.printf("Its your win, score of %d%n", scoreWin);
        else
            System.out.printf("You lost with a score of %d%n", scoreComp);


    }
}

