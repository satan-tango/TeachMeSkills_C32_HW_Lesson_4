package com.teachmeskills.lesson_4;

public class Task3 {

    public static void main(String[] args) {
        //Создайте 2 массива из 5 чисел. Выведите массивы на консоль в двух отдельных
        //строках. Посчитайте среднее арифметическое элементов каждого массива и сообщите,
        //для какого из массивов это значение оказалось больше (либо сообщите, что их
        //средние арифметические равны).

        int[] firstArray = {3, 5, 2, 7, 3};
        int[] secondArray = {1, 5, 9, 10, 0};

        System.out.print("First array: ");
        showArray(firstArray);
        System.out.print("Second array: ");
        showArray(secondArray);

        int firstArrayAverageValue = averageValue(firstArray);
        int secondArrayAverageValue = averageValue(secondArray);

        System.out.println("First array AV: " + firstArrayAverageValue);
        System.out.println("Second array AV: " + secondArrayAverageValue);
        if (firstArrayAverageValue > secondArrayAverageValue) {
            System.out.println("First array AV > Second array AV");
        } else if (firstArrayAverageValue < secondArrayAverageValue) {
            System.out.println("First array AV < Second array AV");
        } else {
            System.out.println("First array AV = Second array AV");
        }
    }

    public static void showArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int averageValue(int[] array) {
        int averageValue = 0;
        for (int i = 0; i < array.length; i++) {
            averageValue += array[i];
        }

        return averageValue / array.length;
    }
}
