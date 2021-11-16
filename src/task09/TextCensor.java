package task09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** Napisz program, który wczyta tekst od użytkownika i "wykropkuje" znalezione w nim przekleństwa.
 Znalezione przekleństwa powinny zostać zastąpione trzema gwiazdkami (***).
Dla uproszczenia przyjmij, że przekleństwa zawsze będą pisane małymi literami.

Przekleństwa to:
 kurka wodna, motyla noga, psiakrew.

Przykładowo, tekst:

Znów się nie kompiluje, motyla noga!

zamieni się na:

Znów się nie kompiluje, ***!
* */
public class TextCensor {

    public static void main(String[] args) {

        var input = "Znów się nie kompiluje, wtf!";

        String[] curses = {
                "kurka wodna",
                "motyla noga",
                "psiakrew",
        };

        System.out.println("Available curses " + Arrays.toString(curses));

        for (String curse : curses) {
            input = input.replace(curse, "***");
        }

        System.out.println(input);
    }
}
