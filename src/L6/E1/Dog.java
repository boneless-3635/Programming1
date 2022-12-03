package L6.E1;

public class Dog extends Mammal{
    public Dog(String name) {
        super(name);
    }

    public void greet() {
        System.out.println("Woof");
    }

    public void greet(Dog AnoDog) {
        System.out.println("Woooof " + AnoDog.getName());
    }

    public String toString() {
        return String.format("Dog[%s]", super.toString());
    }


}
