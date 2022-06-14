import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    void TwoPlusTwoShouldEqualFour(){
        var cal = new Calculator();
        assertEquals(4,cal.add(2,2));
    }

    @Test
    void TwoPlusThreeShouldEqualsFive(){
        var cal = new Calculator();
        assertEquals(5, cal.add(2,3));
    }

    @Test
    void FourDivideByTwoShouldEqualTwo(){
        var cal = new Calculator();
        assertEquals(2, cal.dividion(4,2));
    }

    @Test
    void SixDivideByTwoShouldEqualThree(){
        var cal = new Calculator();
        assertEquals(4, cal.dividion(8,2));
    }
}
