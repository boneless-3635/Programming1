package L9.E1;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void greets();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
