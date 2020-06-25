package test.com.drobot.task4.service;

import com.drobot.task4.entity.CustomArray;
import com.drobot.task4.service.NumberService;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NumberServiceTest {

    @Test
    public void findMinElement_True() {
        int[] array = {5, 6, 1, 3};
        CustomArray customArray = new CustomArray(array);
        NumberService numberService = new NumberService();

        int actual = numberService.findMinElement(customArray);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    public void findMinElement_False() {
        int[] array = {5, 6, 1, 3};
        CustomArray customArray = new CustomArray(array);
        NumberService numberService = new NumberService();

        int actual = numberService.findMinElement(customArray);
        int expected = 6;

        assertNotEquals(actual, expected);
    }

    @Test
    public void findMaxElement_True() {
        int[] array = {5, 6, 1, 3};
        CustomArray customArray = new CustomArray(array);
        NumberService numberService = new NumberService();

        int actual = numberService.findMaxElement(customArray);
        int expected = 6;

        assertEquals(actual, expected);
    }

    @Test
    public void findMaxElement_False() {
        int[] array = {5, 6, 1, 3};
        CustomArray customArray = new CustomArray(array);
        NumberService numberService = new NumberService();

        int actual = numberService.findMaxElement(customArray);
        int expected = 1;

        assertNotEquals(actual, expected);
    }

    @Test
    public void isNumberNatural_True() {
        int number = 3;
        NumberService numberService = new NumberService();
        boolean condition = numberService.isNumberNatural(number);

        assertTrue(condition);
    }

    @Test
    public void isNumberNatural_False() {
        int number = 30;
        NumberService numberService = new NumberService();
        boolean condition = numberService.isNumberNatural(number);

        assertFalse(condition);
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

    @Test
    public void isNumberFibonachi_True() {
        NumberService numberService = new NumberService();
        int number = 34;
        boolean condition = numberService.isNumberFibonachi(number);

        assertTrue(condition);
    }

    @Test
    public void isNumberFibonachi_False() {
        NumberService numberService = new NumberService();
        int number = 30;
        boolean condition = numberService.isNumberFibonachi(number);

        assertFalse(condition);
    }

    @Test
    public void areDigitsEqual_True() {
        NumberService numberService = new NumberService();
        int number = 3333;
        boolean condition = numberService.areDigitsEqual(number);

        assertTrue(condition);
    }

    @Test
    public void areDigitsEqual_False() {
        NumberService numberService = new NumberService();
        int number = 33000033;
        boolean condition = numberService.areDigitsEqual(number);

        assertFalse(condition);
    }

    @Test
    public void getDigitsAmount_True() {
        NumberService numberService = new NumberService();
        int number = 1;

        int actual = numberService.getDigitsAmount(number);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    public void getDigitsAmount_False() {
        NumberService numberService = new NumberService();
        int number = 0;

        int actual = numberService.getDigitsAmount(number);
        int expected = 0;

        assertNotEquals(actual, expected);
    }
}
