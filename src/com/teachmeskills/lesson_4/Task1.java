package com.teachmeskills.lesson_4;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        //Создайте массив целых чисел. Удалите все вхождения заданног числа из массива.
        //Пусть число задается с консоли (класс Scanner). Если такого числа нет -
        //выведите сообщения об этом. Врезультате должен быть новый массив без
        //указанного числа.

        int[] array = {2, 424, 353, 1, 34, 5, 6, 2, 52, 5, 14, 14, 45, 5, 24, 234, 234, 23, 3, 3, 3, 3};
        Scanner scanner = new Scanner(System.in);
        int enteredNumber = 0;

        System.out.print("Enter the number: ");
        enteredNumber = scanner.nextInt();

        boolean isExist = false;
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (enteredNumber == array[i]) {
                isExist = true;
                counter++;
            }
        }

        if (!isExist) {
            System.out.println("There is no such number in the array");
            return;
        }

        int[] transformedArray = new int[array.length - counter];
        counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (enteredNumber != array[i]) {
                transformedArray[counter] = array[i];
                counter++;
            }
        }

        System.out.print("Source array:");
        showArray(array);
        System.out.print("After deleting:");
        showArray(transformedArray);
    }

    public static void showArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
