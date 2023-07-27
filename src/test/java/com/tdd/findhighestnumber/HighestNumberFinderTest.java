package com.tdd.findhighestnumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HighestNumberFinderTest {

    @Test
    public void find_highest_in_array_of_one_expect_single_item() {

        // arrange
        int[] arr = {
                10
        };
        HighestNumberFinder cut = new HighestNumberFinder();
        int expectedResult = 10;

        // act
        int actualResult = cut.findHighestNumber(arr);

        // assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void find_highest_in_array_of_two_ascending_expected_second_element() {
        // arrange
        int[] arr = {
                7, 13
        };
        HighestNumberFinder cut = new HighestNumberFinder();
        int expectedResult = 13;

        // act
        int actualResult = cut.findHighestNumber(arr);

        // assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void find_highest_in_array_of_two_descending_expect_first_element() {
        // arrange
        int[] arr = {
                13, 4
        };
        HighestNumberFinder cut = new HighestNumberFinder();
        int expectedResult = 13;

        // act
        int actualResult = cut.findHighestNumber(arr);

        // assert
        assertEquals(expectedResult, actualResult);
    }
}
