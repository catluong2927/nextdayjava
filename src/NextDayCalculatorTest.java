
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class NextDayCalculatorTest {
    @Test
    public void NextDayCalculatorTest0() {

        String expected = 2 + "/" + 1 + "/" + 2018;

        String result = NextDayCalculator.isNextDayCalculator(1,1,2018);
        assertEquals(expected, result);
    }

    @Test
    public void NextDayCalculatorTest1() {

        String expected = 1 + "/" + 2 + "/" + 2018;

        String result = NextDayCalculator.isNextDayCalculator(31,1,2018);
        assertEquals(expected, result);
    }

    @Test
    public void NextDayCalculatorTest2() {

        String expected = 1 + "/" + 5 + "/" + 2018;

        String result = NextDayCalculator.isNextDayCalculator(30,4,2018);
        assertEquals(expected, result);
    }

    @Test
    public void NextDayCalculatorTest3() {

        String expected = 1 + "/" + 3 + "/" + 2018;

        String result = NextDayCalculator.isNextDayCalculator(28,2,2018);
        assertEquals(expected, result);
    }

    @Test
    public void NextDayCalculatorTest4() {

        String expected = 1 + "/" + 3 + "/" + 2020;

        String result = NextDayCalculator.isNextDayCalculator(29,2,2020);
        assertEquals(expected, result);
    }

    @Test
    public void NextDayCalculatorTest5() {

        String expected = 1 + "/" + 1 + "/" + 2019;

        String result = NextDayCalculator.isNextDayCalculator(31,12,2018);
        assertEquals(expected, result);
    }

}
