package com.teachmeskills.lesson_4;

import java.util.Scanner;

public class Task0 {

    public static void main(String[] args) {
        //Создайте массив целых чисел. Напишете программу, которая выводит
        //сообщение о том, входит ли заданное число в массив или нет.
        //Пусть число для поиска задается с консоли (класс Scanner).

        int[] array = {2, 424, 353, 1, 34, 5, 6, 2, 52, 5, 14, 14, 45, 5, 24, 234, 234, 23};
        Scanner scanner = new Scanner(System.in);
        int enteredNumber = 0;

        System.out.print("Enter the number: ");
        enteredNumber = scanner.nextInt();

        for (int item : array) {
            if (item == enteredNumber) {
                System.out.println("There is such a number in the array");
                return;
            }
        }

        System.out.println("There is no such number in the array");
    }
}
