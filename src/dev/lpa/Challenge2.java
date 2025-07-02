package dev.lpa;

import java.util.Arrays;

public class Challenge2 {

    public static void main(String[] args) {

        int[] arrayOne = new int[]{1,2,3,4,5};
        int[] reverseArrayOne = Arrays.copyOf(arrayOne, arrayOne.length);
        System.out.println(Arrays.toString(reverseArrayOne));
        System.out.println("-".repeat(20));
        reverse(reverseArrayOne);


    }

    private static void reverse(int[] numbers) {

        int temp;
        for (int i = 0; i < numbers.length / 2; i++) {
            temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(numbers));

    }
}
