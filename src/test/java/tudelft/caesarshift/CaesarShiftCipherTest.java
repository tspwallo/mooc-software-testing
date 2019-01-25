package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {

    @ParameterizedTest
    @CsvSource({"abc, 3, def", "xyz, 3, abc", "a, 0, a", "fk, -1, ej"})
    public void testCaesarShiftCipher(String message, int shift, String expectedResult) {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        Assertions.assertEquals(expectedResult, cipher.CaesarShiftCipher(message, shift));
    }

}
