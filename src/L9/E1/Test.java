package L9.E1;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("DogName");
        Dog dog2 = new Dog("DogName2");

        Cat cat = new Cat("CatName");

        BigDog bigDog = new BigDog("BigDogName");
        BigDog bigDog2 = new BigDog("BigDogName2");

        dog.greets();
        dog.greets(dog2);

        cat.greets();

        bigDog.greets();
        bigDog2.greets(dog);
        bigDog2.greets(bigDog);
    }
}
