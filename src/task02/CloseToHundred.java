package task02;

import java.util.Scanner;

/*
Napisz program, który wczyta od użytkownika liczbę (typu int) i sprawdzi, czy liczba jest "blisko" wartości 100.
Mówimy, że liczba jest "blisko" wartości 100, jeśli różni się od 100 o nie więcej niż 10.

Program powinien wczytać jedną liczbę (typu int) i na ekran wypisać resultat
- false lub true, zgodnie z opisem powyżej.
* */
public class CloseToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = scanner.nextInt();

        if (result >= 90 && result <= 110) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
