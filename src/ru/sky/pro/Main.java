package ru.sky.pro;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        printIsLongYear(2020);

        printRecommendApplicationVersion(1, 2015);

        System.out.println("Количество дней доставки: " + calculateDeliveryDays(41));

        findDuplicates("aabccddefgghiijjkk");

        int[] arr = new int[]{3, 2, 1, 6, 5};
        reverseArray(arr);
        System.out.println("revers array: " + Arrays.toString(arr));


    }
//задание 1
    public static void printIsLongYear(int year) {
        boolean yearLong = isYearLong(year);
        printIsLongYearResult(year, yearLong);
    }

    private static boolean isYearLong(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    private static void printIsLongYearResult(int year, boolean yearLong) {
        if (yearLong) {
            System.out.println(year + " - високосный год.");
        } else {
            System.out.println(year + " не является високосным годом.");

        }
    }
//задание 2
    public static void printRecommendApplicationVersion(int clientOS, int deviceYear) {
        boolean deviceIsOld = isDeviceOld(deviceYear);
        System.out.print("Установите ");
        if (deviceIsOld) {
            System.out.print("lite ");
        }
        System.out.print("версию для ");
        if (clientOS == 0) {
            System.out.println("iOS");
        } else {
            System.out.println("Android");
        }

    }
private static boolean isDeviceOld(int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        return deviceYear <= currentYear;
}

//задание 3
public static int calculateDeliveryDays(int deliveryDistance) {
        int result = 1;

        if (deliveryDistance > 20) {
            result++;
        }

        if (deliveryDistance > 60) {
            result++;
        }
        return result;
        }
//задание 4
public static void findDuplicates(String text) {
    char[] letters = text.toCharArray();
    char prevChar = Character.MAX_VALUE;
    for (char letter : letters) {
        if (letter == prevChar) {
        System.out.println("Наден дубль по символу " + letter);
        return;
    }
    prevChar = letter;
}
        System.out.println("Дублей не найдено");
    }
//задание 5
    public static void reverseArray(int[] arr) {
        int head = 0;
        int tail = arr.length - 1;
        while (head <tail) {
            int temp = arr[head];
            arr[head++] = arr[tail];
            arr[tail--] = temp;
        }
    }


}









