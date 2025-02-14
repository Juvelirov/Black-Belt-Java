package test;

import algo.ReverseInteger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseIntegerTest {

    @Test
    public void testPositiveNumber() {
        assertEquals(321, ReverseInteger.reverse(123));
    }

    @Test
    public void testNegativeNumber() {
        assertEquals(-321, ReverseInteger.reverse(-123));
    }

    @Test
    public void testTrailingZeros() {
        assertEquals(21, ReverseInteger.reverse(120));
        assertEquals(-21, ReverseInteger.reverse(-120));
    }

    @Test
    public void testOverflow() {
        assertEquals(0, ReverseInteger.reverse(1534236469)); // This will overflow
        assertEquals(0, ReverseInteger.reverse(-2147483648)); // This will overflow
    }

    @Test
    public void testSingleDigit() {
        assertEquals(7, ReverseInteger.reverse(7));
        assertEquals(-7, ReverseInteger.reverse(-7));
    }
}
