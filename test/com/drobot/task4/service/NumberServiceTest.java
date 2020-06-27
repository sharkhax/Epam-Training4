package test.com.drobot.task4.service;

import com.drobot.task4.entity.CustomArray;
import com.drobot.task4.service.NumberService;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NumberServiceTest {

    @Test
    public void min_True() {
        int[] array = {5, 6, 1, 3};
        CustomArray customArray = new CustomArray(array);
        NumberService numberService = new NumberService();

        int actual = numberService.min(customArray);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    public void min_False() {
        int[] array = {5, 6, 1, 3};
        CustomArray customArray = new CustomArray(array);
        NumberService numberService = new NumberService();

        int actual = numberService.min(customArray);
        int expected = 6;

        assertNotEquals(actual, expected);
    }

    @Test
    public void max_True() {
        int[] array = {5, 6, 1, 3};
        CustomArray customArray = new CustomArray(array);
        NumberService numberService = new NumberService();

        int actual = numberService.max(customArray);
        int expected = 6;

        assertEquals(actual, expected);
    }

    @Test
    public void max_False() {
        int[] array = {5, 6, 1, 3};
        CustomArray customArray = new CustomArray(array);
        NumberService numberService = new NumberService();

        int actual = numberService.max(customArray);
        int expected = 1;

        assertNotEquals(actual, expected);
    }

    @Test
    public void getNaturalNumbers_True() {
        int[] array = {2, 3, 5, 4, 10, 20};
        int[] expectedArray = {2, 3, 5};
        CustomArray customArray = new CustomArray(array);
        NumberService numberService = new NumberService();

        CustomArray actual = numberService.getNaturalNumbers(customArray);
        CustomArray expected = new CustomArray(expectedArray);

        assertEquals(actual, expected);
    }

    @Test
    public void getNaturalNumbers_False() {
        int[] array = {2, 3, 5, 4, 10, 20};
        int[] expectedArray = {2, 3, 5, 10};
        CustomArray customArray = new CustomArray(array);
        NumberService numberService = new NumberService();

        CustomArray actual = numberService.getNaturalNumbers(customArray);
        CustomArray expected = new CustomArray(expectedArray);

        assertNotEquals(actual, expected);
    }

    @Test
    public void getFibonacciNumbers_True() {
        int[] array = {2, 3, 5, 4, 13, 20};
        int[] expectedArray = {2, 3, 5, 13};
        CustomArray customArray = new CustomArray(array);
        NumberService numberService = new NumberService();

        CustomArray actual = numberService.getFibonacciNumbers(customArray);
        CustomArray expected = new CustomArray(expectedArray);

        assertEquals(actual, expected);
    }

    @Test
    public void getFibonacciNumbers_False() {
        int[] array = {2, 3, 5, 4, 13, 20};
        int[] expectedArray = {2, 3, 5, 20};
        CustomArray customArray = new CustomArray(array);
        NumberService numberService = new NumberService();

        CustomArray actual = numberService.getFibonacciNumbers(customArray);
        CustomArray expected = new CustomArray(expectedArray);

        assertNotEquals(actual, expected);
    }

    @Test
    public void getDifferentDigitsNumbers_True() {
        int[] array = {221, 312, 565, 480, 131, 230};
        int[] expectedArray = {312, 480, 230};
        CustomArray customArray = new CustomArray(array);
        NumberService numberService = new NumberService();

        CustomArray actual = numberService.getDifferentDigitsNumbers(customArray);
        CustomArray expected = new CustomArray(expectedArray);

        assertEquals(actual, expected);
    }

    @Test
    public void getDifferentDigitsNumbers_False() {
        int[] array = {221, 312, 565, 480, 131, 230};
        int[] expectedArray = {312, 480, 230, 131};
        CustomArray customArray = new CustomArray(array);
        NumberService numberService = new NumberService();

        CustomArray actual = numberService.getDifferentDigitsNumbers(customArray);
        CustomArray expected = new CustomArray(expectedArray);

        assertNotEquals(actual, expected);
    }

    @Test
    public void getArrayFromCustom_True() {
        int[] array = {5, 6, 8, 2};
        CustomArray customArray = new CustomArray(array);
        NumberService numberService = new NumberService();

        int[] actual = numberService.getArrayFromCustom(customArray);
        int[] expected = {5, 6, 8, 2};

        assertEquals(actual, expected);
    }

    @Test
    public void getArrayFromCustom_False() {
        int[] array = {5, 6, 8, 2};
        CustomArray customArray = new CustomArray(array);
        NumberService numberService = new NumberService();

        int[] actual = numberService.getArrayFromCustom(customArray);
        int[] expected = {2, 3};

        assertNotEquals(actual, expected);
    }
}
