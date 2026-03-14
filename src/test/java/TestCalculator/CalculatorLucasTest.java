package TestCalculator;

import static org.assertj.core.api.Assertions.assertThat;
import Calculator.Calculator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class CalculatorLucasTest {

    //if the Before method does not work
    Calculator calculator = new Calculator();

    //before each test method creates new calculator object
    @BeforeMethod
    public void setUP(){
        calculator = new Calculator();
    }

    @Test(priority = 1, groups = {"valid","base"})
    public void TestLucasBase_Zero(){
        assertThat(calculator.Lucas(0)).isEqualTo(2);
    }

    @Test(priority = 2, groups = {"valid","base"})
    public void TestLucasBase_One(){
        assertThat(calculator.Lucas(1)).isEqualTo(1);
    }

    @Test(priority = 3, groups = {"valid","normal"})
    public void TestLucasFirstLoopCase(){
        assertThat(calculator.Lucas(2)).isEqualTo(3);
    }

    @Test(priority = 4, groups = {"valid","normal"})
    public void TestLucasNormalValidCase_1(){
        assertThat(calculator.Lucas(3)).isEqualTo(4);
    }

    @Test(priority = 5, groups = {"valid","normal"})
    public void TestLucasNormalValidCase_2() {
        assertThat(calculator.Lucas(4)).isEqualTo(7);
    }

    @Test(priority = 6, groups = {"valid","normal"})
    public void TestLucasNormalValidCase_3(){
        assertThat(calculator.Lucas(5)).isEqualTo(11);
    }

    @Test(priority = 7, groups = {"valid","normal"})
    public void TestLucasMediumValue() {
        assertThat(calculator.Lucas(11)).isEqualTo(199);
    }

    @Test(priority = 8, groups = {"valid","normal"})
    public void TestLucasLargeValue(){
        assertThat(calculator.Lucas(20)).isEqualTo(15127);
    }

    @Test(priority = 9, groups = {"valid","boundary"})
    public void TestLucasOverflowBoundarySafe(){
        assertThat(calculator.Lucas(44)).isEqualTo(1568397607);
    }

    @Test(priority = 10, groups = {"valid","boundary"})
    public void TestLucasOverflowStarts(){
        assertThat(calculator.Lucas(45)).isNegative(); //int can not hold the 45 and above
    }

    @Test(priority = 11, groups = {"invalid"}, expectedExceptions = StackOverflowError.class)
    public void TestLucasNegative_Eg1(){
        calculator.Lucas(-1);
    }
    @Test(priority = 12, groups = {"invalid"}, expectedExceptions = StackOverflowError.class)
    public void TestLucasNegative_Eg2(){
        calculator.Lucas(-5);
    }

    @DataProvider(name = "lucasData")
    public Object[][] lucasTestData() {
        return new Object[][] {
                {0, 2},
                {1, 1},
                {2, 3},
                {3, 4},
                {4, 7},
                {5, 11},
                {11, 199},
                {20, 15127},
                {44, 1568397607}
        };
    }

    @Test(priority = 0, groups = {"valid"}, dataProvider = "lucasData")
    public void TestLucasWithDataProvider(int n, int expected) {
        assertThat(calculator.Lucas(n)).isEqualTo(expected);
    }

}
