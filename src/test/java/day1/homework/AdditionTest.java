package day1.homework;

import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionTest {

    @Test
    public void testDefaultAdditionImplementation_twoIntValues_intResult() {
        int expectedResult = 787878788;

        int actualResult = Addition.add(787878787, 1);

        assertThat(actualResult, Is.is(expectedResult));
    }

    @Test
    public void testDefaultAdditionImplementation_twoIntValues_intResult2() {
        int expectedResult = Integer.MAX_VALUE;
        int actualResult = Addition.add(0x7fffffff+ 1, 1);

        assertThat(actualResult, Is.is(expectedResult));
    }
}