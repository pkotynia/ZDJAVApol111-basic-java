package task17;
/*Stwórz kalsę Dog, która będzie miała
* stan - imie psa
* zachowanie - metodę machanie ogonem
*
* po wywołaniu metody na ekranie wyświetli się:
* [imię psa] mecha ogonem */

public class Playground {

    public static void main(String[] args) {

        final Dog burek = new Dog("Burek", true);
        burek.wagTail();
        System.out.println("burek.isHasColar() = " + burek.isHasColar());

        Dog azor = new Dog("Azor");
        azor.wagTail();
        azor.setHasColar(true);
        System.out.println("azor.isHasColar() = " + azor.isHasColar());

        Dog laser = new Dog("Laser", true);
        laser.wagTail();

        System.out.println("laser.getGene() = " + laser.getGene());

        System.out.println("Dog.getCounter() = " + Dog.getCounter());

        //Code smell - may indicate that getCounter method is not static
        System.out.println("laser.getCounter() = " + laser.getCounter());

        Animal animal = new Animal("cat");
        System.out.println("animal = " + animal);

        Animal laserDog = laser;
        laserDog = null;

        if (laserDog != null) {
            laserDog.getGene();
        }

        if (laserDog instanceof Dog laserDogCasted) {
            laserDogCasted.wagTail();
        }

        System.out.println("laserDog = " + laserDog);

        //won't compile
        //Dog someDog = new Animal("dog");


        //Dog is an Animal is an Object




    }
}
