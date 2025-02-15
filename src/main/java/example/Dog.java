package example;

public class Dog {
    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.println(name + " says: Gaf Gaf!");
    }
}
