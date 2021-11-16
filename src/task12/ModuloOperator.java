package task12;
/*
* Napisz program, który wczyta dwie dodanie liczby całkowite (typu int) i
* zwróci resztę z dzielenia liczby większej przez liczbę mniejszą.

Uwaga! W ramach utrudnienia, Twój program NIE może używać operacji modulo (%) ani operacji dzielenia (/).*/
public class ModuloOperator {

    public static void main(String[] args) {

        var a = 24;
        var b = 5;

        System.out.println("expected = " + (a%b));
        System.out.println("actual using simple modulo = " +  moduloSimpleSolution(a, b));
        System.out.println("actual using sophisticated modulo= " + moduloMoreSophisticatedSolution(a, b));

    }

    private static int moduloMoreSophisticatedSolution(int a, int b) {
        var intermediateResult = b;
        for (int i = 1; intermediateResult <= a - b; i++) {
            intermediateResult = b * i;
        }
        return a - intermediateResult;
    }

    private static int moduloSimpleSolution(int a, int b) {
        while (a >= b) {
            a = a - b;
        }
        return a;
    }
}
