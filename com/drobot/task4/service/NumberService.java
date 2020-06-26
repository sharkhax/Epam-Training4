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

    public CustomArray getNaturalNumbers(CustomArray customArray) {
        int[] array = getArrayFromCustom(customArray);
        int counter = 0;

        for (int a : array) {
            if (isNumberNatural(a)) {
                counter++;
            }
        }

        CustomArray result = new CustomArray(counter);
        counter = 0;

        for (int a : array) {
            if (isNumberNatural(a)) {
                result.setElement(a, counter);
                counter++;
            }
        }
        return result;
    }

    public CustomArray getFibonacciNumbers(CustomArray customArray) {
        int[] array = getArrayFromCustom(customArray);
        int counter = 0;

        for (int a : array) {
            if (isNumberFibonacci(a)) {
                counter++;
            }
        }

        CustomArray result = new CustomArray(counter);
        counter = 0;

        for (int a : array) {
            if (isNumberFibonacci(a)) {
                result.setElement(a, counter);
                counter++;
            }
        }
        return result;
    }

    public CustomArray getDifferentDigitsNumbers(CustomArray customArray) {
        int[] array = getArrayFromCustom(customArray);
        int counter = 0;

        for (int a : array) {
            if (!containsEqualDigits(a)) {
                counter++;
            }
        }

        CustomArray result = new CustomArray(counter);
        counter = 0;

        for (int a : array) {
            if (!containsEqualDigits(a)) {
                result.setElement(a, counter);
                counter++;
            }
        }
        return result;
    }

    public int[] getArrayFromCustom(CustomArray customArray) {
        int[] array = new int[customArray.length()];

        for (int i = 0; i < customArray.length(); i++) {
            array[i] = customArray.getElement(i);
        }

        return array;
    }

    private boolean isNumberNatural(int number) {
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

    private boolean isNumberFibonacci(int number) {
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

    private boolean containsEqualDigits(int number) {
        boolean result = false;
        int buffer;
        int current;
        int divider;
        int n;
        int digit;

        for (int i = 1; i <= getDigitsAmount(number); i++) {
            digit = getDigit(number, i - 1);
            n = i + 1;

            while (true) {
                divider = (int) Math.pow(10, n);

                if (number * 10 / divider == 0) {
                    break;
                }

                buffer = number % divider;
                current = buffer / (int) Math.pow(10, n - 1);

                if (current == digit) {
                    result = true;
                    break;
                } else {
                    n++;
                }
            }
            if (result) {
                break;
            }
        }
        return result;
    }

    private int getDigitsAmount(int number) {
        int n = 1;
        int divider = 10;

        while (number / divider != 0) {
            n++;
            divider = divider * 10;
        }
        return n;
    }

    private int getDigit(int number, int position) {
        return number % (int) Math.pow(10, position + 1)
                / (int) Math.pow(10, position);
    }
}
