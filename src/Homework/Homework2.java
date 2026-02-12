package Homework;


import java.util.ArrayList;
import java.util.Collections;


public class Homework2 {


    public static void main(String[] args) {


        for (int i = 0; i < 30; i++)
            if (i % 2 != 0) {
                System.out.println(i);
            }


        double[] array = {8.1, 5.5, 31.6, 15.3, 1.8};

        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        double average = sum / array.length;

        System.out.println("average is: " + average);


        int[] numbers = {1, 3, 5, 7, 9};

        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println(min);


        ArrayList<Integer> numbers1 = new ArrayList<>();
        {

            numbers1.add(1);
            numbers1.add(3);
            numbers1.add(5);
            numbers1.add(7);
            numbers1.add(9);


            Collections.sort(numbers1);

            int minList = numbers1.get(0);

            System.out.println(minList);
        }
    }


}





















