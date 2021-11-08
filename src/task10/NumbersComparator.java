package task10;

import java.util.Arrays;
import java.util.Scanner;

/*Napisz program, który pobierze od użytkownika dwa razy po pięć liczb (dziesięć zmiennych typu int),
a następnie wypisze tylko te z nich, które wystąpiły zarówno w pierwszej piątce, jak i w drugiej piątce liczb.

Dla uproszczenia załóż, że wśród jednej piątki, liczby nie będą się powtarzały.
Liczby wypisz w kolejności takiej, w jakiej pojawiły się w pierwszej piątce liczb.*/
public class NumbersComparator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] first5Digits = get5DigitsFromInput(scanner);

        int[] second5Digits = get5DigitsFromInput(scanner);

        for (int firstDigit : first5Digits) {
            for (int secondDigit : second5Digits) {
                if (firstDigit == secondDigit){
                    System.out.println(firstDigit);
                    break;
                }
            }
        }
    }

    private static int[] get5DigitsFromInput(Scanner scanner) {
        int[] digits = new int[5];
        for (int i = 0; i < 5; i++) {
            digits[i] = scanner.nextInt();
        }
        return digits;
    }

}
