package L6.E1;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String toString() {
        return String.format("Animal[name:\"%s\"]", getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
