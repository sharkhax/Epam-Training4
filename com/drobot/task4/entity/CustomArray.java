package com.drobot.task4.entity;

import java.util.Arrays;

public class CustomArray {

    private int[] array;

    public CustomArray(int[] array) {
        this.array = array;
    }

    public CustomArray(int elementsNumber) {
        array = new int[elementsNumber];
    }

    public int getElement(int index) {
        return array[index];
    }

    public int length() {
        return array.length;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public boolean isIndexCorrect(int index) {
        return index > 0 && index < array.length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        CustomArray that = (CustomArray) o;

        return Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CustomArray{");

        sb.append("array=").append(Arrays.toString(array));
        sb.append('}');

        return sb.toString();
    }
}