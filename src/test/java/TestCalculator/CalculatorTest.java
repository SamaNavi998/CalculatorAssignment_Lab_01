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
    public void TestAddPositive(){
        int a = 2;
        int b = 4;

        Assert.assertEquals(6,calculator.addition(a,b));
        //assertThat(calculator.addition(a,b)).isEqualTo(6);
    }
    @Test
    public void TestAddNegative(){
        int a = -2;
        int b = -4;

        assertThat(calculator.addition(a,b)).isEqualTo(-6);
        //Assert.assertEquals(-6,calculator.addition(a,b));
    }
    @Test
    public void TestFibonacciNegative_Eg1(){
        assertThat(calculator.fibonacci(-1)).isEqualTo(1);
    }
    @Test
    public void TestFibonacciNegative_Eg2(){
        assertThat(calculator.fibonacci(-6)).isEqualTo(1);
    }

    @Test
    public void TestFibonacciBase_Zero(){
        assertThat(calculator.fibonacci(0)).isEqualTo(0);
    }

    @Test
    public void TestFibonacciBase_One(){
        assertThat(calculator.fibonacci(1)).isEqualTo(1);
    }

    @Test
    public void TestFibonacciFirstLoopCase(){
        assertThat(calculator.fibonacci(2)).isEqualTo(1);
    }

    @Test
    public void TestFibonacciNormalValidCase_1(){
        assertThat(calculator.fibonacci(3)).isEqualTo(2);
    }

    @Test
    public void TestFibonacciNormalValidCase_2() {
        assertThat(calculator.fibonacci(4)).isEqualTo(3);
    }

    @Test
    public void TestFibonacciNormalValidCase_3(){
        assertThat(calculator.fibonacci(5)).isEqualTo(5);
    }

    @Test
    public void TestFibonacciMediumValue() {
        assertThat(calculator.fibonacci(11)).isEqualTo(89);
    }

    @Test
    public void TestFibonacciLargeValue(){
        assertThat(calculator.fibonacci(20)).isEqualTo(6765);
    }

    @Test
    public void TestFibonacciOverflowBoundarySafe(){
        assertThat(calculator.fibonacci(46)).isEqualTo(1836311903);
    }

    @Test
    public void TestFibonacciOverflowStarts(){
        assertThat(calculator.fibonacci(47)).isNegative(); //int can not hold the 47 and above
    }
}