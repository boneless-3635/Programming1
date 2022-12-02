package L6.E1;

public class Cat extends Mammal{
    public Cat(String name) {
        super(name);
    }

    public void greet() {
        System.out.println("Meow");
    }

    public String toString() {
        return String.format("Cat[%s]", super.toString());
    }
}
