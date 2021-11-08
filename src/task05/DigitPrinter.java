package task05;

import java.util.Scanner;

/*Napisz program, który pobierze od użytkownika liczbę (typu int),
a następnie wypisze w jednej linijce wszystkie liczby od danej liczby do zera (włącznie).
Zwróć uwagę, że liczba może być zerem lub ujemna.

Przykładowe wyniki działania:

dla podanej liczby 5, program wypisze 5 4 3 2 1 0
dla podanej liczby 0, program wypisze 0
dla podanej liczby -4, program wypisze -4 -3 -2 -1 0*/
public class DigitPrinter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        if (input > 0) {
            for (int i = input; i >= 0; i--) {
                System.out.println(i);
            }
        } else if (input < 0) {
            for (int i = input; i <= 0; i++ ) {
                System.out.println(i);
            }
        } else {
            System.out.println("0");
        }
    }
}
