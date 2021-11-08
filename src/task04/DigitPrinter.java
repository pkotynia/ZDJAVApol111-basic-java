package task04;
/*wczyta od użytkownika liczbę początkową x (typu int)
wczyta od użytkownika liczbę końcową y (typu int)
Sprawdzi, czy liczba początkowa jest niewiększa od końcowej i czy obie liczby są z przedziału od 0 (włącznie) do 10 000 (włącznie).
Jeśli nie, program zakończy działanie.
Wypisze wszystkie liczby podzielne przez 7 z zadanego zakresu (od x włącznie do y włącznie).*/

import java.util.Scanner;

public class DigitPrinter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int last = scanner.nextInt();

        if (isNumberOutOfRange1to10000(first) || isNumberOutOfRange1to10000(last)){
            return;
        }

        if (first > last) {
            return;
        }

        while (first <= last ) {
            if (first%7 == 0) {
                System.out.println(first);
                first = first + 7;
            } else {
                System.out.println(first + " incrementing by one");
                first++;
            }
        }
    }

    private static boolean isNumberOutOfRange1to10000(int number) {
        if (number < 0 || number > 10_000) {
            System.out.println("ERROR! " + number +" is out of range 1 - 10000");
            return true;
        } else {
            return false;
        }
    }

}
