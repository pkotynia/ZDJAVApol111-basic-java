package task13;
/*
* Napisz program, który wczyta dodatnią liczbę całkowitą (int) i wypisze jej silnię.

Silnia liczby n jest równa: n! = 1 * 2 * ... * n

Przykłady:

5! = 1 * 2 * 3 * 4 * 5 = 120
3! = 1 * 2 * 3 = 6
* */
public class Factorial {

    public static void main(String[] args) {

        var result = recursiveFactorial(0);
        System.out.println("result = " + result);

        var secondResult = factorial(0);
        System.out.println("secondResult = " + secondResult);

    }
    //3! = 1 * 2 * 3 = 6
    //3*recursiveFactorial(2)
    //3*recursiveFactorial(2*recursiveFactorial(1))
    //3*recursiveFactorial(2*recursiveFactorial(1* recursiveFactorial(0)))
    private static long recursiveFactorial(long n) {
        return (n == 0) ? 1 : n * recursiveFactorial(n-1);
    }

    private static long factorial(long n) {
        var result = 1l;
        for (int i = 1; i <= n; i++) {
           result = result * i;
        }
        return result;
    }
}
