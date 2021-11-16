package task14;
/*
* Zaimplementuj metodę, która przyjmuje dowolną liczbę wartości całkowitych (int) jako argument
* i zwróci ich średnią arytmetyczną (typu float).

Nie modyfikuj kodu metody main - dopisz jedynie metodę calculateAverage.*/
public class AverageCalculator {

    public static void main(String[] args) {
        float result = calculateAverage(1,2);
        System.out.println("result = " + result);
    }

    private static float calculateAverage(int... numbers) {
        if (numbers.length == 0){
            return 0.0f;
        }
        var result = 0.0f;
        for (int number : numbers) {
            result = result + number;
        }
        return result / numbers.length;
    }
}
