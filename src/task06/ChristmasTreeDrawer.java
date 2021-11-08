package task06;
/*
* Napisz program, który narysuje choinkę zgodnie ze wzorem poniżej.
* Wysokość choinki wczytaj z konsoli (dodatnia liczba całkowita).

Przykłady:

Choinka o wysokości 3:

  *
 ***
*****
  #
Choinka o wysokości 4:

   *
  ***
 *****
*******
   #
Pamiętaj, aby napisać kod w taki sposób, aby działał dla dowolnej niezerowej wartości wysokości choinki.
* Program powinien ją generować używając pojedynczych znaków, a nie zwracać gotowej choinki skopiowanej przez programistę!*/

import java.util.Scanner;

public class ChristmasTreeDrawer {

    public static void main(String[] args) {
        int sizeOfATree = getSizeOfATree();

        for (int i = sizeOfATree; i > 0; i--) {
            drawSpacesBeseOnHeigh(i);
            drawNumberOfAsterisks(2*(sizeOfATree - i));
            drawLineBreak();
        }
        //draw #
        drawTrunk(sizeOfATree);
    }

    private static int getSizeOfATree() {
        Scanner scanner = new Scanner(System.in);
        int sizeOfATree = scanner.nextInt();
        return sizeOfATree;
    }

    private static void drawTrunk(int sizeOfATree) {
        for (int i = 0; i < sizeOfATree; i++) {
            System.out.print(" ");
        }
        System.out.println("#");
    }

    private static void drawLineBreak() {
        System.out.println();
    }

    private static void drawNumberOfAsterisks(int numberOfAsterisks) {
        for (int ii = 0; ii <= numberOfAsterisks; ii++){
            System.out.print("*");
        }
    }

    private static void drawSpacesBeseOnHeigh(int i) {
        for (int ii = i; ii > 0; ii--) {
            System.out.print(" ");
        }
    }
}
