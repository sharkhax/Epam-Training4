package test.com.drobot.task4.service;

import com.drobot.task4.entity.CustomArray;
import com.drobot.task4.service.SortService;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class SortServiceTest {

    @Test
    public void bubbleSort_True() {
        int[] array = {5, 4, 9, 1, 8, 2};
        CustomArray customArray = new CustomArray(array);
        SortService sortService = new SortService();
        customArray = sortService.bubbleSort(customArray);
        int[] actual = new int[customArray.length()];
        int[] expected = {1, 2, 4, 5, 8, 9};

        for (int i = 0; i < actual.length; i++) {
            actual[i] = customArray.getElement(i);
        }

        assertEquals(actual, expected);
    }

    @Test
    public void bubbleSort_False() {
        int[] array = {5, 4, 9, 1, 8, 2};
        CustomArray customArray = new CustomArray(array);
        SortService sortService = new SortService();
        customArray = sortService.bubbleSort(customArray);
        int[] actual = new int[customArray.length()];
        int[] expected = {5, 4, 9, 1, 8, 2};

        for (int i = 0; i < actual.length; i++) {
            actual[i] = customArray.getElement(i);
        }

        assertNotEquals(actual, expected);
    }

    @Test
    public void selectionSort_True() {
        int[] array = {5, 4, 9, 1, 8, 2};
        CustomArray customArray = new CustomArray(array);
        SortService sortService = new SortService();
        customArray = sortService.selectionSort(customArray);
        int[] actual = new int[customArray.length()];
        int[] expected = {1, 2, 4, 5, 8, 9};

        for (int i = 0; i < actual.length; i++) {
            actual[i] = customArray.getElement(i);
        }

        assertEquals(actual, expected);
    }

    @Test
    public void selectionSort_False() {
        int[] array = {5, 4, 9, 1, 8, 2, 30, 23, 74, 50};
        CustomArray customArray = new CustomArray(array);
        SortService sortService = new SortService();
        customArray = sortService.selectionSort(customArray);
        int[] actual = new int[customArray.length()];
        int[] expected = {5, 4, 9, 1, 8, 2, 30, 23, 74, 50};

        for (int i = 0; i < actual.length; i++) {
            actual[i] = customArray.getElement(i);
        }

        assertNotEquals(actual, expected);
    }

    @Test
    public void shakerSort_True() {
        int[] array = {5, 4, 9, 1, 8, 2};
        CustomArray customArray = new CustomArray(array);
        SortService sortService = new SortService();
        customArray = sortService.shakerSort(customArray);
        int[] actual = new int[customArray.length()];
        int[] expected = {1, 2, 4, 5, 8, 9};

        for (int i = 0; i < actual.length; i++) {
            actual[i] = customArray.getElement(i);
        }

        assertEquals(actual, expected);
    }

    @Test
    public void shakerSort_False() {
        int[] array = {5, 4, 9, 1, 8, 2};
        CustomArray customArray = new CustomArray(array);
        SortService sortService = new SortService();
        customArray = sortService.shakerSort(customArray);
        int[] actual = new int[customArray.length()];
        int[] expected = {5, 4, 9, 1, 8, 2};

        for (int i = 0; i < actual.length; i++) {
            actual[i] = customArray.getElement(i);
        }

        assertNotEquals(actual, expected);
    }
}
