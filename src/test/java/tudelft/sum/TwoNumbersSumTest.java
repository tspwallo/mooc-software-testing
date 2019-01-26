package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoNumbersSumTest {

    private static ArrayList<Integer> empty;
    private static TwoNumbersSum add;

    @BeforeAll
    public static void initialize() {
        empty = new ArrayList<>();
        add = new TwoNumbersSum();
    }

    @Test
    void testAddEmptyToEmpty() {
        ArrayList<Integer> result;
        result = add.addTwoNumbers(empty, empty);
        Assertions.assertEquals(0, result.size());
    }

    @Test
    void testAddEmptyToSingleDigit() {
        ArrayList<Integer> result;
        ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(3));
        result = add.addTwoNumbers(empty, num);
        Assertions.assertEquals(1, result.size());
        int value = result.get(0);
        Assertions.assertEquals(3, value);
    }

    @Test
    void testAddSingleDigitToEmpty() {
        ArrayList<Integer> result;
        ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(7));
        result = add.addTwoNumbers(num, empty);
        Assertions.assertEquals(1, result.size());
        int value = result.get(0);
        Assertions.assertEquals(7, value);
    }

    @Test
    void testSingleDigitsResultInSingleDigit() {
        ArrayList<Integer> result;
        ArrayList<Integer> num1 = new ArrayList<Integer>(Arrays.asList(4));
        ArrayList<Integer> num2 = new ArrayList<Integer>(Arrays.asList(5));
        result = add.addTwoNumbers(num1, num2);
        Assertions.assertEquals(1, result.size());
        int value = result.get(0);
        Assertions.assertEquals(9, value);
    }

    @Test
    void testSingleDigitsResultInDoubleDigits() {
        ArrayList<Integer> result;
        ArrayList<Integer> num1 = new ArrayList<Integer>(Arrays.asList(8));
        ArrayList<Integer> num2 = new ArrayList<Integer>(Arrays.asList(7));
        result = add.addTwoNumbers(num1, num2);
        Assertions.assertEquals(2, result.size());
        int value = result.get(0);
        Assertions.assertEquals(1, value);
        value = result.get(1);
        Assertions.assertEquals(5, value);
    }

    @Test
    void testMultiDigits() {
        ArrayList<Integer> result;
        ArrayList<Integer> num1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> num2 = new ArrayList<Integer>(Arrays.asList(4, 5, 6));
        result = add.addTwoNumbers(num1, num2);
        Assertions.assertEquals(3, result.size());
        int value = result.get(0);
        Assertions.assertEquals(5, value);
        value = result.get(1);
        Assertions.assertEquals(7, value);
        value = result.get(2);
        Assertions.assertEquals(9, value);
    }
}
