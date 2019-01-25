package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {

    @ParameterizedTest
    @CsvSource({"g,false", "xxggxx,true", "xxgxx,false", "xxggyygxx,false"})
    public void testGhappy(String str, boolean expectedResult) {
        GHappy ghappy = new GHappy();
        Assertions.assertEquals(expectedResult, ghappy.gHappy(str));
    }
}
