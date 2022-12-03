package L6.E1;

public class Test1 {
    public static void main(String[] args) {
        Dog myDog = new Dog("Joe");
        Dog myDog2 = new Dog("Ham");
        Cat myCat = new Cat("F");

        myDog.greet();
        myDog.greet(myDog2);
        myCat.greet();
        System.out.println(myDog);

    }
}
