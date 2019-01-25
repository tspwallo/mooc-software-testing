package tudelft.tw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyRomanTest {

    @BeforeEach
    public void initialize() {
        System.out.print("This method is called before each test!\n");
    }

    @Test
    void testConvertI() {
        assertEquals(1 , MyRoman.convert("I"));
    }
    @Test
    void testConvertV() {
        assertEquals(5 , MyRoman.convert("V"));
    }
    @Test
    void testConvertX() {
        assertEquals(10 , MyRoman.convert("X"));
    }
    @Test
    void testConvertL() {
        assertEquals(50, MyRoman.convert("L"));
    }
    @Test
    void testConvertC() {
        assertEquals(100 , MyRoman.convert("C"));
    }
    @Test
    void testConvertD() {
        assertEquals(500 , MyRoman.convert("D"));
    }
    @Test
    void testConvertM() {
        assertEquals(1000 , MyRoman.convert("M"));
    }

    @Test
    void testConvertII() {
        assertEquals(2 , MyRoman.convert("II"));
    }
    @Test
    void testConvertIII() {
        assertEquals(3 , MyRoman.convert("III"));
    }
    @Test
    void testConvertIV() {
        assertEquals(4 , MyRoman.convert("IV"));
    }
    @Test
    void testConvertVI() {
        assertEquals(6 , MyRoman.convert("VI"));
    }
    @Test
    void testConvertVII() {
        assertEquals(7 , MyRoman.convert("VII"));
    }
    @Test
    void testConvertVIII() {
        assertEquals(8 , MyRoman.convert("VIII"));
    }
    @Test
    void testConvertIX() {
        assertEquals(9 , MyRoman.convert("IX"));
    }
    @Test
    void testConvertXI() {
        assertEquals(11 , MyRoman.convert("XI"));
    }
    @Test
    void testConvertXII() {
        assertEquals(12 , MyRoman.convert("XII"));
    }
    @Test
    void testConvertXIII() {
        assertEquals(13 , MyRoman.convert("XIII"));
    }
    @Test
    void testConvertXIV() {
        assertEquals(14 , MyRoman.convert("XIV"));
    }
    @Test
    void testConvertXV() {
        assertEquals(15 , MyRoman.convert("XV"));
    }
    @Test
    void testConvertXIX() {
        assertEquals(19 , MyRoman.convert("XIX"));
    }
    @Test
    void testConvertXX() {
        assertEquals(20 , MyRoman.convert("XX"));
    }
    @Test
    void testConvertXL() {
        assertEquals(40 , MyRoman.convert("XL"));
    }
    @Test
    void testConvertXC() {
        assertEquals(90 , MyRoman.convert("XC"));
    }
    @Test
    void testConvertCD() {
        assertEquals(400 , MyRoman.convert("CD"));
    }
    @Test
    void testConvertCM() {
        assertEquals(900 , MyRoman.convert("CM"));
    }
    @Test
    void testConvertTo39() {
        assertEquals(39 , MyRoman.convert("XXXIX"));
    }
    @Test
    void testConvertTo246() {
        assertEquals(246 , MyRoman.convert("CCXLVI"));
    }
    @Test
    void testConvertTo207() {
        assertEquals(207 , MyRoman.convert("CCVII"));
    }
    @Test
    void testConvertTo1066() {
        assertEquals(1066 , MyRoman.convert("MLXVI"));
    }
    @Test
    void testConvertTo1776() {
        assertEquals(1776 , MyRoman.convert("MDCCLXXVI"));
    }
    @Test
    void testConvertTo1954() {
        assertEquals(1954 , MyRoman.convert("MCMLIV"));
    }
    @Test
    void testConvertTo1990() {
        assertEquals(1990 , MyRoman.convert("MCMXC"));
    }
    @Test
    void testConvertTo2014() {
        assertEquals(2014 , MyRoman.convert("MMXIV"));
    }
    @Test
    void testConvertTo2018() {
        assertEquals(2018 , MyRoman.convert("MMXVIII"));
    }

}