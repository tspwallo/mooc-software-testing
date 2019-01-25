package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class MirrorTest {

    @ParameterizedTest
    @CsvSource({"a, a", "aa, aa", "abXYZba, ab", "abca, a", "abba, abba", "aba, aba"})
    public void testMirrorEnds(String str, String expectedResult) {
        Mirror mirror = new Mirror();
        Assertions.assertEquals(expectedResult, mirror.mirrorEnds(str));
    }
}