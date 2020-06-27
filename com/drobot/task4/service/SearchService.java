package com.drobot.task4.service;

import com.drobot.task4.entity.CustomArray;

public class SearchService {

    public int binarySearch(CustomArray customArray, int key) {
        int result;
        int[] array = new int[customArray.length()];

        for (int i = 0; i < array.length; i++) {
            array[i] = customArray.getElement(i);
        }

        int left = 0;
        int right = array.length - 1;

        while (true) {
            if (left > right) {
                result = -1;
                break;
            }

            int middle = (right + left) / 2;

            if (array[middle] == key) {
                result = middle;
                break;
            }

            if (array[middle] < key) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }

        }
        return result;
    }
}
