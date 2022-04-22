package com.assessment;


public class SummativeSums {

    public static void main(String[] args) {
        int[] array1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int[] array2 = { 999, -60, -77, 14, 160, 301 };
        int[] array3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 };

        int output1 = ArraySum(array1);
        int output2 = ArraySum(array2);
        int output3 = ArraySum(array3);

        System.out.printf(" #1 Array Sum: %d%n #2 Array Sum: %d%n #3 Array Sum: %d%n", output1, output2, output3);
    }

    public static int ArraySum(int[] Array) {
        int sum = 0;
        for (int number : Array) {
            sum += number;
        } return sum;

    }
}
