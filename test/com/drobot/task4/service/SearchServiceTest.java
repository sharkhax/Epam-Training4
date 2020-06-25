package test.com.drobot.task4.service;

import com.drobot.task4.entity.CustomArray;
import com.drobot.task4.service.SearchService;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SearchServiceTest {

    @Test
    public void binarySearch_True() {
        SearchService searchService = new SearchService();
        int[] array = {1, 5, 6, 7, 8, 9, 10};
        CustomArray customArray = new CustomArray(array);

        int actual = searchService.binarySearch(customArray, 8);
        int expected = 4;

        assertEquals(actual, expected);
    }

    @Test
    public void binarySearch_False() {
        SearchService searchService = new SearchService();
        int[] array = {1, 5, 6, 7, 8, 9, 10};
        CustomArray customArray = new CustomArray(array);

        int actual = searchService.binarySearch(customArray, 8);
        int expected = -1;

        assertNotEquals(actual, expected);
    }
}
