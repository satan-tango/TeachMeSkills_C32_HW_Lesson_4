package com.teachmeskills.lesson_4;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        //Создайте и заполните массив случайным числами и выведете максимальное,
        //минимальное и среднее значение. Для генерации случайного числа используйте
        //метод Math.random(). Пусть будет возможность создавать массив произвольного
        //размера. Пусть размер массива вводится с консоли.

        int[] array = new int[0];
        int option = 0;
        int length = 0;
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;

        while (!flag) {
            System.out.println("1 - Generate array with random length");
            System.out.println("2 - Enter the length of the array by hand");
            System.out.print("select option: ");
            option = scanner.nextInt();

            if (option == 1) {
                array = new int[generateRandomNumber(1, 20)];
                flag = true;
            } else if (option == 2) {
                System.out.print("Enter the length of the array: ");
                length = scanner.nextInt();

                if (length <= 0 || length > 100) {
                    System.out.println("Incorrect data, try again!");
                } else {
                    array = new int[length];
                    flag = true;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = generateRandomNumber(1, 100);
        }

        int minValue = array[0];
        int maxValue = array[0];
        int averageValue = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
            if (array[i] < minValue) {
                minValue = array[i];
            }
            averageValue += array[i];
        }

        System.out.print("Source array:");
        for (int item : array) {
            System.out.print(item + " ");
        }

        System.out.printf("\nMax value: %d\nMin value: %d\nAverage value: %d", maxValue, minValue, averageValue / array.length);

    }

    public static int generateRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min - 1)) + min;
    }
}
