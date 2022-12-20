package L9.E1;

public class BigDog extends Dog{
    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Wooow");
    }

    public void greets(Dog anotherDog) {
        System.out.println("WooooooW");
    }


    public void greets(BigDog anotherBigDog) {
        System.out.println("WoooooooooW");
    }
}
