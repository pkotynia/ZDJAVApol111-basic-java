package task03;

import java.util.stream.IntStream;

/*Napisz program, który wypisze wszystkie wielkie litery alfabetu łacińskiego w kolejności alfabetycznej.
Każda litera powinna być wypisana w kolejnym wierszu.*/
public class AToZPrinter {

    public static void main(String[] args) {

//        int five = 5;
//        int six = five++;
//        System.out.println(six);
//        System.out.println(five);

        System.out.println("For loop");
        for(char i = 65; i <= 90 ; ++i) {
            System.out.println(i);
        }

        System.out.println("while loop");
        int index = 65;
        while (index <= 90) {
            System.out.println((char) index);
            index++;
        }

        System.out.println("do while loop");
        index = 65;
        do {
            System.out.println((char) index);
            index++;
        } while (index <= 90);

        System.out.println("Stream forEach");
        IntStream.rangeClosed(65,90)
                .forEach(capitalLetter -> System.out.println((char) capitalLetter));

    }
}
