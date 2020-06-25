package com.drobot.task4.service;

import com.drobot.task4.entity.CustomArray;

public class SortService {

    public CustomArray bubbleSort(CustomArray customArray) {
        boolean isSorted;
        NumberService numberService = new NumberService();
        int[] array = numberService.getArrayFromCustom(customArray);

        do {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {

                if (array[i] > array[i + 1]) {
                    int buffer = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buffer;
                    isSorted = false;
                }
            }
        } while (!isSorted);

        return new CustomArray(array);
    }

    public CustomArray selectionSort(CustomArray customArray) {
        NumberService numberService = new NumberService();
        int[] array = numberService.getArrayFromCustom(customArray);

        for (int left = 0; left < array.length; left++) {
            int k = left;

            for (int i = left + 1; i < array.length; i++) {
                if (array[i] < array[k]) {
                    k = i;
                }
            }

            int buffer = array[k];
            array[k] = array[left];
            array[left] = buffer;
        }

        return new CustomArray(array);
    }

    public CustomArray shakerSort(CustomArray customArray) {
        boolean isSorted = true;
        NumberService numberService = new NumberService();
        int[] array = numberService.getArrayFromCustom(customArray);

        do {
            for (int i = 0; i < array.length - 1; i++) {

                if (array[i] > array[i + 1]) {
                    int buffer = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buffer;
                    isSorted = false;
                }
            }

            if (isSorted) {
                break;
            } else {
                isSorted = true;
            }

            for (int i = array.length - 1; i > 1; i--) {

                if (array[i] < array[i - 1]) {
                    int buffer = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = buffer;
                    isSorted = false;
                }
            }
        } while (!isSorted);

        return new CustomArray(array);
    }
}
