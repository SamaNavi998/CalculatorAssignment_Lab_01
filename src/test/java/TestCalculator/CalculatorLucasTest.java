package TestCalculator;

import static org.assertj.core.api.Assertions.assertThat;
import Calculator.Calculator;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

public class CalculatorLucasTest {

    Calculator calculator;

    @BeforeMethod
    public void setUP(){
        calculator = new Calculator();
    }

    @Test(expectedExceptions = StackOverflowError.class)
    public void TestLucasNegative_Eg1(){
        calculator.Lucas(-1);
    }
    @Test(expectedExceptions = StackOverflowError.class)
    public void TestLucasNegative_Eg2(){
        calculator.Lucas(-5);
    }

    @Test
    public void TestLucasBase_Zero(){
        assertThat(calculator.Lucas(0)).isEqualTo(2);
    }

    @Test
    public void TestLucasBase_One(){
        assertThat(calculator.Lucas(1)).isEqualTo(1);
    }

    @Test
    public void TestLucasFirstLoopCase(){
        assertThat(calculator.Lucas(2)).isEqualTo(3);
    }

    @Test
    public void TestLucasNormalValidCase_1(){
        assertThat(calculator.Lucas(3)).isEqualTo(4);
    }

    @Test
    public void TestLucasNormalValidCase_2() {
        assertThat(calculator.Lucas(4)).isEqualTo(7);
    }

    @Test
    public void TestLucasNormalValidCase_3(){
        assertThat(calculator.Lucas(5)).isEqualTo(11);
    }

    @Test
    public void TestLucasMediumValue() {
        assertThat(calculator.Lucas(11)).isEqualTo(199);
    }

    @Test
    public void TestLucasLargeValue(){
        assertThat(calculator.Lucas(20)).isEqualTo(15127);
    }

    @Test
    public void TestLucasOverflowBoundarySafe(){
        assertThat(calculator.Lucas(44)).isEqualTo(1568397607);
    }

    @Test
    public void TestLucasOverflowStarts(){
        assertThat(calculator.Lucas(45)).isNegative(); //int can not hold the 45 and above
    }

}
