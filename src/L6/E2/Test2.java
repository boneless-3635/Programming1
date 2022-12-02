package L6.E2;

public class Test2 {
    public static void main(String[] args) {
        Student stu1 = new Student("John", "123 John Street", "John studies", 2022, 10000);
        Staff staff1 = new Staff("Alex", "5663 Alexander Rd", "Art school", 100);

        System.out.println(stu1);
        System.out.println(staff1);
    }
}
