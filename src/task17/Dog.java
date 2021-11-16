package task17;

public class Dog extends Animal {

    static private int counter = 0;

    private final String name;
    private boolean hasColar;

    public void wagTail() {
        System.out.println(name + " wag a tail");
    }

    public Dog(String name, boolean hasColar) {
        this(name);
        this.hasColar = hasColar;
    }

    public Dog(String name){
        super("dog");
        this.name = name;
        counter++;
    }

    public void setHasColar(boolean hasColar) {
        this.hasColar = hasColar;
    }

    public boolean isHasColar() {
        return hasColar;
    }

    public String getName() {
        return name;
    }

    public static int getCounter() {
        return counter;
    }
}
