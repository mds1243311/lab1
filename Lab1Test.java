import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;

/**
 * Tests for the {@link Lab01} class
 *
 * @author CS 245 Data Structure & Algorithm (University of San Francisco)
 * @version Fall 2022
 */
public class Lab1Test {

    public static List<Integer> expected = List.of(1, 2, 3, 5, 8, 13, 21, 34, 55, 89,
            144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946,
            17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269,
            2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141,
            267914296, 433494437, 701408733, 1134903170, 1836311903);

    /**
     * Test input 1-45 on the iterative DP function
     * @param n number 1-45 to be tested
     */
    @ParameterizedTest(name = "[Test \"{0}\"]")
    @ValueSource(ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
            11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21,
            22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32,
            33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43,
            44, 45})
    public void testIterative(int n) {
        int actual = Lab01.climbStairsIterative(n);
        int expect = expected.get(n-1);
        Assertions.assertEquals(expect, actual);
    }

    /**
     * Test input 1-45 on the recursive DP function
     */
    @Test
    public void testRecursive() {
        List<Integer> actual = new ArrayList<>();
        for (int i = 1; i <= 45 ; i++) {
            actual.add(Lab01.climbStairsRecursive(i));
        }
        Assertions.assertEquals(expected, actual);
    }

}
