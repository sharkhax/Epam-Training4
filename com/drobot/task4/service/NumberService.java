package com.drobot.task4.service;

import com.drobot.task4.entity.CustomArray;

public class NumberService {

    public int findMinElement(CustomArray customArray) {
        int min = customArray.getElement(0);

        for (int i = 1; i < customArray.length(); i++) {
            int element = customArray.getElement(i);

            if (element < min) {
                min = customArray.getElement(i);
            }
        }

        return min;
    }

    public int findMaxElement(CustomArray customArray) {
        int max = customArray.getElement(0);

        for (int i = 1; i < customArray.length(); i++) {
            int element = customArray.getElement(i);

            if (element > max) {
                max = customArray.getElement(i);
            }
        }

        return max;
    }

    public boolean isNumberNatural(int number) {
        int var = 2;
        boolean isNatural;

        if (number > 1) {
            while (number != var) {

                if (number % var != 0) {
                    var++;
                } else {
                    return false;
                }
            }
            isNatural = true;

        } else {
            isNatural = false;
        }

        return isNatural;
    }

    public int[] getArrayFromCustom(CustomArray customArray) {
        int[] array = new int[customArray.length()];

        for (int i = 0; i < customArray.length(); i++) {
            array[i] = customArray.getElement(i);
        }

        return array;
    }

    public boolean isNumberFibonachi(int number) {
        if (number == 0 || number == 1 || number == 2) {
            return true;
        }

        int f1 = 1;
        int f2 = 2;
        int f = f2;

        while (number > f) {
            f = f2 + f1;

            if (number == f) {
                return true;
            } else {
                f1 = f2;
                f2 = f;
            }
        }
        return false;
    }

    public int getDigitsAmount(int number) {
        int n = 1;
        int divider = 10;

        while (number / divider != 0) {
            n++;
            divider = divider * 10;
        }
        return n;
    }

    public boolean areDigitsEqual(int number) {
        final int digit = number % 10;

        boolean result;
        int n = 2;
        int current;
        int buffer;
        int divider;

        while (true) {
            divider = (int) Math.pow(10, n);

            if (number / divider == 0) {
                result = true;
                break;
            }

            current = number % divider;
            buffer = current / (int) Math.pow(10, n - 1);

            if (buffer == digit) {
                n++;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}
