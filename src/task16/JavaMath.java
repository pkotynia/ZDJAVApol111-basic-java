package task16;

import task17.Dog;

/*Napisz program, który wczyta dwie wartości zmiennoprzecinkowe i wykona działania

1. Wskaż mniejszą liczbę
2. Wskaż większą liczbę
3. Obliczy wartość bezwzględną
4. Wskaż znak
5. Oblicz zaokrąglenie
6. Oblicz potęgę
7. Oblicz pierwiastek kwadratowy
8. Oblicz logarytm dziesiętny i naturalny

 */
public class JavaMath {

    public static void main(String[] args) {

        int a = -15;
        int b = 9;

        System.out.println("Math.min(a,b) = " + Math.min(a, b));
        System.out.println("Math.max(a,b) = " + Math.max(a, b));

        System.out.println("Math.abs(a) = " + Math.abs(a));

        System.out.println("Math.signum(a) = " + Math.signum(a));
        System.out.println("Math.signum(b) = " + Math.signum(b));

        double c = 2.4f;

        System.out.println("Math.round(c) = " + Math.round(c));
        System.out.println("Math.ceil(c) = " + Math.ceil(c));
        System.out.println("Math.floor(c) = " + Math.floor(c));

        System.out.println("Math.pow(a, b) = " + Math.pow(a, b));
        System.out.println("Math.sqrt(a) = " + Math.sqrt(b));

        System.out.println("Math.log(b) = " + Math.log(b));
        System.out.println("Math.log10(b) = " + Math.log10(b));

    }
}
