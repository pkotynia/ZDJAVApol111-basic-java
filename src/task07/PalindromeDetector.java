package task07;
/*
* Napisz program, który wczyta od użytkownika tekst (zmienna typu String)
* i sprawdzi, czy podany tekst jest palindromem. Program powinien wypisać wartość true lub false.

Palindromem nazywamy tekst, który brzmi tak samo czytany od lewej i od prawej. Nie ma znaczenia wielkośc liter ani odstępy.

Palindromem jest na przykład zdanie: Kobyła ma mały bok.*/
public class PalindromeDetector {

    public static void main(String[] args) {

        String input = "Kobyła ma mały bok";

        input = input.toLowerCase().replace(" ", "");

        System.out.println(input);

        boolean result = checkIfStringIsPalindromeRecursively(input);
        System.out.println(result);

    }

    private static boolean checkIfStringIsPalindromeRecursively(String input) {
        if(input.length() <= 1){
            return true;
        }
        if (input.charAt(0) == input.charAt(input.length()-1)) {
            String inputWithoutFirstAndLastChar = input.substring(1, input.length()-1);
            System.out.println(inputWithoutFirstAndLastChar);
            return checkIfStringIsPalindromeRecursively(inputWithoutFirstAndLastChar);
        } else {
            return false;
        }
    }
}
