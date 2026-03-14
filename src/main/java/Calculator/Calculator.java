package Calculator;

public class Calculator {

    public int addition(int x, int y)
    {
        return x + y;
    }
    public int subtraction(int x, int y)
    {
        return x - y;
    }
    public int multiplication(int x, int y)
    {
        return x * y;
    }
    public int division(int x, int y)
    {
        int solution = x / y;
        return solution;
    }

    public int fibonacci(int n)
    {
        int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++)
        {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public int Lucas(int n) {
        if (n == 0)
            return 2;
        if (n == 1)
            return 1;

        return Lucas(n - 1) + Lucas(n - 2);
    }
}
