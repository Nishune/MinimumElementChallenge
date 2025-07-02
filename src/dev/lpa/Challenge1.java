package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Challenge1 {

    public static void main(String[] args) {

        int number = readInteger();
        System.out.println(number);
        int[] newArray = readElements(number);
        System.out.println(Arrays.toString(newArray));
        System.out.println(findMin(newArray));

    }

    private static int readInteger() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number =  sc.nextInt();
        return number;
    }

    private static int[] readElements(int number) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter " + number + " numbers: ");
        int[] numbers = new int[number];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        return numbers;
    }

    private static int findMin(int[] minNumber) {
        Arrays.sort(minNumber);
        return minNumber[0];


    }


}
