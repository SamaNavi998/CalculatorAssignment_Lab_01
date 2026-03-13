package TestCalculator;

import Calculator.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {
    Calculator calculator;
    @Before
    public void setUP(){
        calculator = new Calculator();
    }

    @Test
    public void testAddPositive(){
        int a = 2;
        int b = 4;

        Assert.assertEquals(6,calculator.addition(a,b));
        //assertThat(calculator.addition(a,b)).isEqualTo(6);
    }
    @Test
    public void testAddNegative(){
        int a = -2;
        int b = -4;

        assertThat(calculator.addition(a,b)).isEqualTo(-6);
        //Assert.assertEquals(-6,calculator.addition(a,b));
    }
}
