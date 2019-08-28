/* COMP 3700
   Assignment 2
   Test file for the class Finder.
   Zihao Yan
   8.28.2019
 */

import org.junit.*;
import static org.junit.Assert.assertEquals;

public class JUnitTestFinder {
    //Test for the function findMax() with numbers in the array.
    @Test
    public void test_findMax_withNums() {
        Finder operation = new Finder();
        int[] array = {4, 5, 3, 9, 10, 8, 0, 1};
        int expectedResult = 10;
        int actualResult = operation.findMax(array);

        //test
        assertEquals(actualResult, expectedResult);
    }

    //Test for the function findMax() with empty array.
    @Test
    public void test_findMax_withoutNum() {
        Finder operation = new Finder();
        int[] array = null;
        Integer expectedResult = null;
        Integer actualResult = operation.findMax(array);

        //test
        assertEquals(actualResult, expectedResult);
    }

    //Test for the function findMin() with numbers in the array.
    @Test
    public void test_findMin_withNums() {
        Finder operation = new Finder();
        int[] array = {4, 5, 3, 9, 10, 8, 0, 1};
        int expectedResult = 0;
        int actualResult = operation.findMin(array);

        //test
        assertEquals(actualResult, expectedResult);
    }

    //Test for the function findMin() with empty array.
    @Test
    public void test_findMin_withoutNum() {
        Finder operation = new Finder();
        int[] array = null;
        Integer expectedResult = null;
        Integer actualResult = operation.findMin(array);

        //test
        assertEquals(actualResult, expectedResult);
    }
}
