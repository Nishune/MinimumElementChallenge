package dev.lpa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] returnedArray = readIntegers();
        System.out.println("The minimum number is " + findMin(returnedArray));

    }

    private static int [] readIntegers() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number, separated by commas: ");
        String input = scanner.nextLine();
        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for (int i = 0; i < splits.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim());
        }

        return values;

    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int el : array) {
            if (el < min) {
                min = el;
            }

        }
        return min;
    }
}
