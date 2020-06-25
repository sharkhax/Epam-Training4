package com.drobot.task4.service;

import com.drobot.task4.entity.CustomArray;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FillService {

    public CustomArray fillFromFile(String fileName) throws IOException {
        FileReader fileReader = new FileReader(fileName);
        BufferedReader reader = new BufferedReader(fileReader);
        String stringLine = reader.readLine();
        String[] stringArray = stringLine.split(" ");
        int[] array = new int[stringArray.length];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(stringArray[i]);
        }

        return new CustomArray(array);
    }

    public CustomArray fillRandom(int length, int minValue, int maxValue) {
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * maxValue + minValue);
        }
        return new CustomArray(array);
    }

    public CustomArray fillFromConsole() {
        Scanner scanner = new Scanner(System.in);
        String stringLine = scanner.nextLine();
        String[] stringArray = stringLine.split(" ");
        int[] array = new int[stringArray.length];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(stringArray[i]);
        }

        return new CustomArray(array);
    }
}
