package task08;

/*Napisz program, który wczyta od użytkownika tekst (zmienna typu String)
i zamieni litery spośród trzech ostatnich znaków tekstu na wielkie litery.

Jeśli tekst jest krótszy niż 3 znaki, to program powinien zamienić wszystkie wczytane litery.

Przykład:

Ala ma kota -> Ala ma kOTA
Ala ma kota:) -> Ala ma kotA:)
ok -> OK*/
public class Last3LettersCapitalize {

    public static void main(String[] args) {

//        var input = "ok";
        var input = "Ala ma kota";

        var result = capitalizeLast3Chars(input);

        System.out.println(result);
    }

    private static String capitalizeLast3Chars(String input) {
        if (input.length() <= 3) {
            return input.toUpperCase();
        } else {
            return getFirstPartOfInput(input) + getLast3CharsCapitalized(input);
        }
    }

    private static String getFirstPartOfInput(String input) {
        return input.substring(0, input.length() - 3);
    }

    private static String getLast3CharsCapitalized(String input) {
        return input.substring(input.length() - 3).toUpperCase();
    }
}
